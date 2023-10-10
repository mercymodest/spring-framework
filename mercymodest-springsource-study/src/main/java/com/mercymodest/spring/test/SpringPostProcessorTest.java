package com.mercymodest.spring.test;

import com.mercymodest.spring.bean.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 测试 Spring 后置处理器
 *
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 03-26 12:15
 */
public class SpringPostProcessorTest {

	@Import(Cat.class)
	@ComponentScan("com.mercymodest.spring.process.bean")
	@Configuration
	static class ContextConfiguration {

	}

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-post-processor.xml");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ContextConfiguration.class);
		Cat cat = applicationContext.getBean(Cat.class);
		System.out.println(cat);
	}
}
