package com.mercymodest.spring.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 02-13 20:40
 */
//@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
@Component
@Getter
@Setter
@Accessors(chain = true)
public class Cat implements InitializingBean {

	public Cat() {
		System.out.println("Cat constructor");
	}

	/**
	 * id
	 */
	protected Long id;

	/**
	 * 名称
	 */
	protected String name;

	public Cat setName(String name) {
		System.out.println("Cat.setName");
		this.name = name;
		return this;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("cat initializingBean afterPropertiesSet");
	}

	@Override
	public String toString() {
		return "Cat{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
