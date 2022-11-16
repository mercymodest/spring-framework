package com.mercymodest.study.spring.test;

import com.mercymodest.study.spring.pojo.Book;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * <pre>
 *       Spring  两大特性
 *           - IoC  Inverse Of  Control 控制反转
 *           - DI  Dependence Injection 依赖注入
 *   </pre>
 *
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @created 2022/11/09
 */
public class SpringApplicationTest {

	public static void main(String[] args) {

		/*
		   关于 Spring容器 管理 Bean 的过程以及加载模式
		     1. 需要 将 Bean 的配置信息 声明在 Spring 的配置文件中
		     2. 需要通过 Spring 抽象出来的各种 Resource 来指定对应的配置文件
		     3. 需要显式声明一个 Spring 工厂 该工厂用来掌控 我们在配置文件中声明的各种 Bean 以及 Bean 之间的依赖关系
		     4. 需要定义一个配置信息读取器,该读取器用来读取我们之前所定义所有Bean信息
		     5. 读取器的作用是读取我们所声明的配置文件信息，并将读取后的信息装配到之前我们声明的Spring 工厂当中.
		     6. 需要将读取器与Spring 工厂与资源进行相应的关联处理.
		     7. 工厂所管理的Bean对象，全部装配完毕,可以供客户端直接调用,获取客户端想要使用的各种 Bean

		    Spring 对 Bean 管理的 核心组件
		       1. 资源抽象
		       2.  读取器
		       3.  工厂
		    BeanFactory 是 Spring 工厂最顶层的抽象
		 */
		// 定义资源
		Resource resource = new ClassPathResource("spring-bean.xml");
		// 创建 spring bean 工厂
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		// 创建 BeanDefinitionReader
		BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		// 加载 beanDefinition
		beanDefinitionReader.loadBeanDefinitions(resource);
		Book book = (Book) defaultListableBeanFactory.getBean("book");
		System.out.println(book);
	}
}
