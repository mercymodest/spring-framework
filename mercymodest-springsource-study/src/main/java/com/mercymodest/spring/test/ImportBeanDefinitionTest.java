package com.mercymodest.spring.test;

import com.mercymodest.spring.bean.Book;
import com.mercymodest.spring.bean.Cat;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 02-13 20:42
 */
public class ImportBeanDefinitionTest {


	/**
	 * {@link ImportBeanDefinitionRegistrar} 示例
	 */
	@Import({Book.class, CatImportBeanDefinitionRegistrar.class})
	@Configuration
	static class ApplicationConfiguration {

	}

	static class CatImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
			RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
			rootBeanDefinition.setBeanClass(Cat.class);
			rootBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
			registry.registerBeanDefinition("cat", rootBeanDefinition);
		}
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		System.out.println(applicationContext.getBean(Cat.class) == applicationContext.getBean(Cat.class));
	}
}
