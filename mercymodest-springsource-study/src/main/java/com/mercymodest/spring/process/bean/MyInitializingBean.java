package com.mercymodest.spring.process.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 03-03 0:31
 */
@Component
public class MyInitializingBean implements InitializingBean {
	public MyInitializingBean() {
		System.out.println("MyInitializingBean.MyInitializingBean");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyInitializingBean.afterPropertiesSet");
	}
}
