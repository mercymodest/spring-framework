package com.mercymodest.spring.ioc;

import com.mercymodest.spring.bean.Cat;
import com.mercymodest.spring.bean.CatRepository;
import com.mercymodest.spring.bean.Super;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/10/18
 */
public class SpringIocTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:MATE-INF/ioc/dependency-lookup-context.xml");

		CatRepository catRepository = beanFactory.getBean(CatRepository.class);
		System.out.println(catRepository.getBeanFactory());
		System.out.println(String.format("catRepository.getBeanFactory == beanFactory : %B", catRepository.getBeanFactory() == beanFactory));
		System.out.println(catRepository);
		System.out.println(String.format("catRepository.getApplicationContextObjectContext.getObject == beanFactory : %B", catRepository.getApplicationContextObjectFactory().getObject() == beanFactory));
		//lookupByAnnotation(beanFactory);
		//lookupCollectByType(beanFactory);
		//lookupByType(beanFactory);
		//lookupBeanByNameLazy(beanFactory);
		//lookupBeanByNameRealTime(beanFactory);
	}

	private static void lookupByAnnotation(BeanFactory beanFactory) {
		if (beanFactory instanceof ListableBeanFactory) {
			ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
			Map<String, Object> beanNameBeanMap = listableBeanFactory.getBeansWithAnnotation(Super.class);
			System.out.println(beanNameBeanMap);
		}
	}

	private static void lookupCollectByType(BeanFactory beanFactory) {
		if (beanFactory instanceof ListableBeanFactory) {
			ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
			Map<String, Cat> beanNameBeanMap = listableBeanFactory.getBeansOfType(Cat.class);
			System.out.println(beanNameBeanMap);
		}
	}

	private static void lookupByType(BeanFactory beanFactory) {
		Cat cat = beanFactory.getBean(Cat.class);
		System.out.println(cat);
	}


	/**
	 * 基于{@link ObjectFactory}实现延迟查找
	 *
	 * @param beanFactory {@link BeanFactory}
	 */
	private static void lookupBeanByNameLazy(BeanFactory beanFactory) {
		ObjectFactory<Cat> catObjectFactory = (ObjectFactory<Cat>) beanFactory.getBean("catObjectFactory");
		System.out.println(catObjectFactory.getObject());
	}

	/**
	 * 通过{@code beanName}实时查找 {@code spring bean}
	 *
	 * @param beanFactory {@link BeanFactory}
	 */
	private static void lookupBeanByNameRealTime(BeanFactory beanFactory) {
		Object cat = beanFactory.getBean("cat");
		System.out.println(cat);
	}
}
