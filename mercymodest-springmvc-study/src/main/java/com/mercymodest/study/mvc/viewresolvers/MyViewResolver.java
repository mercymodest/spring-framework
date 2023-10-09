package com.mercymodest.study.mvc.viewresolvers;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 09-07 0:00
 */
@Component
public class MyViewResolver implements ViewResolver {
	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		return null;
	}
}
