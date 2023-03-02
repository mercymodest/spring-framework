package com.mercymodest.spring.process.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 03-03 0:20
 */
@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

	public MySmartInstantiationAwareBeanPostProcessor() {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.MySmartInstantiationAwareBeanPostProcessor");
	}

	@Override
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.predictBeanType");
		return null;
	}

	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.getEarlyBeanReference");
		return bean;
	}

	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.determineCandidateConstructors");
		return null;
	}
}

