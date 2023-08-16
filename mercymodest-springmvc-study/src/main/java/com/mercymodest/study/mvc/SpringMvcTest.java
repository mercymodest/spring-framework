package com.mercymodest.study.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 08-03 2:43
 */
public class SpringMvcTest {

}


@ComponentScan("com.mercymodest.study.mvc.controller")
@Configuration
class MyWebMvcConfigurer implements WebMvcConfigurer{

}

//class MyWebApplicationInitializer implements WebApplicationInitializer {
//
//	public MyWebApplicationInitializer() {
//		System.out.println("MyWebApplicationInitializer constructor");
//	}
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		// Load Spring web application configuration
//		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
//		ac.register(MyWebMvcConfigurer.class);
//		ac.refresh();
//
//		// Create and register the DispatcherServlet
//		DispatcherServlet servlet = new DispatcherServlet(ac);
//		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
//		registration.setLoadOnStartup(1);
//		registration.addMapping("/app/*");
//	}
//}


