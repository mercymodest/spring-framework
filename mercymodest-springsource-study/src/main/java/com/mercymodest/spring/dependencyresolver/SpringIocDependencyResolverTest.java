package com.mercymodest.spring.dependencyresolver;

import com.mercymodest.spring.bean.Cat;
import com.mercymodest.spring.bean.SuperCat;
import com.mercymodest.spring.instantiation.User;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 11-13 23:16
 */
public class SpringIocDependencyResolverTest {


	@Lazy
	@Autowired
	private Cat cat;

	@Autowired
	private ObjectProvider<SuperCat> superCatProvider;



	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringIocDependencyResolverTest.class);
		SpringIocDependencyResolverTest springIocDependencyResolverTest = annotationConfigApplicationContext.getBean(SpringIocDependencyResolverTest.class);
		System.out.println(springIocDependencyResolverTest);
		SuperCat superCat = springIocDependencyResolverTest.superCatProvider.getIfAvailable();
		System.out.println(superCat);
		System.out.println(springIocDependencyResolverTest.cat);
	}



	@Bean
	public User user() {
		return new User()
				.setId(1)
				.setName("user01");
	}

	@Bean
	public Cat cat(){
		return new Cat()
				.setId(11L)
				.setName("cat11");
	}

	@Bean
	public SuperCat superCat(Cat cat){
		return new SuperCat(cat).setSuperName("superCat22");
	}
}
