package com.mercymodest.spring.instantiation;

import lombok.SneakyThrows;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/10/19
 */
public class SpringInstantiationTest {

	static class UserFactoryBean implements FactoryBean<User> {

		@Override
		public User getObject() throws Exception {
			return new User().setId(3).setName("user by  factory bean");
		}

		@Override
		public Class<?> getObjectType() {
			return User.class;
		}
	}

	@SneakyThrows
	public static void main(String[] args) {
		final String location = "classpath:META-INF/instantiation/spring-bean-instantiation.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(location);
		AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
		System.out.println(applicationContext.getBeansOfType(DefaultUserFactory.class));
		autowireCapableBeanFactory.createBean(DefaultUserFactory.class);
		System.out.println(applicationContext.getBeansOfType(DefaultUserFactory.class));
		//instantiationByXmlConfigurationMetaData(applicationContext);
		//javaServiceLoad();
		//ServiceLoader<UserFactory> serviceLoader = applicationContext.getBean(ServiceLoader.class);
		//System.out.println(serviceLoader.iterator().next().createUser());

	}

	private static void javaServiceLoad() {
		ServiceLoader<UserFactory> userFactories = ServiceLoader.load(UserFactory.class);
		Iterator<UserFactory> iterator = userFactories.iterator();
		while (iterator.hasNext()) {
			UserFactory userFactory = iterator.next();
			System.out.println(userFactory.createUser());
		}
	}

	private static void instantiationByXmlConfigurationMetaData(ApplicationContext applicationContext) {
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
		Object userFactoryBean = applicationContext.getBean("userFactoryBean");
		System.out.println(userFactoryBean);
		Object userFactoryBeanSelf = applicationContext.getBean("&userFactoryBean");
		System.out.println(userFactoryBeanSelf);
	}
}
