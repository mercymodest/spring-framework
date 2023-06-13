package com.mercymodest.spring.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * {@link BeanPostProcessor}
 *
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/06/13
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Teacher) {
			Teacher teacher = (Teacher) bean;
			teacher.setTeacherName("MercyModest");
			teacher.setId(1000000000L);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Teacher) {
			System.out.println(bean);
		}
		return bean;
	}
}
