package com.mercymodest.study.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 08-16 22:13
 */
@org.springframework.stereotype.Controller("/simple")
public class SimpleController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter writer = response.getWriter();
		writer.write(String.format("Hello, %s %s", request.getParameter("name"), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(java.time.LocalDateTime.now())));
		writer.close();
		return null;
	}
}
