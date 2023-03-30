package com.mercymodest.spring.test;

import com.mercymodest.spring.bean.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 03-30 21:07
 */
public class SpringBeanTest {

	@ComponentScan(value = {"com.mercymodest.spring.bean","com.mercymodest.spring.factory"})
	@Configuration
	public static class SpringConfig{

	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(applicationContext.getBean(Cat.class));
	}
}
