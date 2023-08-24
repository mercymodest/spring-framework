package com.mercymodest.study.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.format.DateTimeFormatter;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 08-03 2:48
 */
@Controller
public class HelloController {

	public HelloController() {
		System.out.println("HelloController constructor");
	}

	@ResponseBody
	@GetMapping("/hello")
	public String hello() {
		return String.format("Hello.This time is %s", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(java.time.LocalDateTime.now()));
	}


	@GetMapping("/index")
	public String index(String name,HttpSession session) {
		session.setAttribute("info",String.format("Hello %s.This time is %s",name, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(java.time.LocalDateTime.now())));
		return "index";
	}
}
