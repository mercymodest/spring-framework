package com.mercymodest.study.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
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

	@GetMapping("/hello")
	public String hello(String name, @RequestParam(value = "account") String account, HttpSession session) {
		session.setAttribute("info",String.format("Hello,%s,your account is %s time: %s", name, account, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now())));
		return "/";
	}
}
