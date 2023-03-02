package com.mercymodest.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 02-13 21:05
 */
//@Component
public class Person  implements MessageSourceAware {

	public Person() {
		System.out.println("the person non args construct~~");
	}

	/**
	 * name
	 */
	private String name;

	/**
	 * cat
	 */

	private Cat cat;

	/**
	 * {@link MessageSource}
	 */
	private MessageSource messageSource;


	//@Lookup
	public Cat getCat() {
		return cat;
	}

	@Autowired
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource=messageSource;
	}
}
