package com.mercymodest.study.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 08-16 23:05
 */
@Controller("/simple/http")
public class SimpleHttpRequestHandler implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("Hello HttpRequestHandler");
	}
}
