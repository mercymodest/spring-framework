package com.mercymodest.study.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 08-03 2:48
 */
@RestController
public class HelloController {

	public HelloController() {
		System.out.println("HelloController constructor");
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello"+ DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(java.time.LocalDateTime.now());
	}
}
