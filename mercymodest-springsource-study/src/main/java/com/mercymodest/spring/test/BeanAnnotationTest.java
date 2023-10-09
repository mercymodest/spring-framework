package com.mercymodest.spring.test;

import lombok.Data;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * {@link org.springframework.context.annotation.Bean} 注解测试
 * </pre>
 *
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 10-10 0:19
 */
public class BeanAnnotationTest {

	@Data
	static class User {

		public User() {
			System.out.println("User constructor");
		}

		private Integer id;

		private String name;
	}

	@Configuration
	static class ContextConfiguration {
		@Bean
		public User user() {
			User user = new User();
			user.setId(1);
			user.setName("MercyModest");
			return user;
		}

	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ContextConfiguration.class);
		User user = annotationConfigApplicationContext.getBean(User.class);
		System.out.println(user);
	}
}
