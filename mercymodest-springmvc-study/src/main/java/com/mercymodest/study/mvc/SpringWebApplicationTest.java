package com.mercymodest.study.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/08/11
 */
public class SpringWebApplicationTest {

	@ComponentScan(basePackages = {"com.mercymodest.study.mvc"},excludeFilters = {@ComponentScan.Filter(classes = {Controller.class})})
	@Configuration
	static class RootApplicationConfig{

	}

	@ComponentScan(basePackages = {"com.mercymodest.study.mvc.controller"},useDefaultFilters = false,includeFilters = {@ComponentScan.Filter(classes = {Controller.class})})
	@Configuration
	static class WebApplicationConfig{

	}
	static class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
		public WebApplicationInitializer() {
			System.out.println("WebApplicationInitializer constructor");
		}

		@Override
		protected Class<?>[] getRootConfigClasses() {
			return new Class[]{RootApplicationConfig.class};
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			return new Class[]{WebApplicationConfig.class};
		}

		@Override
		protected String[] getServletMappings() {
			return new String[]{"/app/*"};
		}
	}
}
