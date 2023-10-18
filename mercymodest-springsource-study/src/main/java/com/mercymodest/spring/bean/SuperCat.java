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

	@Override
	public String toString() {
		return "SuperCat{" +
				"superName='" + superName + '\'' +
				", id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
