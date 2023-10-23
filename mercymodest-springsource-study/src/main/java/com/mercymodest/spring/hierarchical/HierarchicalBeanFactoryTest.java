package com.mercymodest.spring.hierarchical;

import com.mercymodest.spring.bean.Cat;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 10-24 1:02
 */
public class HierarchicalBeanFactoryTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(HierarchicalBeanFactoryTest.class);
		applicationContext.setParent(createBeanFactoryByXml());
		applicationContext.refresh();
		System.out.print("application contains beanNames:");
		printApplicationBeanNames(applicationContext,true);
		System.out.println("parent beanFactory contains beanNames:");
		printApplicationBeanNames(applicationContext.getParent(),true);
		System.out.printf("application contains cat bean: %s\n", applicationContext.containsBean("cat"));
		Cat cat = applicationContext.getBean(Cat.class);
		System.out.println(cat);
		System.out.println(BeanFactoryUtils.beansOfTypeIncludingAncestors(applicationContext, Cat.class));

		applicationContext.close();
	}

	private static ApplicationContext createBeanFactoryByXml() {
		return new ClassPathXmlApplicationContext("classpath:/META-INF/ioc/dependency-lookup-context.xml");
	}

	private static void printApplicationBeanNames(BeanFactory beanFactory,boolean ignoredApplicationInnerBeans){
		if (Objects.isNull(beanFactory)) {
			System.err.println("beanFactory is null");
		}
		if (beanFactory instanceof ListableBeanFactory) {
			ListableBeanFactory listableBeanFactory= (ListableBeanFactory) beanFactory;
			List<String> resultBeanNames = Arrays.stream(listableBeanFactory.getBeanDefinitionNames())
					.filter(beanName -> !ignoredApplicationInnerBeans || !beanName.startsWith("org.springframework"))
					.collect(Collectors.toList());
			System.out.println(resultBeanNames);
		}else {
			System.err.println("beanFactory is not instanceof ListableBeanFactory");
		}
	}

	@Bean
	public Cat cat() {
		return new Cat()
				.setId(2L)
				.setName("localCatBean");
	}
}
