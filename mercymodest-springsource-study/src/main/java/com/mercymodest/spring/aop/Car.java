package com.mercymodest.spring.aop;

import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/06/12
 */
@ToString
@Component
public class Car {


	public Car() {
		System.out.println("Car no args constructor");
	}

	private Long id;

	private String carName;

	public void  doSomething(){
		System.out.println("Car do something");
	}
}
