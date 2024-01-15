package com.mercymodest.spring.messagesource;

import org.springframework.context.support.AbstractMessageSource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 01-15 22:17
 */
public class DynamicReloadMessageSource extends AbstractMessageSource{

	private final String  resourcePath;

	private final String encoding;

	private final ResourceLoader resourceLoader;

	private final Properties messagesProperties;

	private final ExecutorService executorService;

	private  WatchService watchService;

	private  Resource  resource;

	public DynamicReloadMessageSource(String resourcePath, String encoding,ResourceLoader resourceLoader) {
		if (!StringUtils.hasText(encoding)) {
			// UTF-8
			encoding = StandardCharsets.UTF_8.name();
		}
		this.encoding=encoding;
		if (!StringUtils.hasText(resourcePath)) {
			throw new IllegalArgumentException("resourcePath must not be empty");
		}
		if (Objects.nonNull(resourceLoader)) {
			this.resourceLoader = resourceLoader;
		} else {
			this.resourceLoader = new DefaultResourceLoader();
		}
		this.resourcePath=resourcePath;
		this.messagesProperties = loadMessagesProperties();
		this.executorService = Executors.newSingleThreadExecutor();
		onMessageResourceFileChanged();
	}

	private void onMessageResourceFileChanged() {
			initResourceFileWatchService();
			processingMessageFileChanged();
	}

	private void initResourceFileWatchService() {
		try {
			FileSystem fileSystem = FileSystems.getDefault();
			WatchService watchService = fileSystem.newWatchService();
			File resouceFile = resource.getFile();
			if (resouceFile.isFile()) {
				String parent = resouceFile.getParent();
				Paths.get(parent).register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
				this.watchService=watchService;
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	protected void processingMessageFileChanged() {
		executorService.submit(()->{
			while (true){
				WatchKey watchKey=watchService.take();
				try {
					if (watchKey.isValid()) {
						for (WatchEvent<?> pollEvent : watchKey.pollEvents()) {
							Watchable watchable = watchKey.watchable();
							if (watchable instanceof Path) {
								Path parentPath = (Path) watchable;
								Object context = pollEvent.context();
								if (context instanceof Path) {
									// 相对路径
									Path changeFileRelativePath = (Path) context;
									// 通过 父Path 解析成变更文件的路径
									Path changePath = parentPath.resolve(changeFileRelativePath);
									File file = changePath.toFile();
									if (!file.isFile()) {
										continue;
									}
									Properties properties = loadMessagesProperties(new FileReader(file));
									synchronized (messagesProperties) {
										messagesProperties.clear();
										messagesProperties.putAll(properties);
									}
								}
							}
						}
					}
				}
				finally {
					if (Objects.nonNull(watchKey)) {
						boolean reset = watchKey.reset();
						if (!reset) {
							System.err.println("watchKey reset failed");
							initResourceFileWatchService();
						}
					}
				}
			}
		});
	}

	private Properties loadMessagesProperties() {
		try {
			ResourceLoader currentResourceLoader = getResourceLoader();
			Resource resource = currentResourceLoader.getResource(resourcePath);
			this.resource=resource;
			EncodedResource encodedResource = new EncodedResource(resource, encoding);
			return loadMessagesProperties(encodedResource.getReader());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private Properties loadMessagesProperties(Reader reader){
		try {
			Properties properties = new Properties();
			properties.load(reader);
			return properties;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}finally {
			if (Objects.nonNull(reader)) {
                try {
                    reader.close();
                } catch (Exception e) {
					// ignored
                }
            }
		}
	}

	@Override
	protected MessageFormat resolveCode(String code, Locale locale) {
		if (StringUtils.hasText(code)) {
			String message = messagesProperties.getProperty(code);
			if (StringUtils.hasText(message)) {
				return new MessageFormat(message, locale);
			}
		}
		return null;
	}

	public ResourceLoader getResourceLoader() {
		return resourceLoader;
	}

	public static void main(String[] args) {
		try {
			final String filePath="/META-INF/messages.properties";
			DynamicReloadMessageSource dynamicReloadMessageSource = new DynamicReloadMessageSource(filePath, StandardCharsets.UTF_8.name(), null);
			while (true){
				String message = dynamicReloadMessageSource.getMessage("name", new Object[]{}, Locale.getDefault());
				System.out.printf("name message: %s\n", message);
				TimeUnit.SECONDS.sleep(1);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
