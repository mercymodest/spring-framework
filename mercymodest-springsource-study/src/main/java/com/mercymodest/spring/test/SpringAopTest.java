package com.mercymodest.spring.test;

import com.mercymodest.spring.aop.Car;
import com.mercymodest.spring.aop.MyBeanPostProcessor;
import org.springframework.context.annotation.*;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/06/12
 */
public class SpringAopTest {

	@Import(value = {MyBeanPostProcessor.class})
	@ComponentScan(value = "com.mercymodest.spring.aop")
	@EnableAspectJAutoProxy
	@Configuration
	static class  AopTestConfiguration{

	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AopTestConfiguration.class);
		Car car = annotationConfigApplicationContext.getBean(Car.class);
		car.doSomething();
	}
}
