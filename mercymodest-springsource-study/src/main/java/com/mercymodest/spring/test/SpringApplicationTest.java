package com.mercymodest.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		    关于 Spring  Bean 实例的注册流程
		     1. 定义好 Spring 的配置文件
		     2. 通过Resource 对象 将 Spring 配置文件进行抽象.抽象成一个具体的Resource 对象 . etc. ClassPathResource
		     3. 定义好需要的使用Spring Bean 工厂.(各种 Spring BeanFactory)
		     4. 定义好 XmlBeanDefinitionReader对象,并将定义的 Spring BeanFactory作为参数传递进去,从而构建好二者之间的关联关系
		     5. 通过 XmsBeanDefinitionReader 对象读取之前所抽象出来的Resource 对象
		     6. 流程开始解析
		     7. 针对 XML文件的各个元素及其属性进行解析,在这里真正执行解析是通过 BeanDefinitionParserDelegate 对象来完成的.(设计模式: 委托模式)
		     8. 通过 BeanDefinitionParserDelegate 进行解析XML的的时候,又使用到了模板方法设计模式(preProcessXml. processXmlDefinitions. postProcessXml.)
		     9. 当所以的 Bean 标签元素解析完毕后.定义了一个 BeanDefinition 对象,该对象包含 Bean 所有的相关属性
		     10. BeanDefinition 对象创建完毕之后,Spring又会创建一个 BeanDefinitionHolder对象来持有 BeanDefinition对象
		     11. BeanDefinitionHolder 主要包含两部分信息: beanName 和 BeanDefinition
		     12. Spring Bean工厂会将解析创建的 BeanDefinition 信息 放到内部的一个 ConcurrentHashMap.该Map 值是唯一的 beanName,值是 BeanDefinition 对象
		     13. 调用 Bean解析完成的触发动作,从而触发相关监听器的方法的执行(设计模式: 观察者设计模式)
		 */
//		// 定义资源
//		Resource resource = new ClassPathResource("spring-bean.xml");
//		// 创建 spring bean 工厂
//		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
//		// 创建 BeanDefinitionReader
//		BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
//		// 加载 beanDefinition
//		beanDefinitionReader.loadBeanDefinitions(resource);
//		Book book = (Book) defaultListableBeanFactory.getBean("book");
//		System.out.println(book);

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
	}
}