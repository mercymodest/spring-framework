package com.mercymodest.spring.injection;

import com.mercymodest.spring.bean.Cat;
import com.mercymodest.spring.bean.SuperCat;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 测试 Spring ioc 的依赖注入
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 11-02 22:56
 */
public class TestSpringIocInjection {

	public static void main(String[] argus){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(TestSpringIocInjection.class);
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(applicationContext);
		xmlBeanDefinitionReader.loadBeanDefinitions("classpath:META-INF/injection/constructor-injection-context.xml");
		applicationContext.refresh();

		System.out.println(applicationContext.getBean(SuperCat.class));
	}

	@Bean
	public Cat cat(){
		Cat cat = new Cat();
		cat.setId(1L);
		cat.setName(TestSpringIocInjection.class.getSimpleName());
		return cat;
	}


}
