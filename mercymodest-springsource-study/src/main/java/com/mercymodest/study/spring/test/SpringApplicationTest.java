package com.mercymodest.study.spring.test;

import com.mercymodest.study.spring.pojo.Book;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @created 2022/11/09
 */
public class SpringApplicationTest {

	public static void main(String[] args) {
		// 定义资源
		Resource resource = new ClassPathResource("spring-bean.xml");
		// 创建 spring bean 工厂
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		// 创建 BeanDefinitionReader
		BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		// 加载 beanDefinition
		beanDefinitionReader.loadBeanDefinitions(resource);
		Book book = (Book) defaultListableBeanFactory.getBean("book");
		System.out.println(book);
	}
}
