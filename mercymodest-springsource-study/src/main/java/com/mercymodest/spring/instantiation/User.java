package com.mercymodest.spring.instantiation;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/10/19
 */
@Data
@Accessors(chain = true)
public class User {

	private Integer id;

	private String name;

	public static User createUser() {
		return new User();
	}
}
