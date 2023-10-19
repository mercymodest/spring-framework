package com.mercymodest.spring.instantiation;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/10/19
 */
public interface UserFactory {

	default User createUser() {
		return new User().setId(2).setName("user factory create user");
	}
}
