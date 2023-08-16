package com.mercymodest.study.mvc.service;

import org.springframework.stereotype.Service;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/08/11
 */
@Service
public class HelloService {

	public HelloService() {
		System.out.println("HelloService constructor");
	}

	public String sayHello() {
		return "Hello, Spring MVC";
	}
}
