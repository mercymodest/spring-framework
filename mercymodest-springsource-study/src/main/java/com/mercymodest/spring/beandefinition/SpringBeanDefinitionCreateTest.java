package com.mercymodest.spring.beandefinition;

import com.mercymodest.spring.bean.Cat;
import com.mercymodest.spring.bean.SuperCat;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/10/19
 */
public class SpringBeanDefinitionCreateTest {

	@Configuration
	static class ApplicationConfig {

		@Bean(name = {"annotatedSuperCat", "superCat12", "superCat13"})
		public SuperCat superCat() {
			SuperCat superCat = new SuperCat()
					.setSuperName("super name of cat");
			superCat.setId(123L)
					.setName("name of cat");
			return superCat;
		}
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		// 1. 通过 BeanDefinitionBuilder 构建
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(Cat.class)
				.addPropertyValue("id", "99")
				.addPropertyValue("name", "cat name ")
				.getBeanDefinition();
		applicationContext.registerBeanDefinition("cat", beanDefinition);
		System.out.println("before applicationContext refresh");
		AnnotatedGenericBeanDefinition annotatedGenericBeanDefinition = new AnnotatedGenericBeanDefinition(SuperCat.class);
		MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
		mutablePropertyValues.add("id", "111")
				.add("name", "super cat name")
				.add("superName", "super cat super name");
		annotatedGenericBeanDefinition.setPropertyValues(mutablePropertyValues);
		applicationContext.registerBeanDefinition("superCat", annotatedGenericBeanDefinition);
		//applicationContext.refresh();
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}
}
