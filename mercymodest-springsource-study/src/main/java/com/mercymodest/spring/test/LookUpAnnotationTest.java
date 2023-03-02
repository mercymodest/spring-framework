package com.mercymodest.spring.test;

import com.mercymodest.spring.bean.Cat;
import com.mercymodest.spring.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * {@link org.springframework.beans.factory.annotation.Lookup}
 *
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 02-13 21:03
 */
public class LookUpAnnotationTest {

	//@Import(StudentFactoryBean.class)
	@ComponentScan(value = {"com.mercymodest.spring"})
	@Configuration
	static class ApplicationConfiguration {

	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Person person1 = applicationContext.getBean(Person.class);
		Person person2 = applicationContext.getBean(Person.class);
		System.out.println(person1 == person2);
		Cat cat1 = person1.getCat();
		Cat cat2 = person2.getCat();
		System.out.printf("cat1= %s %n",cat1);
		System.out.printf("cat2= %s %n",cat2);
		System.out.println(cat1 == cat2);
	}
}
