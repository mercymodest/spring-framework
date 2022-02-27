package com.mercymodest.spring.application;

import com.mercymodest.spring.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 2022/02/28
 */
public class ApplicationTest {

	@Test
	public void testSpringApplication() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
		System.out.println(applicationContext.getBean(Person.class));
	}
}
