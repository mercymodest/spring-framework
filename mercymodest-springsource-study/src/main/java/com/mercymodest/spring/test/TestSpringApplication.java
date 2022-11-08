package com.mercymodest.spring.test;

import com.mercymodest.spring.bean.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 11-08 22:10
 */
public class TestSpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
		Book book = applicationContext.getBean(Book.class);
		System.out.println(book);
	}
}
