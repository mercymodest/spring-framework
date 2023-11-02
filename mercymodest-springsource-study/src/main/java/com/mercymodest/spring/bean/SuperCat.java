package com.mercymodest.spring.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/10/18
 */
@Setter
@Getter
@Accessors(chain = true)
@Super
public class SuperCat extends Cat {

	private String superName;


	public SuperCat() {
	}

	public SuperCat(String superName) {
		this.superName = superName;
	}

	public SuperCat(Cat cat){
		super.id = cat.id;
		super.name=cat.name;
	}

	@Override
	public String toString() {
		return "SuperCat{" +
				"superName='" + superName + '\'' +
				", id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
