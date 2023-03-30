package com.mercymodest.spring.test;

import com.mercymodest.spring.bean.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  测试 Spring 后置处理器
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 03-26 12:15
 */
public class SpringPostProcessorTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-post-processor.xml");
		Cat cat = applicationContext.getBean(Cat.class);
		System.out.println(cat);
	}
}
