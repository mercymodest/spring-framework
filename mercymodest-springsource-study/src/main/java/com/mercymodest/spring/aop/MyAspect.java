package com.mercymodest.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 *  Aspect 测试切面
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/06/12
 */
@Aspect
@Component
public class MyAspect {

	public MyAspect() {
		System.out.println("MyAspect constructor");
	}

	@Before("execution(* com.mercymodest.spring.aop.Car.doSomething(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("Before method:" + joinPoint.getSignature());
	}

	@After("execution(* com.mercymodest.spring.aop.Car.doSomething(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("After method:" + joinPoint.getSignature());
	}

	@AfterReturning(value = "execution(* com.mercymodest.spring.aop.Car.doSomething(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		System.out.println("After returning method:" + joinPoint.getSignature());
		System.out.println("Result: " + result);
	}

	@AfterThrowing(value = "execution(* com.mercymodest.spring.aop.Car.doSomething(..))", throwing = "error")
	public void afterThrowing(JoinPoint joinPoint, Throwable error) {
		System.out.println("After throwing method:" + joinPoint.getSignature());
		System.out.println("Error: " + error);
	}

	@Around("execution(* com.mercymodest.spring.aop.Car.doSomething(..))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Around method:" + joinPoint.getSignature());

		long start = System.currentTimeMillis();

		// 执行目标方法
		Object result = joinPoint.proceed();

		long end = System.currentTimeMillis();
		System.out.println("Around method Time taken: " + (end - start) + " ms");

		return result;
	}
}
