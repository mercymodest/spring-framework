package com.mercymodest.spring.bean;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;

import java.util.Collection;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/10/18
 */
@Data
@Accessors(chain = true)
public class CatRepository {

	private Collection<Cat> cats;

	private BeanFactory beanFactory;

	private ObjectFactory<ApplicationContext> applicationContextObjectFactory;
}
