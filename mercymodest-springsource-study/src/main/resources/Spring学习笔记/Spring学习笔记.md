# Spring 学习笔记

> 当前学习的Spring的版本为 **5.3.x**
>
> 翻译软件： [DeepL](https://www.deepl.com/translator)
>
> 笔记图片来源：
>
> -  [极客时间-小马哥讲 Spring 核心编程思想](https://time.geekbang.org/course/intro/265)

## Spring 模块总览

> [Spring Framework 1.5.x](https://github.com/spring-projects/spring-framework/tree/5.3.x)

> - Spring-core
> - Spring-aop
> - spring-beans
> - Spring-aspectjs
> - Spring-context
> - Spring-context-indexder
> - Spring-context-support
> - Spring-expression
> - Spring-instrument
> - Spring-jcl
> - Spring-jdbc
> - Spring-jms
> - Spring-messaging
> - Spring-orm
> - Spring-oxm
> - Spring-test
> - Spring-tx
> - spirng-web
> - Spring-webflux
> - Spring-webmvc
> - Spring-websocket

## Java语法变化

### Java5

- 枚举
- 泛型
- 注解
- 封箱和拆箱

### Java6

- @Override 接口

### Java7

- Diamond 语法
- 多catch
- try-with- resources

### Java8

- Lambda语法
- 可重复注解
- 类型注解
- 新的时间API
- Optional 类

### Java9

- 模块化
- 接口私有方法

### Java10

- 局部变量类型推断

## Spring 对于 Java新特性的应用

### Java5语法特性

![image-20231016163107795](https://s2.loli.net/2023/10/16/Gbjf19WhnOzQJ7R.png)

### Java6语法特性

![image-20231016163149516](https://s2.loli.net/2023/10/16/jSxQgtV4dwNqMoA.png)

### Java7语法特性

![image-20231016163210618](https://s2.loli.net/2023/10/16/md4wcgQSBIpVi1t.png)

### Java8语法特性

![image-20231016163245857](https://s2.loli.net/2023/10/16/LmTiz8ce7YdJfBH.png)

## JDK 核心API

![image-20231016163813685](https://s2.loli.net/2023/10/16/RAX2T1nNOyBWmo7.png)

## Spring 对于 JDK API 的实践

### Java5 API

![image-20231016164244903](https://s2.loli.net/2023/10/16/QhgkJ69DMipfBPT.png)

![image-20231016164333376](https://s2.loli.net/2023/10/16/pILR7VHhfGrFMNu.png)

### Java6API

![image-20231016164553057](https://s2.loli.net/2023/10/16/Bu6xgPEDt7HXAay.png)

### Java7

![image-20231016164658748](https://s2.loli.net/2023/10/16/ZfcToXqQDm2KiOJ.png)

### Java8 API

![image-20231016164726806](https://s2.loli.net/2023/10/16/28VC61oOPhjRmle.png)

## Spring 对JavaEE API的整合

### Java EE Web 技术相关

![image-20231016165002806](https://s2.loli.net/2023/10/16/HVWYbKgzUs7Zjy9.png)

### JavaEE 数据存储相关

![image-20231016165124086](https://s2.loli.net/2023/10/16/1dF89xUVhHOuvYE.png)

### JavaEE Bean 技术相关

![image-20231016165258434](https://s2.loli.net/2023/10/16/PZ9TEdeyl4JLFQr.png)

## Spring 编程模型

![image-20231016165400462](https://s2.loli.net/2023/10/16/KaH1oXYkqN6xBre.png)

## 面试题： 什么是SpringFramework 

![image-20231016165819273](https://s2.loli.net/2023/10/16/1K4CsZ3IcaWEx2A.png)

## 面试题：Spring Framework 有哪些核心模块

> - spring--core:  Spring 基础API 如资源管理，泛型处理 
> - Spring-beans:  Spring Beans 相关 如何依赖查找和依赖注入
> - spring-aop： Spring AOP 处理，如动态代理，AOP字节码提升
> - Spring-context:  事件驱动，注解驱动，模块驱动等
> - spring- expression： spring 表达式语言模块

## 什么是Ioc

> inversion of control 

> [解答来源-WiKi-Inversion_of_control](https://en.wikipedia.org/wiki/Inversion_of_control)

![image-20231016171722178](https://s2.loli.net/2023/10/16/3s1zNEWX8IianQ5.png)

## Ioc 简史

![image-20231016172457371](https://s2.loli.net/2023/10/16/PThSVxUw6uE9ONR.png)

## Ioc主要实现策略

![image-20231016172749796](https://s2.loli.net/2023/10/16/8qZJ1iU2QItpKjo.png)

![image-20231016172915795](https://s2.loli.net/2023/10/16/gD57VsOXAfdIMxn.png)

## Ioc容器的职责

![image-20231016173155698](https://s2.loli.net/2023/10/16/aQPycC9hfeUor68.png)

> - 通用职责
> - 依赖查找
>   - 依赖查找
>   - 依赖注入
> - 生命周期管理
>   - 容器
>   - 托管的资源（Java Beans 或 其Ta的资源）
> - 配置
>   - 容器
>   - 外部化配置
>   - 托管的资源(Java Bean 或其Ta资源)

## Ioc 的主要实现

- JavaSE
  - Java Beans
  - Java Service Loader  SPI
  - JNDI （Java Naming and Directory Interface）
- JavaEE
  - EJB （Enterprise Java Beans）
  - Servlet
- 开源实现
  - Apache Avalon
  - PicoContainer 
  - Goolge Guice
  - Spring Framework

## 传统Ioc容器的实现

- Java Beans 作为 Ioc 容器

  - 特性
    - 依赖查找
    - 生命周期管理
    - 配置元信息
    - 事件
    - 自定义
    - 资源管理
    - 持久化

  > [Java Beans](https://[www.oracle.com/technetwork/java/javase/tech/index-jsp-138795.html](http://www.oracle.com/technetwork/java/javase/tech/index-jsp-138795.html))
  >
  > [BeanContext](https://docs.oracle.com/javase/8/docs/technotes/guides/beans/spec/beancontext.html)

## 轻量级Ioc容器

![image-20231016175946336](https://s2.loli.net/2023/10/16/9Fg5ktdxV3oRfMP.png)

![image-20231016180208193](https://s2.loli.net/2023/10/16/7QCtIEJBLRuGDnk.png)

## 依赖查找和依赖注入的对比

![image-20231016180421743](https://s2.loli.net/2023/10/16/Coyv4WMr5bl8zQI.png)

## 构造器注入和 Setter 注入

![image-20231016180812344](https://s2.loli.net/2023/10/16/fHu4XNZPa6G7AnU.png)

![image-20231016181105371](https://s2.loli.net/2023/10/16/ZOUe6v7fFaIEJKz.png)

![image-20231016181625962](https://s2.loli.net/2023/10/16/nswDUHTt8mblKOG.png)

![image-20231016181651473](https://s2.loli.net/2023/10/16/9Qg43fWqudpI6Ei.png)

![image-20231016181831479](https://s2.loli.net/2023/10/16/gm96lnqN74GKXxC.png)

## 面试题: 什么是Ioc

> Ioc 反转控制 （Inversion of Control） 类似于 好莱坞原则 主要是 依赖查找和依赖注入的实现

##  面试题:  依赖查找和依赖注入的区别

> - 依赖查找 是主动和手动的依赖查找方式，通常需要依赖容器或者标准的API实现
> - 依赖注入是手动或者自动依赖绑定方式，无需依赖特定容器和API

## 面试题：Spring 作为 Ioc 容器有哪些优势

> - 典型的Ioc 管理
>   - 依赖查找
>   - 依赖注入
> - AOP抽象
> - 事务的抽象
> - 事件机制
> - SPI拓展
> - 强大的第三方整合能力
> - 易测试性
> - 更好的面相对象

## SpringIoc 依赖查找的方式

### 通过 BeanName 进行查找

#### 实时查询

```java
Object cat = beanFactory.getBean("cat");
```

#### 延迟查找

```java
// 基于 ObjectFactory 实现延迟查找
// 使用时 org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean
  
 ObjectFactory<Cat> catObjectFactory = (ObjectFactory<Cat>) beanFactory.getBean("catObjectFactory");
```

### 通过 Bean 类型（Type） 进行查找

#### 查找单个bean

```java
	Cat cat = beanFactory.getBean(Cat.class);
```

#### 查找Bean集合

```java
if (beanFactory instanceof ListableBeanFactory) {
			ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
			Map<String, Cat> beanNameBeanMap = listableBeanFactory.getBeansOfType(Cat.class);
			System.out.println(beanNameBeanMap);
		}
```

## 通过注解查找

```java
if (beanFactory instanceof ListableBeanFactory) {
			ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
			Map<String, Object> beanNameBeanMap = listableBeanFactory.getBeansWithAnnotation(Super.class);
			System.out.println(beanNameBeanMap);
		}
```

## SpringIoc 依赖注入

### 手动注入

```xml
	<bean id="catRepository" class="com.mercymodest.spring.bean.CatRepository">
		<property name="cats">
			<list>
				<ref bean="superCat"/>
				<ref bean="cat"/>
			</list>
		</property>
	</bean>
```

### 依赖注入

```xml
	<bean id="catRepository" class="com.mercymodest.spring.bean.CatRepository" autowire="byType">
<!--		<property name="cats">-->
<!--			<list>-->
<!--				<ref bean="superCat"/>-->
<!--				<ref bean="cat"/>-->
<!--			</list>-->
<!--		</property>-->
	</bean>
```

## 如果我们注入 `org.springframework.beans.factory.BeanFactory`

```java
@Data
@Accessors(chain = true)
public class CatRepository {

	private Collection<Cat> cats;

	private BeanFactory beanFactory;

	private ObjectFactory<ApplicationContext> applicationContextObjectFactory;
}
```

```java
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:MATE-INF/ioc/dependence-lookup-context.xml");

		CatRepository catRepository = beanFactory.getBean(CatRepository.class);
		System.out.println(catRepository.getBeanFactory());
		System.out.println(String.format("catRepository.getBeanFactory == beanFactory : %B", catRepository.getBeanFactory() == beanFactory));
		System.out.println(catRepository);
		System.out.println(String.format("catRepository.getApplicationContextObjectContext.getObject == beanFactory : %B", catRepository.getApplicationContextObjectFactory().getObject() == beanFactory));
```

```shell
org.springframework.beans.factory.support.DefaultListableBeanFactory@79698539: defining beans [cat,superCat,catObjectFactory,catRepository]; root of factory hierarchy
catRepository.getBeanFactory == beanFactory : FALSE
CatRepository(cats=[Cat{id=1, name='Tom'}, SuperCat{superName='super's name', id=1, name='Tom'}], beanFactory=org.springframework.beans.factory.support.DefaultListableBeanFactory@79698539: defining beans [cat,superCat,catObjectFactory,catRepository]; root of factory hierarchy, applicationContextObjectFactory=org.springframework.beans.factory.support.DefaultListableBeanFactory$DependencyObjectProvider@7a765367)
catRepository.getApplicationContextObjectContext.getObject == beanFactory : TRUE
```

### 依赖注入的来源

- 自定义Bean
- 容器内建Bean
- 容器内建依赖

> ```java
> org.springframework.context.support.AbstractApplicationContext#prepareBeanFactory
> ```

![image-20231019104820839](https://s2.loli.net/2023/10/19/t7GQAxI4KfT6sEO.png)

## Spring 配置元信息的方式

### Bean定义信息

> - 基于 XML配置
> - 基于 Properties 配置文件
> - 基于 Java 注解
> - 基于 Java API

### Ioc容器配置

> - 基于 XML 配置
> - 基于 Properties 配置
> - 基于 Java API

### 外部化配置

> - 基于 Java 注解

##  `BeanFactory` 和 `ApplicationContext` 谁是 Ioc 容器

### 官方说明

> [1.1. Introduction to the Spring IoC Container and Beans](https://docs.spring.io/spring-framework/docs/5.3.30/reference/html/core.html#beans-introduction)
>
> ![image-20231018220218796](https://s2.loli.net/2023/10/18/x9KRMJ6HFzGtaDn.png)
>
> ![image-20231018220242039](https://s2.loli.net/2023/10/18/OV2IDcoGfzHW4sd.png)
>
> ![image-20231018220307218](https://s2.loli.net/2023/10/18/cglzTZ7m21Ny6sU.png)
>
> ![image-20231018220326325](https://s2.loli.net/2023/10/18/HcTEB3hw5ZFjazD.png)

## Spring 应用上下文

> `ApplicationContext`

### ApplicationContext  除了具备`BeanFactory`的全部功能之外还提供了什么功能

- 面向切面编程(AOP)
- 配置元信息(Congiguration Mete Data)
- 资源管理(Resouces)
- 国际化(i18n)
- 事件(Eevnets)
- 注解(Annotation)
- Environment 抽象

> `BeanFactory` 是Spring 底层的Ioc容器
>
> `ApplicationContext` 是`BeanFactory`的一个超集除了具备`BaenFactory`的功能之外，还具备了一些应用级的功能
>
> ![image-20231018221710420](https://s2.loli.net/2023/10/18/v1nyFtVPs4DjYA7.png)

## 面试题:  什么是 Spring Ioc

> Spring 官方说明

![image-20231018223209380](https://s2.loli.net/2023/10/18/Aowz4Zx8r2UEc97.png)

## 面试题 : BeanFactory 和 FactoryBean 的区别

> BeanFactory 是 Ioc 的底层容器，FactoryBean 是一种Bean的创建方式，帮助我们实现复杂的初始化逻辑

## 面试题: Spring Ioc 启动时候做了那些准备

> - 读取配置元信息
> - Ioc容器的生命周期
> - Spring的事件发布
> - 国际化
> - 执行 BeanFactoryPostProcessor
> - 执行BeanPostProcessor

## 什么是BeanDefinition

> BeanDefinition 是 Spring Framework 中定义Bean 配置元信息的接口
>
> - Bean的名称
> - Bean行为配置元信息
>   - 作用域
>   - 生命周期回调
>   - 自动绑定的模式
> - 其它Bean的引用
>   - Bean的依赖(Dependence)或者合作者(Collborators)关系
> - 配置设置
>   - Bean的属性配置

![image-20231018224648046](https://s2.loli.net/2023/10/18/bhEZ6wmGjU9oV2r.png)

## 构建 BeanDefinition的方式

### 通过 BeanDefinitionBuilder

```java
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		// 1. 通过 BeanDefinitionBuilder 构建
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(Cat.class)
				.addPropertyValue("id", "99")
				.addPropertyValue("name", "cat name ")
				.getBeanDefinition();
		applicationContext.registerBeanDefinition("cat", beanDefinition);
		System.out.println("before applicationContext refresh");
		applicationContext.refresh();
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
```

```shell
before applicationContext refresh
Cat constructor
Cat.setName
cat initializingBean afterPropertiesSet
[org.springframework.context.annotation.internalConfigurationAnnotationProcessor, org.springframework.context.annotation.internalAutowiredAnnotationProcessor, org.springframework.context.annotation.internalCommonAnnotationProcessor, org.springframework.context.event.internalEventListenerProcessor, org.springframework.context.event.internalEventListenerFactory, cat]

```

### 通过 `AbstractBeanDefinition` 及其派生类

> org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition

```java
	AnnotatedGenericBeanDefinition annotatedGenericBeanDefinition = new AnnotatedGenericBeanDefinition(SuperCat.class);
		MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
		mutablePropertyValues.add("id", "111")
				.add("name", "super cat name")
				.add("superName", "super cat super name");
		annotatedGenericBeanDefinition.setPropertyValues(mutablePropertyValues);
		applicationContext.registerBeanDefinition("superCat", annotatedGenericBeanDefinition);
```

## Spring Bean 的命名

> 1.  在 Spring Ioc 容器中 每个 Bean 具有一个或多个标识符，这个标识符合 在 Ioc 容器中是唯一的
> 2. 一般情况下，一个 Bean 只有一个标识符，但是Spring Ioc 支持 给 Bean 其别名来实现 多个Bean 标识符的需求。 使用英文状态下的分号或者逗号
> 3. 我们在定义 Bean的元信息的时候，我们可以可以留空，这样Sprin会给我自动生成一个唯一的 Bean 标识符（即 Bean 的名称）

### BeanNameGenerator

![image-20231019115929781](https://s2.loli.net/2023/10/19/cCkZR3HwAjDbxnm.png)

#### DefaultBeanNameGenerator

> org.springframework.beans.factory.support.DefaultBeanNameGenerator

#### AnnotationBeanNameGenerator

> org.springframework.context.annotation.AnnotationBeanNameGenerator

![image-20231019121357337](https://s2.loli.net/2023/10/19/EPaZQwlqbzD3ni9.png)

## Spring Bean 的 别名

###  基于 XML 标签

```xml
	<bean id="superCat" class="com.mercymodest.spring.bean.SuperCat" parent="cat">
		<property name="superName" value="super's name"/>
	</bean>
	
	<alias name="superCat" alias="superCat2"/>
	<alias name="superCat" alias="superCat3"/>
```

### 基于 Java 注解

![image-20231019122215427](https://s2.loli.net/2023/10/19/twxAJHkNvnFGTMX.png)

## SpringBean的注册

### 基于 BeanDefinition 配置信息的注册

1. XML 配置元信息

2. 基于 java 注解

   - @C ompanent
   - @Import
   - @Bean

3. 基于 java API 配置元信息

   - 命名方式

     > - ==BeanDefinitionRegistry==
     >
     >   ![image-20231019131402731](https://s2.loli.net/2023/10/19/7jYm6s9krCeWAqQ.png)
     >
     >   ![image-20231019131222757](https://s2.loli.net/2023/10/19/nXPmx5IdlYRNZkV.png)

   - 非命名方式

     > - BeanDefinitionReaderUtils
     >
     > ![image-20231019131707122](https://s2.loli.net/2023/10/19/M1JCmAKWqTxBXkL.png)

   - 基于配置类的方式

     > - AnnotatedBeanDefinitionReader
     >
     > ![image-20231019131828060](https://s2.loli.net/2023/10/19/18OoXPMn4pzxmNY.png)

### 外部单实例 Bean 的注册

> SingletonBeanRegistry
>
> ![image-20231019132341352](https://s2.loli.net/2023/10/19/Zy2hz6SIxBmqa4o.png)
>
> ![image-20231019132422620](https://s2.loli.net/2023/10/19/cXrE2zb5iIZW6e1.png)
>
> ![image-20231019132520757](https://s2.loli.net/2023/10/19/gApIabWzBLcUvsG.png)

## Spring Instantiation

### 常规实例化方法

- 构造器
- 静态工厂方法
- 实例工厂方法
- FactoryBean

> - xml 配置
>
>   ```xml
>   	<!--静态工厂方法-->
>   	<bean id="user-by-static-method" class="com.mercymodest.spring.instantiation.User" factory-method="createUser"/>
>   
>   	<!--实例工厂方法-->
>   	<bean id="usrFactory" class="com.mercymodest.spring.instantiation.DefaultUserFactory"/>
>   	<bean id="user-by-instance-method" class="com.mercymodest.spring.instantiation.User" factory-bean="usrFactory"
>   		  factory-method="createUser"/>
>   
>   	<!--FactoryBean-->
>   	<bean id="userFactoryBean" class="com.mercymodest.spring.instantiation.SpringInstantiationTest$UserFactoryBean"/>
>   ```
>
> - java code
>
>   ```java
>   public class SpringInstantiationTest {
>   
>   	static class UserFactoryBean implements FactoryBean<User> {
>   
>   		@Override
>   		public User getObject() throws Exception {
>   			return new User().setId(3).setName("user by  factory bean");
>   		}
>   
>   		@Override
>   		public Class<?> getObjectType() {
>   			return User.class;
>   		}
>   	}
>   
>   	public static void main(String[] args) {
>   		final String location = "classpath:MATE-INF/instantiation/spring-bean-instantiation.xml";
>   		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(location);
>   		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
>   		Object userFactoryBean = applicationContext.getBean("userFactoryBean");
>   		System.out.println(userFactoryBean);
>   		Object userFactoryBeanSelf = applicationContext.getBean("&userFactoryBean");
>   		System.out.println(userFactoryBeanSelf);
>   	}
>   }
>   
>   ```
>
> - Console out
>
>   ```shell
>   [user-by-static-method, usrFactory, user-by-instance-method, userFactoryBean]
>   User(id=3, name=user by  factory bean)
>   com.mercymodest.spring.instantiation.SpringInstantiationTest$UserFactoryBean@7e0b0338
>   ```

### 特殊生成方式

#### ServiceLoadFactoryBean

> ```xml
> 	<!--single user factory service load-->
> 	<bean id="userFactoryServiceLoad" class="org.springframework.beans.factory.serviceloader.ServiceLoaderFactoryBean">
> 		<property name="serviceType" value="com.mercymodest.spring.instantiation.UserFactory"/>
> 	</bean>
> 
> ```

#### AutowireCapableBeanFactory

> ```java
> final String location = "classpath:META-INF/instantiation/spring-bean-instantiation.xml";
> 		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(location);
> 		AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
> 		System.out.println(applicationContext.getBeansOfType(DefaultUserFactory.class));
> 		autowireCapableBeanFactory.createBean(DefaultUserFactory.class);
> 		System.out.println(applicationContext.getBeansOfType(DefaultUserFactory.class));
> ```
>
> ```shell
> 
> > Task :mercymodest-springsource-study:SpringInstantiationTest.main()
> {usrFactory=com.mercymodest.spring.instantiation.DefaultUserFactory@43814d18}
> {usrFactory=com.mercymodest.spring.instantiation.DefaultUserFactory@43814d18}
> ```

## Spring Bean 的初始化

### @PostContract 注解

### 实现 InitializingtionBean 接口 `afterPropertiesSet`

![image-20231019170221603](/Users/mercymodest/Library/Application Support/typora-user-images/image-20231019170221603.png)

### 自定义初始化方法

> ```xml
> <bean init-method="initMethod"/>
> ```
>
> ```java
> @Bean(initMethod="")
> ```
>
> ```java
> AbstractBeanDefinition.setInitMethodName(String)
> ```
>
> 

## 延迟初始化

> ```xml
> <bean lazy-init="true"/>
> ```
>
> ```java
> @Lazy(value=true)
> ```
>

## Spring Bean 的销毁方式

### @PreDestroy

> ```java
> ```
>
> 

### 实现  DisposableBean 接口 

> ```java
> ```

### 自定义销毁方法

> - ```xml
>   <bean destory="destroyMethod"/>
>   ```
>
> - ```java
>   @Bean(destoryMethod="destroyMethod")
>   ```
>
> - ```java
>   AbstractBeanDefinition.setDestoryMethodName(String)
>   ```

## 垃圾回收 Spring Bean

1. 关闭Spring 容器(应用上下文)
2. 执行 `GC`
3. Spring Bean 重写 `Object` 的 `finalize` 方法

## 面试题: 如何注册一个 Spring Bean 

### 通过 注解，XML配置，JavaAPI 向容器中注册一个 springBean 的配置元信息

- @Companent
- <bean/>
- @Bean
- BeanDefinitiaonRegistry#registryBeanDefinition

### 通过外部化单实例Bean的注册

- SingletonBeanRegitery#registrySingleton(String beanName, Object singletonObject)

## 面试题:  什么是 Spring BeanDefinition

- BeanDefinition 是 Spring Framework 配置 Spring Bean 元信息的接口
  - Bean class 名称
  - Bean 的行为配置：自动绑定模式，作用域，生命周期回调
  - 对其它Bean的引用 合作者(Collaborlator)或者是依赖(dependency)
  - 属性配置(Properties)
- 包含的内容
  - BeanName
  - BeanClass
  - 作用域
  - 构造器参数
  - 属性
  - 延迟加载模式
  - 自动绑定模式 byType，byName 等
    - ![image-20231019235645365](https://s2.loli.net/2023/10/20/m8DAeSvq7IBNYZU.png)
  - 初始化方法
  - 销毁方法

## 面试题: Spring 是否如何管理 Bean的

1. Ioc 读取 spring bean 的配置元信息
2. 依赖查找和依赖注入
3. Spring bean 的生命周期

## 依赖查找的前世今生

### 单一类型的依赖查询

> javax.naming.Context#lookup(javax.naming.Name)

### 集合类型的依赖查找

### 层次性依赖查找

> - ![image-20231024002512642](https://s2.loli.net/2023/10/31/AK2nhifM5Spak8H.png)
> - ![image-20231024003154629](https://s2.loli.net/2023/10/31/dLS8fFzi3q4mGgo.png)

## Spring Ioc 单一类型的依赖查询

### 通过 Bean 名称 查找

> ```java
> org.springframework.beans.factory.BeanFactory#getBean(java.lang.String)
> org.springframework.beans.factory.BeanFactory#getBean(java.lang.String, java.lang.Object...)
> ```

### 通过 Bean 类型查找

#### 实时查找

```java
org.springframework.beans.factory.BeanFactory#getBean(java.lang.Class<T>)
org.springframework.beans.factory.BeanFactory#getBean(java.lang.Class<T>, java.lang.Object...)    
```

#### 延迟查找

```java
org.springframework.beans.factory.BeanFactory#getBeanProvider(java.lang.Class<T>)
org.springframework.beans.factory.BeanFactory#getBeanProvider(org.springframework.core.ResolvableType)    
```

### 通过 Bean 名称 + Bean 类型 查找

```java
org.springframework.beans.factory.BeanFactory#getBean(java.lang.String, java.lang.Class<T>)
```

## Spring Ioc 集合类型依赖查找

> AnnotationConfigApplicationContext

![image-20231024003934599](https://s2.loli.net/2023/10/31/YVtaJyMR1iQWjzO.png)

> ClassPathXmlApplicationContext

![image-20231024004127162](https://s2.loli.net/2023/10/31/RWupSKgXOzHZbEm.png)

### 通过 Bean 类型查找

#### 获取 Ioc 容器中指定类型的Bean的名称

```java
org.springframework.beans.factory.ListableBeanFactory#getBeanNamesForType(java.lang.Class<?>)
org.springframework.beans.factory.ListableBeanFactory#getBeanNamesForType(org.springframework.core.ResolvableType)    
```

#### 获取 Ioc 容器中指定类型的Bean实例

```java
org.springframework.beans.factory.ListableBeanFactory#getBeansOfType(java.lang.Class<T>)
```

### 通过 Bean 注解查找

#### Spring 4.0 获取标注指定注解的 Bean 名称

```java
org.springframework.beans.factory.ListableBeanFactory#getBeanNamesForAnnotation
```

#### Spring 3.0 获取标注指定注解的 Bean 实例

```java
org.springframework.beans.factory.ListableBeanFactory#getBeansWithAnnotation
```

#### Spring 3.0  通过 bean 的名称 + bean 的注解 获取指定bean 实例

```java
org.springframework.beans.factory.ListableBeanFactory#findAnnotationOnBean(java.lang.String, java.lang.Class<A>)
```

## Spring Ioc 的层次查找

![image-20231024005250361](https://s2.loli.net/2023/10/31/tinUH5KChWw9zxE.png)

### 测试代码

```java
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
```

```shell
Cat constructor
Cat.setName
cat initializingBean afterPropertiesSet
Cat constructor
Cat.setName
cat initializingBean afterPropertiesSet
Cat constructor
Cat.setName
cat initializingBean afterPropertiesSet
application contains beanNames:[hierarchicalBeanFactoryTest, cat]
parent beanFactory contains beanNames:
[cat, superCat, catObjectFactory, catRepository]
application contains cat bean: true
Cat{id=2, name='localCatBean'}
{cat=Cat{id=2, name='localCatBean'}, superCat=SuperCat{superName='super's name', id=1, name='Tom'}}
```

#### 通过 Bean 类型查找实例列表

> ```java
> org.springframework.beans.factory.BeanFactoryUtils#beansOfTypeIncludingAncestors(org.springframework.beans.factory.ListableBeanFactory, java.lang.Class<T>)
> ```
>
> ![image-20231024013354333](https://s2.loli.net/2023/10/31/Ly38F2YQb7d9CSM.png)

#### 通过 Java 注解查找 Bean 的名称列表

> ```java
> org.springframework.beans.factory.BeanFactoryUtils#beanNamesForAnnotationIncludingAncestors
> ```
>
> ![image-20231024013519185](https://s2.loli.net/2023/10/31/YGahbmM6XzHD9kJ.png)

##  Spring Ioc 延迟依赖查找

###  ObjectFactory

```java
org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean
```

### BeanProvider

![image-20231024014240117](https://s2.loli.net/2023/10/31/xYQM6735bwnofdI.png)

> ```java
> org.springframework.beans.factory.ObjectProvider#getIfAvailable(java.util.function.Supplier<T>)
> ```
>
> ![image-20231024014357248](https://s2.loli.net/2023/10/31/ROVw7oGdAjSKlfC.png)
>
> ```java
> org.springframework.beans.factory.ObjectProvider#ifAvailable
> ```
>
> ![image-20231024014454927](https://s2.loli.net/2023/10/31/nSgXYH5s9eKl8fu.png)

> ```java
> org.springframework.beans.factory.support.DefaultListableBeanFactory.BeanObjectProvider
> ```
>
> ![image-20231024014708796](https://s2.loli.net/2023/10/31/oQjrzZVgwLOyNfJ.png)

## Spring Ioc 安全依赖查找

![image-20231024014824293](https://s2.loli.net/2023/10/31/kHd1abI6SuZNxM2.png)

## Spring Ioc 内建可以查找的依赖

### AbstractApplicationContext 内建可以查找的依赖

![image-20231024020107154](https://s2.loli.net/2023/10/31/d9bhCiytVUpoHTs.png)

```java
org.springframework.context.support.AbstractApplicationContext#prepareBeanFactory
```

![image-20231024020135442](https://s2.loli.net/2023/10/31/chC2uTpgNGKPB5O.png)

```java
org.springframework.context.support.AbstractApplicationContext#finishRefresh
```

![image-20231024015903689](https://s2.loli.net/2023/10/31/n9WTClBw17PxUHi.png)

```java
org.springframework.context.support.AbstractApplicationContext#initApplicationEventMulticaster
```

![image-20231024020014089](https://s2.loli.net/2023/10/31/ZTlK1Ix9VSkBAr8.png)

### 注解驱动Spring应用上下文内建可查询依赖

```java
org.springframework.context.annotation.AnnotatedBeanDefinitionReader#AnnotatedBeanDefinitionReader(org.springframework.beans.factory.support.BeanDefinitionRegistry, org.springframework.core.env.Environment)
```

```java
org.springframework.context.annotation.AnnotationConfigUtils#registerAnnotationConfigProcessors(org.springframework.beans.factory.support.BeanDefinitionRegistry, java.lang.Object)
```

![image-20231024020709018](https://s2.loli.net/2023/10/31/ET1eaqyLk9hR6oA.png)

![image-20231024020754842](https://s2.loli.net/2023/10/31/cspRHm9GY1ufajE.png)

![image-20231024020925641](https://s2.loli.net/2023/10/31/CgLQk5z7Rnrmp2d.png)

## 依赖查找中的经典异常

![image-20231101225403910](https://s2.loli.net/2023/11/01/eVZzPD1Xnh6uL4T.png)

### NoSuchBeanDefinitionException

![image-20231101225512260](https://s2.loli.net/2023/11/01/849go3jnJYLq2yi.png)

> ```java
> org.springframework.beans.factory.NoSuchBeanDefinitionException
> ```
>
> ![image-20231101225719326](https://s2.loli.net/2023/11/01/6jdv9NG8OgLnmR3.png)

### NoUniqueBeanDefinitonException

![image-20231101225831821](https://s2.loli.net/2023/11/01/wMOX7ehrm4J2AIx.png)

> ```java
> org.springframework.beans.factory.NoUniqueBeanDefinitionException
> ```
>
> ![image-20231101225911193](https://s2.loli.net/2023/11/01/r8W4BJVyQSUiao7.png)

### BeanInstantiationException

![image-20231101230008228](https://s2.loli.net/2023/11/01/m6nGYOX5CyNgTLd.png)

> ```java
> org.springframework.beans.BeanInstantiationException
> ```
>
> ![image-20231101230129683](https://s2.loli.net/2023/11/01/9cg5uzbGmPQr7Lv.png)

### BeanCreationException

![image-20231101230217866](https://s2.loli.net/2023/11/01/QbT97tgBiLq6nlD.png)

> ```java
> org.springframework.beans.factory.BeanCreationException
> ```
>
> ![image-20231101230253166](https://s2.loli.net/2023/11/01/sn3uD5pKUlcN4J6.png)

### BeanDefinitionStroeException

![image-20231101230422761](https://s2.loli.net/2023/11/01/dZe3hir4UwXqClk.png)

> ```java
> org.springframework.beans.factory.BeanDefinitionStoreException
> ```
>
> ![image-20231101230439287](https://s2.loli.net/2023/11/01/1dOysVnKCuGQhcH.png)

## 面试题: ObjectFactory 和 BeanFactory 的区别

> ObjectFactory 和 BeanFactory 均提供了依赖查找的能力，但是二者存在一定的区别
>
> ObjectFactory 关注的仅是一个或则一种类型的依赖查找，并且其自身不具备依赖查找的能力，其依赖查找的能力是BeanFactory 输出的
>
> BeanFactory 提供了单一类型，集合类型以及层次性的等多种依赖查找方式，其是Spring Framework 的底层 IOC 容器

## 面试题:  BeanFactory#getBean 操作是线程安全的

> BeanFactory#getBean 方法的执行是线程安全的，其操作过程中有加互斥锁来保证多线程环境下的线程安全

![image-20231101231259471](https://s2.loli.net/2023/11/01/blIBVR5LeqNEySO.png)

![image-20231101231530481.png](https://s2.loli.net/2023/11/01/MiDAwgGCFcsbXYd.png)

## 依赖注入的模型和类型

### 手动注入模式

> 配置或者编程的方式，提前安排注入规则

#### XML 配置原信息

#### Java 注解配置元信息

API 配置元信息

### 自动模式

> 实现方提供依赖自动关联的方式，按照内建的注入规则

![image-20231101232906473](https://s2.loli.net/2023/11/01/7W9FnkTZQLPOEDg.png)

> autowring（自动绑定）

![image-20231101233127849](https://s2.loli.net/2023/11/01/IwZ7CreWq1ugF5l.png)

### autowiring modes

| 模式        | 说明                                                         |
| ----------- | ------------------------------------------------------------ |
| no          | 默认值 未激活 autowiring 需要手动指定依赖注入对象            |
| byType      | 根据注入的依赖的属性名称作为Bean名称来进行依赖查询，并将查询的结果赋值给当前属性 |
| byName      | 根据注入的依赖的类型进行查询，并将查询的结果赋值到当前属性   |
| constructor | 特殊的type 用于构造器参数                                    |

#### autowring的不足

> https://docs.spring.io/spring-framework/docs/5.3.30/reference/html/core.html#beans-autowired-exceptions

官方的说明:

![image-20231102221533147](https://s.ires.cc:9099/files/2023/11/02/image-20231102221533147.png)

##### ChatGPT 3.5 模型对于上述内容的翻译

> 自动装配的局限性和缺点
>
> 自动装配在整个项目中始终一致使用时效果最佳。如果通常情况下不使用自动装配，仅用它来连接一个或两个bean定义可能会让开发人员感到困惑。
>
> 考虑自动装配的限制和缺点:
>
> - 显式设置属性和构造函数参数中的依赖项始终会覆盖自动装配。您无法自动装配诸如基本类型、字符串和类（以及这些简单属性的数组）之类的简单属性。这一限制是设计上的考虑。
>
> - 自动装配不如显式装配精确。尽管如前文所述，Spring会小心避免在存在模糊性时进行猜测，以免产生意外结果。您的Spring管理对象之间的关系不再明确记录。
>
> - 有可能无法将连接信息提供给可能从Spring容器生成文档的工具。
>
> - 容器中的多个bean定义可能与要自动装配的setter方法或构造函数参数指定的类型匹配。对于数组、集合或Map实例，这并非一定是问题。但对于需要单个值的依赖项，这种模糊性并非会被随意解决。如果没有唯一的bean定义可用，就会抛出异常。
>
> 在后一种情况下，您有几个选择:
>
> - 放弃自动装配，选择显式装配。
>
> - 通过将bean定义的autowire-candidate属性设置为false来避免为其自动装配，具体方法请参阅下一节的描述。
>
> - 通过将其<bean/>元素的primary属性设置为true来指定单个bean定义为主要候选项。
>
> - 实施基于注解的配置提供的更精细控制，具体方法请参阅基于注解的容器配置中的描述。

## Setter 方法注入

### 注入方式分类

- 手动模式

  - XML资源配置元信息

    ```xml
    <bean id="user" class="com.study.pojo.User">
        <property name="parnet" ref="superUser"/>
    </bean>
    ```

    

  - Java注解配置元信息

    ```java
    @Bean
    public UserHolder userHolder(User user){
        return UserHolderBuilder.create().user(user).build();
    }
    ```

    

  - 基于API配置元信息

    ```java
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    
    BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(UserHodler.class);
    
    applicationContext.register(Config.class);
    
    beanDefitnitionBuilder.addPropertyReference("parent","superUser");
    BeanDefiniton beanDefinition = beanDefinitionBuilder.getBeanDefinition();
    application.registerBeanDefinition("userHolder",beanDefinition);
    
    applicationContext.refresh();
    ```

    

- 自动模式

  - byType

    ```xml
    <!-- the property type as a require type lookup on spring ioc -->
    <bean id="userHolder" class="com.study.pojo.UserHolder" autowire="byType"/>
    ```

  - byName

    ```xml
    <!-- the property name as beanName lookup on spring ioc -->
    <bean id="userHolder" class="com.study.pojo.UserHolder" autowire="byName"/>
    ```

## 构造器注入

### 注入方式分类

- 手动模式

  - XML配置元信息
  - Java注解配置元信息
  - 基于API配置元信息

- 自动模式

  - constructor

    ```java
    // superCat 的三个构造器
    	public SuperCat() {
    	}
    
    	public SuperCat(String superName) {
    		this.superName = superName;
    	}
    
    	public SuperCat(Cat cat){
    		super.id = cat.id;
    		super.name=cat.name;
    	}
    ```

    ```xml
    <!-- creaete spring bean  by constructor arguments -->
    <bean id="superCat" class="com.study.pojo.SuperCat"  autowire="constructor"/>
    ```

## 字段注入

- @Autowired

  > org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor

- @Resouce

  > javax.annotation.Resource

  > ```java
  > org.springframework.context.annotation.CommonAnnotationBeanPostProcessor
  > ```
  >
  > ![image-20231102231702064](https://s.ires.cc:9099/files/2023/11/02/image-20231102231702064.png)

- @Inject

  > javax.inject.Inject

  > ```java
  > org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor
  > ```
  >
  > ![image-20231102231543660](https://s.ires.cc:9099/files/2023/11/02/image-20231102231543660.png)

## 方式注入

- @Autowired
- @Resource
- @Inject
- @Bean

## 接口回调注入

![image-20231102232900103](https://s.ires.cc:9099/files/2023/11/02/image-20231102232900103.png)

1. org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#doCreateBean
2. org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#initializeBean(java.lang.String, java.lang.Object, org.springframework.beans.factory.support.RootBeanDefinition)
3. org.springframework.context.support.ApplicationContextAwareProcessor#postProcessBeforeInitialization
4. ![image-20231102233130552](https://s.ires.cc:9099/files/2023/11/02/image-20231102233130552.png)
5. ![image-20231102233750046](https://s.ires.cc:9099/files/2023/11/02/image-20231102233750046.png)
6. ![image-20231102233642699](https://s.ires.cc:9099/files/2023/11/02/image-20231102233642699.png)

## 依赖注入类型的选择

- 低依赖的注入
  - 构造器依赖注入
- 多依赖注入
  - Setter 方法依赖注入
- 便利性依赖注入
  - 字段依赖注入
- 声明式依赖注入
  - 方法依赖注入

## 基础类型的注入

![image-20231113223854916](https://s.ires.cc:9099/files/2023/11/13/image-20231113223854916.png)

```xml
<bean id='user' class='com.study.entity.User'>
    <!-- private Long id-->
  <property name='id' value='3574857485454'/>
    <!-- private String name-->
  <property name='name' value='uijdk'/>  
    <!-- private City workCity (Enum)-->
  <property name='workCity' value='SHANGHAI,BEIJING'/>  
    <!-- private Set<City> lifeCity (Enum)-->
  <property name='lifeCity'>
      <list>
         <value>HANGZHOU</value>
         <value>JIEYANG</value>
      </list>
  </property>  
  <!--org.springframework.core.io.Resource-->
  <!-- private Resource properties -->  
   <property value='classpath:/META-INF/user/user-config.propeties'/>
</bean>
```

## @Qualifier 

> org.springframework.beans.factory.annotation.Qualifier

- 通过Bean名称限定
- 通过分组限定

> SpringCloud @LoadBalanced 就是对于 @Qualifier 的拓展

## 延迟依赖注入

- 单一类型
- 集合类型

### ObjectFactory

> org.springframework.beans.factory.ObjectFactory

### ObjectProvider

> org.springframework.beans.factory.ObjectProvider

![image-20231113230249766](https://s.ires.cc:9099/files/2023/11/13/image-20231113230249766.png)

```java
@Autowired
private ObjectPrivoder<User> userProvider;
```

## Spring IOC 的依赖处理的过程

### 入口

![image-20231114224513541](https://s.ires.cc:9099/files/2023/11/14/image-20231114224513541.png)

> 1.  ```java
>     @Autowired
>     private Cat cat;
>     ```
>
> 2. ![image-20231114225046471](https://s.ires.cc:9099/files/2023/11/14/image-20231114225046471.png)
>
> 3. ![image-20231114225245452](https://s.ires.cc:9099/files/2023/11/14/image-20231114225245452.png)
>
> 4. 如果 Spring IOC 容器中存在当前依赖类型的多个`bean`
>
>    ![image-20231114230102183](https://s.ires.cc:9099/files/2023/11/14/image-20231114230102183.png)
>
>    ![image-20231114230427656](https://s.ires.cc:9099/files/2023/11/14/image-20231114230427656.png)
>
>    ![image-20231114230600778](https://s.ires.cc:9099/files/2023/11/14/image-20231114230600778.png)
>
>    ![image-20231114230656917](https://s.ires.cc:9099/files/2023/11/14/image-20231114230656917.png)

> 1. ```java
>    @Autowired
>    private ObjectProvider<SuperCat> superCatProvider;
>    ```
>
> 2. ![image-20231114231928971](https://s.ires.cc:9099/files/2023/11/14/image-20231114231928971.png)
>
> 3. ![image-20231114232027343](https://s.ires.cc:9099/files/2023/11/14/image-20231114232027343.png)
>
> 4. ![image-20231114232110882](https://s.ires.cc:9099/files/2023/11/14/image-20231114232110882.png)
>
> 5. ![image-20231114232250531](https://s.ires.cc:9099/files/2023/11/14/image-20231114232250531.png)
>
> 6. 如果我们调用 `ObjectProvider#getIfAvailable`
>
> 7. ![image-20231114232708093](https://s.ires.cc:9099/files/2023/11/14/image-20231114232708093.png)

> 1. ```java
>    @Autowired
>    private Optional<User> userOpt;
>    ```
>
> 2. ![image-20231114232958340](https://s.ires.cc:9099/files/2023/11/14/image-20231114232958340.png)

> 1. ```java
>    @Autowired
>    private Map<String,Cat> catMap;
>    ```
>
> 2. > org.springframework.beans.factory.support.DefaultListableBeanFactory#resolveMultipleBeans
>
> 3. ![image-20231114233348005](https://s.ires.cc:9099/files/2023/11/14/image-20231114233348005.png)

> 如果我们在 注入 Bean 的 时候，使用 @Lazy 注解
>
> 1. ```java
>    @Lazy
>    @Autowired
>    private Cat cat;
>    ```
>
> 2. ![image-20231114233807136](https://s.ires.cc:9099/files/2023/11/14/image-20231114233807136.png)
>
> 3. ![image-20231114233830130](https://s.ires.cc:9099/files/2023/11/14/image-20231114233830130.png)
>
> 4. ![image-20231114234329019](https://s.ires.cc:9099/files/2023/11/14/image-20231114234329019.png)

> 依赖描述符: DependencyDescriptor

> 自动绑定候选对象处理器: AutowireCandidateResolver

## @Autowired 注入过程

![image-20231115001919014](https://s.ires.cc:9099/files/2023/11/15/image-20231115001919014.png)

- 元信息解析

  > org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor#postProcessMergedBeanDefinition

- 依赖查找

- 依赖注入

  > org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor#postProcessProperties

```java
@Autowaired
private Cat cat;
```

![image-20231114235251415](https://s.ires.cc:9099/files/2023/11/14/image-20231114235251415.png)

![image-20231114235319482](https://s.ires.cc:9099/files/2023/11/14/image-20231114235319482.png)

![image-20231114235529814](https://s.ires.cc:9099/files/2023/11/14/image-20231114235529814.png)

## @Inject JSR330 注解 注入

> ![image-20231115001202157](https://s.ires.cc:9099/files/2023/11/15/image-20231115001202157.png)
>
> ![image-20231115000929832](https://s.ires.cc:9099/files/2023/11/15/image-20231115000929832.png)
>
> ![image-20231115001107451](https://s.ires.cc:9099/files/2023/11/15/image-20231115001107451.png)

## Java 通用注解注入原理

> CommonAnnotationBeanPostProcessor
>
> ![image-20231115001952323](https://s.ires.cc:9099/files/2023/11/15/image-20231115001952323.png)
>
> ![image-20231115001331863](https://s.ires.cc:9099/files/2023/11/15/image-20231115001331863.png)
>
> 
>
> ![image-20231115001503306](https://s.ires.cc:9099/files/2023/11/15/image-20231115001503306.png)
>
> ![image-20231115001543898](https://s.ires.cc:9099/files/2023/11/15/image-20231115001543898.png)
>
> ![image-20231115001559385](https://s.ires.cc:9099/files/2023/11/15/image-20231115001559385.png)
>
> ![image-20231115001650086](https://s.ires.cc:9099/files/2023/11/15/image-20231115001650086.png)

## 自定义依赖注入注解

### 方式一

![image-20231115002123175](https://s.ires.cc:9099/files/2023/11/15/image-20231115002123175.png)

```java
......
@Autowired
public @interface MyAutowired {
    
}
```

### 方式二

![image-20231115002603911](https://s.ires.cc:9099/files/2023/11/15/image-20231115002603911.png)

> org.springframework.context.annotation.AnnotationConfigUtils#registerAnnotationConfigProcessors(org.springframework.beans.factory.support.BeanDefinitionRegistry, java.lang.Object)
>
> ![image-20231115003443686](https://s.ires.cc:9099/files/2023/11/15/image-20231115003443686.png)

![image-20231115002256806](https://s.ires.cc:9099/files/2023/11/15/image-20231115002256806.png)

```java
@Bean(org.springframework.context.annotation.AnnotationConfigUtils.AUTOWIRED_ANNOTATION_PROCESSOR_BEAN_NAME)
public static AutowiredAnnotationBeanPostProcessor autowiredAnnotationBeanPostProcessor(){
    AutowiredAnnotationBeanPostProcessor autowiredAnnotionBeanPostProcessor = new AutowiredAnnotationBeanPostProcessor();
    // Inject 包 可能不存在
    Set<Class<? extends Annotation>> autowiredAnnotationTypes =new LinkedHashSet<>(Arrays.asList(Autowired.class,Value.class,Inject.class,InjectUser.class))
    autowiredAnnotationBeanPostProcessor.setAutowiredAnnotationTypes();
    return autowiredAnnotationBeanPostProcessor;
}
```

### 方式三

```java
@Order(Ordered.LOWEST_PRECEDENCE-3)
@Bean
public AutowiredAnnotaionBeanPostProcessor injectUserAutowiredBeanPostProcessor(){
    AutowiredAnnotationBeanPostProcessor injectUserAutowiredBeanPostProcessor = new AutowiredAnnotationBeanProcessor();
    injectUserAutowiredBeanPostProcessor.setAutowiredAnnotationType(InjectUser.class);
    return injectUserAutowiredBeanPostProcessor;
}
```

## 面试题 ：有多少依赖注入的方式

- 构造器注入
- Setter 方法注入
- 方法注入
- 属性注入
- 接口回调注入

## 面试题: 你偏好构造器注入还是Setter 注入

> 构造器注入适合注入少量的必须依赖注入，Setter 方法注入 适用于可选依赖注入

## Spring 依赖查找的来源

- BeanDefinition 

  - ```xml
    <bean id="..." class = "......"/>
    ```

  - `@Bean`

  - BeanDefinitionBudiler

  - API 实现的单列对象

- Spring 内建 BeanDefinition

  > ```java
  > org.springframework.context.annotation.AnnotationConfigUtils#registerAnnotationConfigProcessors(org.springframework.beans.factory.support.BeanDefinitionRegistry, java.lang.Object)
  > ```
  >
  > ```xml
  > <context:annotation-config/>
  > ```

  ![image-20231115233128795](https://s.ires.cc:9099/files/2023/11/15/image-20231115233128795.png)

- Spring 内建 Bean 实例

  ![image-20231115233000482](https://s.ires.cc:9099/files/2023/11/15/image-20231115233000482.png)

## Spring 依赖注入的来源

- BeanDefintion

  - ```xml
    <bean id = "..." class = "......"/>
    ```

  - `@Bean`

  - `BeanDefnitionBudiler`

  - Spring 内建的 BeanDefinition

  - Java API

- Spring 内建的Bean实例

- 游离的 Spring 内建实例 `ResolveableDependency`

  - ![image-20231115234012414](https://s.ires.cc:9099/files/2023/11/15/image-20231115234012414.png)
  - ChatGPT3.5 对于 这段注释的解释
    - ![image-20231115234757591](https://s.ires.cc:9099/files/2023/11/15/image-20231115234757591.png)
  - ![image-20231115234104567](https://s.ires.cc:9099/files/2023/11/15/image-20231115234104567.png)

### 小总结

> Spring的 依赖查找和依赖注入有一定的差异的，其差异大致可以总结如下：
>
> ![image-20231115234948553](https://s.ires.cc:9099/files/2023/11/15/image-20231115234948553.png)
>
> 也就是说，我们可以是通过如下代码 注入 `BeanFactory`
>
> ```java
> //可以注入 BeanFactory 
> @Autowired
> private BeanFactory  beanFactory;
> 
> // 以下代码执行会报 NosuchBeanDefinition
> applicationContext.getBean(BeanFactory.class);
> // 其它的三个`ResolvableDependency`
> ```

## Spring BeanDefinition 的来源

### 要素

- 元数据 `BeanDefinition`
- 注册  : `org.springframework.beans.factory.support.BeanDefinitionRegistry#registerBeanDefinition`
- 类型 延迟和非延迟
- 顺序: BeanDefinition 的注册顺序

![image-20231115235807904](https://s.ires.cc:9099/files/2023/11/15/image-20231115235807904.png)

![image-20231115235843770](https://s.ires.cc:9099/files/2023/11/15/image-20231115235843770.png)

![image-20231115235908655](https://s.ires.cc:9099/files/2023/11/15/image-20231115235908655.png)

![image-20231116000024312](https://s.ires.cc:9099/files/2023/11/16/image-20231116000024312.png)

## 如何注册非Spring管理对象作为依赖注入来源

```java
org.springframework.beans.factory.config.ConfigurableListableBeanFactory#registerResolvableDependency
```

![image-20231116234627295](https://s.ires.cc:9099/files/2023/11/16/image-20231116234627295.png)

> ```java
> org.springframework.context.support.AbstractApplicationContext#addBeanFactoryPostProcessor
> ```

```java
AnnotationConfigApplicationContext  annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
annotationConfigApplicationContext.register(AppConfig.class);
annotationConifgApplicationContext.addBeanFactoryPostProcessor( configurableListableBeanFactory -> {
    configurableListableBeanFactory.registerResolvableDependency(String.class,"HaHaHa~ Study~ Study~");
});
annotationConfigApplicationContext.refresh();
annotationConfigApplicationContext.close();
```

## 外部化配置的依赖来源

```java
@Value("${user.id}")
private Long userId;

@Value("${user.config}")
private Resource userResource;
```

> ```java
> org.springframework.beans.factory.support.DefaultListableBeanFactory#doResolveDependency
> ```
>
> ![image-20231117000535946](https://s.ires.cc:9099/files/2023/11/17/image-20231117000535946.png)
>
> ```java
> org.springframework.beans.factory.config.EmbeddedValueResolver
> ```

## 面试题: 依赖查找来源和依赖注入来源是否相同

> 否，依赖查找仅限于SpringBeanDefinition以及单列对象，而依赖注入的来源还包括了 `ResolvableDependency`和`基于外部化配置的依赖` `@Vaule`

## 面试题: 单例对象在IOC容器启动之后是否可以继续注册呢

> ```java
> org.springframework.beans.factory.config.SingletonBeanRegistry#registerSingleton
>     
>     org.springframework.beans.factory.support.DefaultSingletonBeanRegistry#registerSingleton
>      
>         org.springframework.beans.factory.support.DefaultListableBeanFactory#registerSingleton
> ```
>
> ![image-20231117001534910](https://s.ires.cc:9099/files/2023/11/17/image-20231117001534910.png)
>
> Spring IOC 启动之后，会有一个 freezeConfiguration
>
> ![image-20231117001716505](https://s.ires.cc:9099/files/2023/11/17/image-20231117001716505.png)
>
> org.springframework.beans.factory.support.DefaultListableBeanFactory#getBeanDefinitionNames
>
> ![image-20231117001755149](https://s.ires.cc:9099/files/2023/11/17/image-20231117001755149.png)

> 可以的，单例对象的注册和BeanDefiniton 的注册不同，BeanDefinition 受 ConfigurableListableBeanFactory#freezeBeanDefinition的影响，从而冻结注册,单例对象的注册不受u这个影响

### 面试题:  Spring 依赖注入的来源有哪些

- SpringBeanDefinition
- 单例对象
- resolvableDependency
- @Value 的外部化配置

## Spring Bean 的内置作用域

- singleton

  > ![image-20231122231926372](https://s.ires.cc:9099/files/2023/11/22/image-20231122231926372.png)
  >
  > ![image-20231122231027273](https://s.ires.cc:9099/files/2023/11/22/image-20231122231027273.png)

- prototype

  > ```java
  > org.springframework.beans.factory.config.ConfigurableBeanFactory#SCOPE_SINGLETON
  > 
  > org.springframework.beans.factory.config.ConfigurableBeanFactory#SCOPE_PROTOTYPE    
  > ```
  >
  > ![image-20231122232011541](https://s.ires.cc:9099/files/2023/11/22/image-20231122232011541.png)
  >
  > > Spring 没办法管理 `prototype` 类型 Bean 的完整生命周期，Spring 会执行其初始化方法，但是不会执行其初始化方法
  > >
  > > - ![image-20231122232400398](https://s.ires.cc:9099/files/2023/11/22/image-20231122232400398.png)
  > > - 官方建议我们可以自定义BeanPostProcessor 执行 `prototype` bean 的清扫工作
  > > - 我们可以通过定义个`singleton` 的单实例Bean，为其定义个销毁方法，在此`singleton`bean中执行`prototype` 的初始化

- request

  - ![image-20231122231138004](https://s.ires.cc:9099/files/2023/11/22/image-20231122231138004.png)
  - ![image-20231122231231675](https://s.ires.cc:9099/files/2023/11/22/image-20231122231231675.png)

- session

  - ![image-20231122231306218](https://s.ires.cc:9099/files/2023/11/22/image-20231122231306218.png)

  > ![image-20231122231718677](https://s.ires.cc:9099/files/2023/11/22/image-20231122231718677.png)
  >
  > ![image-20231122231555575](https://s.ires.cc:9099/files/2023/11/22/image-20231122231555575.png)
  >
  > ![image-20231122231629732](https://s.ires.cc:9099/files/2023/11/22/image-20231122231629732.png)

- applicaiton（ServletContext）

  > ```java
  > org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
  > 
  > org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
  > 
  > org.springframework.web.context.WebApplicationContext#SCOPE_APPLICATION    
  > ```
  >
  > ![image-20231122231821088](https://s.ires.cc:9099/files/2023/11/22/image-20231122231821088.png)

### 自定义Spring Bean 的 Scope

1. 实现 Scope 接口

   - org.springframework.beans.factory.config.Scope

2. 注册

   - API: org.springframework.beans.factory.config.ConfigurableBeanFactory#registerScope

   - XML

     ![image-20231122233256511](https://s.ires.cc:9099/files/2023/11/22/image-20231122233256511.png)

#### 实现

```java
import org.springframework.beans.factory.config.Scope
import org.springframework.core.NamedThreadLocal    
public ThreadLocalScope implements Scope{
    private final NamedThreadLocal<Map<String,Object>> threadLocal =new NamedThreadLocal<>("threadlocal-scope"){
        protected Map<String,Object> initialValue() {
           return new HashMap<>();
       }
    };
    
    public Object get(String name, ObjectFactory<?> objectFactory){
         Map<String,Object> context = getContext();
         Object obj = context.get(name);
         if(Objects.isNull(obj)){
            obj =objectFactory.getObject();
            context.put(name.obj);
            obj=context.get(name); 
         }
        
        return obj;
    }
    
    ... ...
        
    private Map<String,Object> getContext(){
       return threadlocal.get();
    }
    
    public String getConversationId(){
        return String.valueOf(Thread.currentThread().getId());
    }
}
```

> # 如何注册 自定义的 Scope?
>
> ![image-20231122234318165](https://s.ires.cc:9099/files/2023/11/22/image-20231122234318165.png)
>
> ![image-20231122234339377](https://s.ires.cc:9099/files/2023/11/22/image-20231122234339377.png)
>
> ```java
> AnnotationConfigApplicaitonContext applicationContext =new AnnotationConfigApplicaitonContext();
> applicationContext.addBeanFactoryPostProcessor(configurableBeanFacory -> configurableBeanFacotry.resgisterScope("threadlocal-scope",new ThreadLocalScope()));
> ```

### Spring Cloud RefreshScope

![image-20231122234935149](https://s.ires.cc:9099/files/2023/11/22/image-20231122234935149.png)

![image-20231122235134667](https://s.ires.cc:9099/files/2023/11/22/image-20231122235134667.png)

## 面试题: Spring 内建Bean作用域有哪些

- singleton
- prototype
- request
- session
- application
- webscoket

## 面试题: singletion Bean 在应用中是否是唯一的

不是的，Singletion Bean 在 当前 IOC 容器中是单例，但是一个应用可以包含多个 IOC 容器

## 面试题: `application` 这个给作用域是有其它的替代方案

可以的，`singleton` bean 和 `application` bean 没有本质的区别

## Spring Bean 元信息的配置

- 面向资源

  - XML

  - properties （spring 5.3 的时候已经 Deprecated）

- 面向注解

  - @Bean
  - @Component
  - @Import
  - @ImportSeletor

- Java API

  - > **BeanDefinitionRegistry**
    >
    > org.springframework.beans.factory.support.BeanDefinitionRegistry
    >
    > ![image-20231124223812618](https://s.ires.cc:9099/files/2023/11/24/image-20231124223812618.png)
    >
    > org.springframework.beans.factory.support.DefaultListableBeanFactory#registerBeanDefinition

## Spring BeanDefition 解析阶段

![image-20231124224106599](https://s.ires.cc:9099/files/2023/11/24/image-20231124224106599.png)

![image-20231124225022373](https://s.ires.cc:9099/files/2023/11/24/image-20231124225022373.png)

### XmBeanDefinitionReader

![image-20231124225331119](https://s.ires.cc:9099/files/2023/11/24/image-20231124225331119.png)

![image-20231124225402961](https://s.ires.cc:9099/files/2023/11/24/image-20231124225402961.png)

### AnnotatedBeanDefinitionReader

![image-20231124225258609](https://s.ires.cc:9099/files/2023/11/24/image-20231124225258609.png)

![image-20231124225205263](https://s.ires.cc:9099/files/2023/11/24/image-20231124225205263.png)

> 注册的 bean 可以不标注 `@Configuration` 注解

## Spring BeanDefinition 的合并阶段

> org.springframework.beans.factory.config.ConfigurableBeanFactory#getMergedBeanDefinition
>
> ![image-20231124225958549](https://s.ires.cc:9099/files/2023/11/24/image-20231124225958549.png)

### BeanDefinition merged 流程分析

![image-20231124230250041](https://s.ires.cc:9099/files/2023/11/24/image-20231124230250041.png)

![image-20231124230416723](https://s.ires.cc:9099/files/2023/11/24/image-20231124230416723.png)

![image-20231124230449964](https://s.ires.cc:9099/files/2023/11/24/image-20231124230449964.png)

> org.springframework.beans.factory.support.AbstractBeanFactory#getMergedBeanDefinition(java.lang.String, org.springframework.beans.factory.config.BeanDefinition, org.springframework.beans.factory.config.BeanDefinition)
>
> ![image-20231124230555370](https://s.ires.cc:9099/files/2023/11/24/image-20231124230555370.png)

![image-20231124230645021](https://s.ires.cc:9099/files/2023/11/24/image-20231124230645021.png)

![image-20231124231032738](https://s.ires.cc:9099/files/2023/11/24/image-20231124231032738.png)

![image-20231124231140848](https://s.ires.cc:9099/files/2023/11/24/image-20231124231140848.png)

> GenericBeanDefinition  -- > RootBeanDefinition
>
> ![image-20231124232431173](https://s.ires.cc:9099/files/2023/11/24/image-20231124232431173.png)
>
> ![image-20231124232406119](https://s.ires.cc:9099/files/2023/11/24/image-20231124232406119.png)

## Spring BeanClass 加载阶段

> org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#createBean(java.lang.String, org.springframework.beans.factory.support.RootBeanDefinition, java.lang.Object[])

![image-20231124233229381](https://s.ires.cc:9099/files/2023/11/24/image-20231124233229381.png)

![image-20231124233721424](https://s.ires.cc:9099/files/2023/11/24/image-20231124233721424.png)

## Spring Bean 的实例化前阶段

- 非主流的生命周期- Bean 实例化前的阶段

  > 

  ![image-20231124234143515](https://s.ires.cc:9099/files/2023/11/24/image-20231124234143515.png)

### `resolveBeforeInstanttiation`

![image-20231124234224853](https://s.ires.cc:9099/files/2023/11/24/image-20231124234224853.png)

![image-20231124234346402](https://s.ires.cc:9099/files/2023/11/24/image-20231124234346402.png)

> org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation

## Spring Bean 的实例化

- 传统的实例化方式

  - 实例化策略

    > ![image-20231124234938827](https://s.ires.cc:9099/files/2023/11/24/image-20231124234938827.png)
    >
    > ![image-20231124234958445](https://s.ires.cc:9099/files/2023/11/24/image-20231124234958445.png)
    >
    > ![image-20231124235455502](https://s.ires.cc:9099/files/2023/11/24/image-20231124235455502.png)
    >
    >  

## Spring Bean 实例化前阶段

> ```java
> org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor
> ```
>
> ![image-20231128231400519](https://s.ires.cc:9099/files/2023/11/28/image-20231128231400519.png)

### 我们可以**阻止**`Spring Bean` 实例化

```java
org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation
```

![image-20231128231921365](https://s.ires.cc:9099/files/2023/11/28/image-20231128231921365.png)

![image-20231128232335422](https://s.ires.cc:9099/files/2023/11/28/image-20231128232335422.png)

![image-20231128232355527](https://s.ires.cc:9099/files/2023/11/28/image-20231128232355527.png)

![image-20231128232726134](https://s.ires.cc:9099/files/2023/11/28/image-20231128232726134.png)

#### InstantiationAwareBenPostProcessor#postProcessorBeforeInstantiation

> ```javascript
> org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#createBean(java.lang.String, org.springframework.beans.factory.support.RootBeanDefinition, java.lang.Object[])
> ```
>
> ![image-20231128233123354](https://s.ires.cc:9099/files/2023/11/28/image-20231128233123354.png)
>
> ```java
> org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#resolveBeforeInstantiation
> ```
>
> ![image-20231128233149271](https://s.ires.cc:9099/files/2023/11/28/image-20231128233149271.png)

## Spring Bean 实例化后阶段

```java
org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor#postProcessAfterInstantiation
```

![image-20231128233701926](https://s.ires.cc:9099/files/2023/11/28/image-20231128233701926.png)

![image-20231128233633580](https://s.ires.cc:9099/files/2023/11/28/image-20231128233633580.png)

#### `InstantiationAwareBeanPostProcessor#postProcessorAfterInstantiation`

> 调用的入口
>
> ```java
> org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#populateBean
> ```
>
> ![image-20231128233858698](https://s.ires.cc:9099/files/2023/11/28/image-20231128233858698.png)
>
> ![image-20231128234015680](https://s.ires.cc:9099/files/2023/11/28/image-20231128234015680.png)
>
> 

## Spring Bean 属性赋值前的处理

```java
org.springframework.beans.PropertyValue
org.springframework.beans.PropertyValues
// before Spring 5.1
org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor#postProcessPropertyValues
// after Spring  5.1
org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor#postProcessProperties    
```

### `InstantiationAwareBeanPostProcessor#postProcessorProperties`

> ```java
> org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#populateBean
> ```
>
> ![image-20231128234640836](https://s.ires.cc:9099/files/2023/11/28/image-20231128234640836.png)

## Spring Aware 接口回调阶段(按照回调顺序排列)

### BeanFactory 支持的 Aware 回调接口

```java
org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#invokeAwareMethods
```

![image-20231128235340412](https://s.ires.cc:9099/files/2023/11/28/image-20231128235340412.png)

1. BeanNameAware
2. BeanClassLoaderAware
3. BeanFactoryAware

### ApplicationContext 支持回调 `Aware` 接口

```java
org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#initializeBean(java.lang.String, java.lang.Object, org.springframework.beans.factory.support.RootBeanDefinition)

org.springframework.context.support.ApplicationContextAwareProcessor
```

![image-20231129000544934](https://s.ires.cc:9099/files/2023/11/29/image-20231129000544934.png)

![image-20231129000633190](https://s.ires.cc:9099/files/2023/11/29/image-20231129000633190.png)

![image-20231129000827457](https://s.ires.cc:9099/files/2023/11/29/image-20231129000827457.png)

![image-20231129000646496](https://s.ires.cc:9099/files/2023/11/29/image-20231129000646496.png)

![image-20231128235759085](https://s.ires.cc:9099/files/2023/11/28/image-20231128235759085.png)

![image-20231128235744526](https://s.ires.cc:9099/files/2023/11/28/image-20231128235744526.png)

4. EnviromentAware

5. EmbeddedValueResolverAware

6. ResourceLoaderAware

7. ApplicationEnventPlublisherAware

8. MessageSourceAware

9. ApplicationStartupAware

10. ApplicationContextAware

## Spring Bean 初始化前阶段

> 已经完成的流程
>
> - Bean的实例化
> - 完成了属性赋值
> - 完成了Aware 接口的回调
>
> org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#doCreateBean
>
> ![image-20231129224313873](https://s.ires.cc:9099/files/2023/11/29/image-20231129224313873.png)
>
> ![](https://s.ires.cc:9099/files/2023/11/29/image-20231129224313873.png)
>
> org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#initializeBean(java.lang.String, java.lang.Object, org.springframework.beans.factory.support.RootBeanDefinition)
>
> ![image-20231129224657329](https://s.ires.cc:9099/files/2023/11/29/image-20231129224657329.png)
>
> ![image-20231129224735049](https://s.ires.cc:9099/files/2023/11/29/image-20231129224735049.png)

## Spring Bean 的初始化阶段

1. @PostContract 注解

2. 实现 Spring 的 InitializingBean 接口

   ![image-20231129225059499](https://s.ires.cc:9099/files/2023/11/29/image-20231129225059499.png)

   ![image-20231129225209305](https://s.ires.cc:9099/files/2023/11/29/image-20231129225209305.png)

   3. 自定义初始化方法

> - 自定义初始化方法; 实现 InitializingBean 接口
>
>   ![image-20231129225412194](https://s.ires.cc:9099/files/2023/11/29/image-20231129225412194.png)
>
>   ![image-20231129225500659](https://s.ires.cc:9099/files/2023/11/29/image-20231129225500659.png)

### `@PostContruct` 实现

> ![image-20231129225648534](https://s.ires.cc:9099/files/2023/11/29/image-20231129225648534.png)
>
> ![image-20231129225718335](https://s.ires.cc:9099/files/2023/11/29/image-20231129225718335.png)
>
> CommonAnnotationBeanPostProcessor  parent InitDestoryAnnotationBeanPostProcessor 
>
> BeanPostProcessor#postProcessorBeforeInitialization
>
> ![image-20231129225928056](https://s.ires.cc:9099/files/2023/11/29/image-20231129225928056.png)
>
> ![image-20231129225953819](https://s.ires.cc:9099/files/2023/11/29/image-20231129225953819.png)

## Spring Bean 初始化后的阶段

> BeanPostProcessor@postProcessorAfterInitialization
>
> ![image-20231129230228563](https://s.ires.cc:9099/files/2023/11/29/image-20231129230228563.png)

## Spring Bean 初始化完成阶段

> @since  spring 4.1 
>
> ![image-20231129230349658](https://s.ires.cc:9099/files/2023/11/29/image-20231129230349658.png)
>
> ![image-20231129230402038](https://s.ires.cc:9099/files/2023/11/29/image-20231129230402038.png)
>
> ![image-20231129230519298](https://s.ires.cc:9099/files/2023/11/29/image-20231129230519298.png)
>
> 执行方式
>
> > org.springframework.beans.factory.support.DefaultListableBeanFactory#preInstantiateSingletons
>
> ![image-20231129230749243](https://s.ires.cc:9099/files/2023/11/29/image-20231129230749243.png)
>
> ![image-20231129230805618](https://s.ires.cc:9099/files/2023/11/29/image-20231129230805618.png)
>
> > 我们常用的 ApplicationContext是如何触发的呢？
> >
> > org.springframework.context.support.AbstractApplicationContext#finishBeanFactoryInitialization
> >
> > ![image-20231129231014160](https://s.ires.cc:9099/files/2023/11/29/image-20231129231014160.png)
> >
> > - AnnotationConfigApplicationContext
> >
> > ![image-20231129231050146](https://s.ires.cc:9099/files/2023/11/29/image-20231129231050146.png)
> >
> > - ClassPathXmlApplicationContext
> >
> >   ![image-20231129231157361](https://s.ires.cc:9099/files/2023/11/29/image-20231129231157361.png)
> >
> > 

## Spring Bean 销毁前阶段

> DestructAwareBeanPostProcessor#postProcessorDestruction
>
> ![image-20231129231415547](https://s.ires.cc:9099/files/2023/11/29/image-20231129231415547.png)
>
> org.springframework.beans.factory.support.DisposableBeanAdapter#destroy

## Spring Bean 销毁阶段

> - org.springframework.context.support.AbstractApplicationContext#close
>   - org.springframework.context.support.AbstractApplicationContext#doClose
>     - org.springframework.context.support.AbstractApplicationContext#destroyBeans
>       - org.springframework.beans.factory.support.DefaultListableBeanFactory#destroySingletons
>         - ![image-20231129233006317](https://s.ires.cc:9099/files/2023/11/29/image-20231129233006317.png)

- @PreDestroy

> - CommonAnnotaionBeanPostProcessor
>   - InitDestructAnnotaionBeanPostProcessor
>     - DestructionAwareBeanPostProcessor
>
> ![image-20231129232229480](https://s.ires.cc:9099/files/2023/11/29/image-20231129232229480.png)

- 实现 Spring 的  DisposableBean 接口
- 自定义销毁方法

> ![image-20231129232033309](https://s.ires.cc:9099/files/2023/11/29/image-20231129232033309.png)
>
> ![image-20231129232057030](https://s.ires.cc:9099/files/2023/11/29/image-20231129232057030.png)
>
> ![image-20231129232115141](https://s.ires.cc:9099/files/2023/11/29/image-20231129232115141.png)

## 面试题：BeanPostProcessor的使用场景有哪些

> BeanPostProcessor 提供 SpringBean 初始化前后的生命周期回调，分别对应 postProcesoorBeforeInitialization 和 postProcessorAfterInitialization 方法。我们可以在这个两个回调方法里面对我们自己感兴趣的Bean进行增加，甚至是替换
>
> ![image-20231214130723886](https://s.ires.cc:9099/files/2023/12/14/image-20231214130723886.png)
>
> ![image-20231214130745948](https://s.ires.cc:9099/files/2023/12/14/image-20231214130745948.png)
>
> > `ApplicationContext`的 Aware回调就是基于`BeanPostProcessor` 进行实现的呢，其对应的是`ApplicationContextAwareProcessor`
> >
> > ![image-20231214131012302](https://s.ires.cc:9099/files/2023/12/14/image-20231214131012302.png)
> >
> > ![image-20231214131030035](https://s.ires.cc:9099/files/2023/12/14/image-20231214131030035.png)

## 面试题：BeanFactoryPostProcessor 和 BeanPostProcessor的区别

> `BeanFactoryPostProcessor` 是 Spirng BeanFactory （ConfigurableListableBeanFacotry）的后置处理器，用于拓展 `BeanFactory`或许使用 BeanFacotory 进行依赖查找或依赖注入。`BeanPostProcessor` 与 `BeanFactory`直接关联，其关联关系为 `N:1`
>
> ![image-20231214131756372](https://s.ires.cc:9099/files/2023/12/14/image-20231214131756372.png)
>
> > `BeanFactoryPostProcessor`必须依赖`ApplicationContext`执行，`BeanFactory`无法直接与其交互

## 面试题: BeanFactory 是怎样处理生命周期的？

> `BeanFactory`默认实现是`DefaultListableBeanFacoty`
>
> 1. `BeanDefinition`的注册阶段 registryBeanDefinition
>
>    - > ```java
>      > org.springframework.beans.factory.support.BeanDefinitionRegistry#registerBeanDefinition
>      > ```
>      >
>      > ![image-20231214223636400](https://s.ires.cc:9099/files/2023/12/14/202312142236996.png)
>
> 2. `BeanDefinition`的合并阶段 getMergedBeanDefinition
>
>    - > ```java
>      > org.springframework.beans.factory.support.AbstractBeanFactory#getMergedBeanDefinition(java.lang.String)
>      > ```
>      >
>      > ![image-20231214223826352](https://s.ires.cc:9099/files/2023/12/14/202312142238570.png)
>
> 3. `Bean`的实例化前阶段 resloveBeforeInstantation
>
>    - > ```java
>      > org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#createBean(java.lang.String, org.springframework.beans.factory.support.RootBeanDefinition, java.lang.Object[])
>      >     
>      >     org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#resolveBeforeInstantiation
>      > ```
>      >
>      > ![image-20231214224248726](https://s.ires.cc:9099/files/2023/12/14/202312142242790.png)
>
> 4. `Bean`的实例化阶段 createBeanInstance
>
>    - ![image-20231214224335161](https://s.ires.cc:9099/files/2023/12/14/202312142243207.png)
>
> 5. `Bean`的实例化后阶段 populateBean
>
>    ![image-20231214224405037](https://s.ires.cc:9099/files/2023/12/14/202312142244077.png)
>
> 6. `Bean`属性赋值前阶段 populateBean
>
>    - ![image-20231214224518465](https://s.ires.cc:9099/files/2023/12/14/202312142245518.png)
>
> 7. `Bean`属性赋值阶段 populateBean
>
>    - ![image-20231214224636184](https://s.ires.cc:9099/files/2023/12/14/202312142246321.png)
>
> 8. `Bean` Aware 接口回调阶段 initializationBean
>
>    - ![image-20231214224841622](https://s.ires.cc:9099/files/2023/12/14/202312142248025.png)
>    - ![image-20231214224859201](https://s.ires.cc:9099/files/2023/12/14/202312142249477.png)
>
> 9. `Bean`初始化前阶段 initializationBean
>
>    - ![image-20231214224945595](https://s.ires.cc:9099/files/2023/12/14/202312142249567.png)
>
> 10. `Bean`初始化阶段 initializationBean
>
>     - ![image-20231214225008317](https://s.ires.cc:9099/files/2023/12/14/202312142250549.png)
>     - ![image-20231214225029273](https://s.ires.cc:9099/files/2023/12/14/202312142250245.png)
>
> 11. `Bean`初始化后阶段 initializationBean
>
>     - ![image-20231214225103470](https://s.ires.cc:9099/files/2023/12/14/202312142251823.png)
>
> 12. `Bean`初始化完成阶段 preInstantiateSingletions
>
>     - > ```java
>       > org.springframework.beans.factory.support.DefaultListableBeanFactory#preInstantiateSingletons
>       > ```
>       >
>       > ![image-20231214225311244](https://s.ires.cc:9099/files/2023/12/14/202312142253665.png)
>       >
>       > ![image-20231214225342584](https://s.ires.cc:9099/files/2023/12/14/202312142253869.png)
>
> 13. `Bean`销毁前阶段 destoryBean
>
>     - > ```java
>       > org.springframework.context.support.AbstractApplicationContext#doClose
>       >     
>       > org.springframework.beans.factory.support.DefaultSingletonBeanRegistry#destroySingletons
>       >     
>       > org.springframework.beans.factory.support.DefaultListableBeanFactory#destroySingletons    
>       > ```
>
> 14. `Bean`销毁后阶段 destoryBean
>
>     - ```java
>       org.springframework.context.support.AbstractApplicationContext#onClose
>       ```

## Spring 配置元信息

### Spring Bean 配置元信息 `BeanDefinition`

> ![image-20231214230921642](https://s.ires.cc:9099/files/2023/12/14/202312142309757.png)

#### BeanDefinition 三种实现种实现

##### 1. RootBeanDefinition

> ![image-20231214231805940](https://s.ires.cc:9099/files/2023/12/14/202312142318965.png)

##### 2. GenericBeanDefition

> ![image-20231214231852132](https://s.ires.cc:9099/files/2023/12/14/202312142318165.png)

##### 3. AnnotateBeanDedifinition

> ![image-20231214231919855](https://s.ires.cc:9099/files/2023/12/14/202312142319970.png)

## Spring  Bean 属性元信息

### ProPertyValues

> Bean 的属性信息

- 可修改的实现

  - MutablePropertyValues

    - > ```java
      > org.springframework.beans.factory.support.BeanDefinitionBuilder
      > 
      > org.springframework.beans.factory.support.BeanDefinitionBuilder#addPropertyValue
      > 
      > org.springframework.beans.factory.support.AbstractBeanDefinition#getPropertyValues    
      > ```

  - PropertyValue

### Bean 属性上下文存储

> ```java
> org.springframework.core.AttributeAccessor
> ```
>
> ![image-20231214233105453](https://s.ires.cc:9099/files/2023/12/14/202312142331659.png)
>
> ![image-20231214233148942](https://s.ires.cc:9099/files/2023/12/14/202312142331085.png)

#### Bean 元信息元素

> ```java
> org.springframework.beans.BeanMetadataElement
> ```
>
> ![image-20231214233311963](https://s.ires.cc:9099/files/2023/12/14/202312142333636.png)

## Spring 容器配置元信息

#### Spring XML 配置元信息

##### Beans 元素 相关

![image-20231214233509656](https://s.ires.cc:9099/files/2023/12/14/202312142335078.png)

![image-20231214233930163](https://s.ires.cc:9099/files/2023/12/14/202312142339318.png)

##### 应用上下文相关

![image-20231214234057432](https://s.ires.cc:9099/files/2023/12/14/202312142340445.png)

![image-20231214234806524](https://s.ires.cc:9099/files/2023/12/14/202312142348685.png)

##### 源码小析

> ```java
> org.springframework.beans.factory.xml.BeanDefinitionParserDelegate
> 
> org.springframework.beans.factory.xml.BeanDefinitionParserDelegate#populateDefaults    
> ```
>
> ![image-20231214235028882](https://s.ires.cc:9099/files/2023/12/14/202312142350891.png)

## 基于 XML 资源装载 Spring Bean 配置元信息

![image-20231215002220210](https://s.ires.cc:9099/files/2023/12/15/202312150022291.png)

### XmlBeanDefinitionReader 源码小析

```java
org.springframework.beans.factory.xml.XmlBeanDefinitionReader#doLoadBeanDefinitions
```

![image-20231215012014312](https://s.ires.cc:9099/files/2023/12/15/202312150120595.png)

```java
org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader#doRegisterBeanDefinitions
```

![image-20231215012131717](https://s.ires.cc:9099/files/2023/12/15/202312150121712.png)

## 基于 Properties资源装载 Spring Bean 信息

![image-20231218224615532](https://s.ires.cc:9099/files/2023/12/18/202312182246578.png)

![image-20231218224458280](https://s.ires.cc:9099/files/2023/12/18/202312182245560.png)

![image-20231218224521628](https://s.ires.cc:9099/files/2023/12/18/202312182245729.png)

> ```java
> org.springframework.beans.factory.support.PropertiesBeanDefinitionReader#loadBeanDefinitions(org.springframework.core.io.support.EncodedResource, java.lang.String)
> ```
>
> ![image-20231218224708193](https://s.ires.cc:9099/files/2023/12/18/202312182247115.png)

> ```java
> org.springframework.beans.factory.support.PropertiesBeanDefinitionReader#registerBeanDefinitions(java.util.Map<?,?>, java.lang.String, java.lang.String)
> ```

### 基于 `Properties` 配置的 Bean 名称是什么呢

![image-20231218225244601](https://s.ires.cc:9099/files/2023/12/18/202312182252956.png)

## 基于 Java 注解装配 Spring Bean 配置元信息

![image-20231218225725075](https://s.ires.cc:9099/files/2023/12/18/202312182257180.png)

![image-20231218225736919](https://s.ires.cc:9099/files/2023/12/18/202312182257045.png)

![image-20231218225751438](https://s.ires.cc:9099/files/2023/12/18/202312182257350.png)

![](https://s.ires.cc:9099/files/2023/12/18/202312182258028.png)

![image-20231218225833050](https://s.ires.cc:9099/files/2023/12/18/202312182258118.png)

> ```java
> org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor
> ```
>
> ![image-20231218230344710](https://s.ires.cc:9099/files/2023/12/18/202312182303833.png)

> ```java
> org.springframework.context.annotation.CommonAnnotationBeanPostProcessor
> ```
>
> ![image-20231218230508038](https://s.ires.cc:9099/files/2023/12/18/202312182305029.png)
>
> ![image-20231218230752926](https://s.ires.cc:9099/files/2023/12/18/202312182307016.png)

![image-20231218230856374](https://s.ires.cc:9099/files/2023/12/18/202312182308568.png)

![image-20231218230920177](https://s.ires.cc:9099/files/2023/12/18/202312182309130.png)

### `@Component`及其`派生类`

![image-20231218225934654](https://s.ires.cc:9099/files/2023/12/18/202312182259018.png)

![image-20231218230036639](https://s.ires.cc:9099/files/2023/12/18/202312182300764.png)

![image-20231218230147969](https://s.ires.cc:9099/files/2023/12/18/202312182301093.png)

## Spring Bean 配置元信息底层实现

![image-20231218231229104](https://s.ires.cc:9099/files/2023/12/18/202312182312667.png)

### Spring XML 资源 BeanDefinition 解析和注册

- 核心API XmlBeanDefinitonReader
- 资源
  - Resource
- 底层
  -  BeanDefinitionDocumentReader
  - XML解析
    - Java DOM Lever 3 API
  - BeanDefinition 解析
    - BeanDefinitionParserDelegate
  - BeanDefnition注册
    - BeanDefinitionRegistry

### Spring Properties 资源 BeanDefinition 解析和注册

- 核心API: ProPertiesBeanDefinitionReader

- 资源

  - Resource
  - EncodedResource

- 底层

  - 存储: java.util.Properties

  - PropertiesBeanDefinitionReader API 内部实现
  - BeanDefinition 注册: BeanDefinitionRegistry

### 基于 Java 注册 BeanDefinition 解析和注册

- 核心API:  AnnotatedBeanDefinitionReader
- 资源
  - java.lang.Class
- 底层
  - 条件评估
    - ConditionEvaluator
    - Bean 范围解析
      - ScoepMetadataReslover
    - BeanDefinition 解析
      - 内部API实现
    - BeanDefnition 处理
      - AnnotationConfigUtils.processorCommonDefinitionAnnotations
    - BeanDefinition 注册
      - BeanDefinitionRegistry

#### 源码解析

##### AnnotatedBeanDefinitionReader

![image-20231229111331571](https://s.ires.cc:9099/files/2023/12/29/image-20231229111331571.png)

![image-20231229111750297](https://s.ires.cc:9099/files/2023/12/29/image-20231229111750297.png)

![image-20231229111815845](https://s.ires.cc:9099/files/2023/12/29/image-20231229111815845.png)

![image-20231229111918938](https://s.ires.cc:9099/files/2023/12/29/image-20231229111918938.png)

![image-20231229112115642](https://s.ires.cc:9099/files/2023/12/29/image-20231229112115642.png)

![image-20231218233612115](https://s.ires.cc:9099/files/2023/12/18/202312182336320.png)

## Spring IOC 容器相关 XML 配置

![image-20231229112957685](https://s.ires.cc:9099/files/2023/12/29/image-20231229112957685.png)

![image-20231229113234210](https://s.ires.cc:9099/files/2023/12/29/image-20231229113234210.png)

## Spring IOC 容器装配注解

![image-20231229113842185](https://s.ires.cc:9099/files/2023/12/29/image-20231229113842185.png)

![image-20231229114002689](https://s.ires.cc:9099/files/2023/12/29/image-20231229114002689.png)

![image-20231229114054253](https://s.ires.cc:9099/files/2023/12/29/image-20231229114054253.png)

![image-20231229113903301](/Users/mercymodest/Library/Application Support/typora-user-images/image-20231229113903301.png)

![image-20231229114627167](https://s.ires.cc:9099/files/2023/12/29/image-20231229114627167.png)

## 基于 Extensible XML 拓展 Spring XML 自定义元素

### 编写 XML Schema 文件

```scheme
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<xsd:schema xmlns="http://study.org/schema/users"
            xmlns:xsd="http://www.w3.org/2001/XMLSchema"
            targetNamespace="http://study.org/schema/users">

    <xsd:import namespace="http://www.w3.org/XML/1998/namespace"/>

    <!-- 定义 User 类型（复杂类型） -->
    <xsd:complexType name="User">
        <xsd:attribute name="id" type="xsd:long" use="required"/>
        <xsd:attribute name="name" type="xsd:string" use="required"/>
        <xsd:attribute name="city" type="City"/>
    </xsd:complexType>

    <!-- 定义 City 类型（简单类型，枚举） -->
    <xsd:simpleType name="City">
        <xsd:restriction base="xsd:string">
            <xsd:enumeration value="BEIJING"/>
            <xsd:enumeration value="HANGZHOU"/>
            <xsd:enumeration value="SHANGHAI"/>
        </xsd:restriction>
    </xsd:simpleType>

    <!-- 定义 user 元素 -->
    <xsd:element name="user" type="User"/>
</xsd:schema>
```

### 自定义 NamespaceHandler

```java
public class UsersNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        // 将 "user" 元素注册对应的 BeanDefinitionParser 实现
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
```

### 自定义 BeanDefinitonPaser 实现 实现  自定义 XML 元素 和 BeanDefiniton 解析

```java
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
        setPropertyValue("id", element, builder);
        setPropertyValue("name", element, builder);
        setPropertyValue("city", element, builder);
    }

    private void setPropertyValue(String attributeName, Element element, BeanDefinitionBuilder builder) {
        String attributeValue = element.getAttribute(attributeName);
        if (StringUtils.hasText(attributeValue)) {
            builder.addPropertyValue(attributeName, attributeValue); // -> <property name="" value=""/>

        }
    }
}
```

### 注册 XML 拓展 Schema 文件 和 NamespaceHandler 进行绑定

![image-20231229115925674](https://s.ires.cc:9099/files/2023/12/29/image-20231229115925674.png)

## Entensible XML 源码小析

> ```java
> org.springframework.beans.factory.xml.XmlBeanDefinitionReader#loadBeanDefinitions(org.springframework.core.io.support.EncodedResource)
> ```
>
> ```java
> org.springframework.beans.factory.xml.XmlBeanDefinitionReader#doLoadBeanDefinitions
> ```
>
> ```java
> org.springframework.beans.factory.xml.XmlBeanDefinitionReader#registerBeanDefinitions
> ```
>
> ```java
> org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader#registerBeanDefinitions
> ```
>
> ```java
> org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader#doRegisterBeanDefinitions
> ```
>
> ![image-20231229120507925](https://s.ires.cc:9099/files/2023/12/29/image-20231229120507925.png)
>
> ![image-20231229120645409](https://s.ires.cc:9099/files/2023/12/29/image-20231229120645409.png)

## 基于 YAML 资源装载外部化配置

> ```java
> org.springframework.beans.factory.config.YamlProcessor
> ```
>
> ```java
> org.springframework.beans.factory.config.YamlMapFactoryBean
> ```
>
> ```java
> org.springframework.beans.factory.config.YamlPropertiesFactoryBean
> ```

### 我们是否可以通过`@PropertySource`实现`YAML`资源的外部化配置呢？

#### `PropertySource`

![image-20231229155032539](https://s.ires.cc:9099/files/2023/12/29/image-20231229155032539.png)

#### 如何实现`PropertySourceFactory`

###### 来看下 `DefaultPropertySourceFactory`

```java
package org.springframework.core.io.support;

import java.io.IOException;

import org.springframework.core.env.PropertySource;
import org.springframework.lang.Nullable;

/**
 * The default implementation for {@link PropertySourceFactory},
 * wrapping every resource in a {@link ResourcePropertySource}.
 *
 * @author Juergen Hoeller
 * @since 4.3
 * @see PropertySourceFactory
 * @see ResourcePropertySource
 */
public class DefaultPropertySourceFactory implements PropertySourceFactory {

	@Override
	public PropertySource<?> createPropertySource(@Nullable String name, EncodedResource resource) throws IOException {
		return (name != null ? new ResourcePropertySource(name, resource) : new ResourcePropertySource(resource));
	}

}
```

###### 我们可以基于 `YamlPropertiesFactoryBean`

![image-20231229155950176](https://s.ires.cc:9099/files/2023/12/29/image-20231229155950176.png)

```java
# org.springframework.core.io.support.DefaultPropertySourceFactory#createPropertySource
YamlPropertiesFactoryBean yamlPropertiesFactroy= new YamlPropertiesFactoryBean();
yamlPropertiesFactoryBean.setResources(resource.getResource());
ResourcePropetySource  resourcePropertySource = new ResourcePropertySource(name,yamlPropertiesFactoryBean.getObject());
```

## 面试题: Spring 内建的 XML Schema 有哪些

![image-20231229172151819](https://s.ires.cc:9099/files/2023/12/29/image-20231229172151819.png)

## 面试题： Spring 配置元信息有哪些

- Bean 的配置元信息 

  通过媒介（如 XML，Proper ties），解析 BeanDefinition

- IOC 容器配置元信息

  通过媒介（如 XML，Properties）控制IOC容器的行为，如 注解驱动，AOP

- 外部化配置

   通过资源抽象(如 YAML Properties) 控制 PropertySource

- Spring Profie

  通过外部化配置，提供条件分支流程

## 面试题： Extensible XML Authoring  有哪些劣势

- 高复杂度

  开发人员需要熟悉 XML Schema，spirng.schemas spring.handlers 以及 Spring API

- 对嵌套支持的比较薄弱

  通常需要使用递归或者使用其嵌套解析的方式实现(子)元素的嵌套

- XML 解析性能较弱

  Spring XML 基于 DOM Level 3 实现，其结构性好，但是其性能比较差

- XML框架移植性差

  Spring XML 很难适配高性能和高移植性的XML框架 如何 JAXB

## Spring 引入自己的資源管理的动机

- Java 标准资源管理强大，然后拓展起来很复杂，资源存储方式不统一
- Spring 要自立门户
- Spring “3c” "抄" “超” “潮”

## Java标准的资源管理

### Java 标准的资源定位

![image-20240104231323047](https://s.ires.cc:9099/files/2024/01/04/202401042313468.png)

### Java URL 协议拓展

- #### java.net.URLStreamHanderFactory

  ![image-20240104232052852](https://s.ires.cc:9099/files/2024/01/04/202401042321902.png)

  ![image-20240104232534432](https://s.ires.cc:9099/files/2024/01/04/202401042325410.png)

- #### Java.net.URLStreamHander

  - #####  方式一:

    ```java
    sum.net.www.protocol.${protocol}.Hander.java    
    ```

    ![image-20240104233613107](https://s.ires.cc:9099/files/2024/01/04/202401042336074.png)

  - ##### 方式二:
  
    ```java
    添加 JVM 启动参数
    -Djava.protocol.handler.pkgs=com.stuy.MyProtocol.Hander
    ```

    ![image-20240104232611878](https://s.ires.cc:9099/files/2024/01/04/202401042326638.png)

    ![image-20240104232730925](https://s.ires.cc:9099/files/2024/01/04/202401042329566.png)

    ![image-20240104232946311](https://s.ires.cc:9099/files/2024/01/04/202401042329457.png)

    ##### Java 1.8 内建的一些 协议的实现
  
    ![image-20240104233530775](https://s.ires.cc:9099/files/2024/01/04/202401042335486.png)

## Spring 资源接口

### 输入流

> org.springframework.core.io.InputStreamSource

![image-20240104234340403](https://s.ires.cc:9099/files/2024/01/04/202401042343506.png)

### 只读资源

> org.springframework.core.io.Resource

![image-20240104234458606](https://s.ires.cc:9099/files/2024/01/04/202401042344828.png)

### 可写资源

> org.springframework.core.io.WritableResource

![image-20240104234607041](https://s.ires.cc:9099/files/2024/01/04/202401042346294.png)

### 编码资源

> org.springframework.core.io.support.EncodedResource

![image-20240104234656003](https://s.ires.cc:9099/files/2024/01/04/202401042346757.png)

### 上下文资源

> org.springframework.core.io.ContextResource

![image-20240104234725885](https://s.ires.cc:9099/files/2024/01/04/202401042347988.png)

## Spring 内建 Resource 实现

![image-20240104234847777](https://s.ires.cc:9099/files/2024/01/04/202401042348760.png)

## Spring Resouce 接口拓展

### 可写资源接口

![image-20240104235041362](https://s.ires.cc:9099/files/2024/01/04/202401042350679.png)



### 编码资源接口

![image-20240104235113814](https://s.ires.cc:9099/files/2024/01/04/202401042351868.png)

## Spring 资源加载

> ![image-20240104235244033](https://s.ires.cc:9099/files/2024/01/04/202401042352037.png)

![image-20240104235306501](https://s.ires.cc:9099/files/2024/01/04/202401042353512.png)

![image-20240104235825176](https://s.ires.cc:9099/files/2024/01/04/202401042358483.png)

![image-20240104235843058](https://s.ires.cc:9099/files/2024/01/04/202401042358118.png)

## Spring 通配符路径的资源加载器

![image-20240105000527680](https://s.ires.cc:9099/files/2024/01/05/202401050005769.png)

![image-20240105000629732](https://s.ires.cc:9099/files/2024/01/05/202401050006764.png)

![image-20240105000649491](https://s.ires.cc:9099/files/2024/01/05/202401050006550.png)

![image-20240105000948759](https://s.ires.cc:9099/files/2024/01/05/202401050009084.png)

![image-20240105001128356](https://s.ires.cc:9099/files/2024/01/05/202401050011298.png)

## Spring 通配符路径的拓展

![image-20240105001206784](https://s.ires.cc:9099/files/2024/01/05/202401050012921.png)

![image-20240105001318482](https://s.ires.cc:9099/files/2024/01/05/202401050013501.png)

## 依赖注入 Spring Resource

### 单一资源

```java
@Vaule("classpath:/META-INF/default.properties")
private Resource  resource;
```

### 多个资源

```java
@Value("classpath*:/META-INF/*.properties")
```

## 依赖注入 ResourceLoader

### 实现 ResourceLoaderAware 接口

![image-20240105001752874](https://s.ires.cc:9099/files/2024/01/05/202401050017985.png)

### 使用 @Autowired 注解注入 ResourceLoader

### 注入 ApplicationContext

> 三种方式注入到 ResourceLoader 都是同一个对象

## 面试题: Spring 资源配置常见类型

- XML
- Properties
- YAML

## 面试题：请列举不同类型的 Spring 配置资源

### XML

- 普通的 Spring Bean Definition 配置 *.XML
- Spring Schema 资源 *.xsd

### properties

- 普通的 Properties 资源
- Spring Handler 实体类映射文件 META-INF/spring.handlers
- Spring Schema 资源映射文件 MATE-INF/spring.schemas

### YAML

- 普通YAML资源

## 面试题: Java 标准资源的管理拓展的步骤

### 简易实现

> 在 sum.net.www.protocol. 包下
>
> ${protocol}.Handler.Java

### 自定义实现

> 实现 URLStreamHandler
>
> 添加 JVM 启动参数: -Djava.protocol.handler.pkgs 指向 URLStreamHandler 所在的包

### 高级实现

> 实现 URLStreamHandlerFactory 并传递到 URL 之中

## Spring 国际化管理

### 国际化的使用场景

- 普通国际化文案
- Bean Validation 校验国际化文案
- Web 站点渲染
- Web MVC  错误提示文案

### Sping 提供的国际化接口

> ```java
> org.springframework.context.MessageSource
> ```
>
> ![image-20240109221451832](https://s.ires.cc:9099/files/2024/01/09/202401092214889.png)
>
> 主要概念
>
> - code
>
>   文案模板编码
>
> - args
>
>   文案模板参数
>
> - Locale
>
>   - 区域信息
>
> > ```java
> > org.springframework.context.MessageSource#getMessage(java.lang.String, java.lang.Object[], java.util.Locale)
> > ```
> >
> > ![image-20240109221716086](https://s.ires.cc:9099/files/2024/01/09/202401092217319.png)

#### 层次性 `MessageSource`

##### Sping 层次性接口回顾

- org.springframework.beans.factory.HierarchicalBeanFactory
- org.springframework.context.ApplicaitonContext
- org.springframework.beans.factory.config.BeanDefinition

##### Spring 层次性国际化接口

> org.springframework.context.HierarchicalMessageSource

![image-20240109222126150](https://s.ires.cc:9099/files/2024/01/09/202401092221843.png)

### Java 国家化标准实现

#### 核心接口

- java.util.ResourceBundle

  抽象实现

- java.util.PropertyResourceBundle

  Properties 资源实现

- java.uti.ListResourceBundle

  列举实现

#### ResourceBundle 核心特性

- Key — Value 设计

- 层次性设计

  > ```java
  > java.util.ResourceBundle#setParent
  > ```
  >
  > ![image-20240109223355582](https://s.ires.cc:9099/files/2024/01/09/202401092233562.png)
  >
  > ![image-20240109223633966](https://s.ires.cc:9099/files/2024/01/09/202401092236664.png)

- 缓存设计

  ![image-20240109223557371](https://s.ires.cc:9099/files/2024/01/09/202401092235298.png)

- 字节码控制 

  > ```java
  > java.util.ResourceBundle.Control
  > ```
  >
  > @since 1.6

- Control SPI 拓展

  > ```java
  > java.util.spi.ResourceBundleControlProvider
  > ```
  >
  > @sine 1.8 

##### 基于 `ChatGPT`的 `java.util.ResourceBundle` 使用示例

![image-20240109224600472](https://s.ires.cc:9099/files/2024/01/09/202401092246986.png)

![image-20240109224627091](https://s.ires.cc:9099/files/2024/01/09/202401092246263.png)

```java
import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationExample {
    public static void main(String[] args) {
        // 设置区域为英语
        Locale localeEn = new Locale("en", "US");
        ResourceBundle messagesEn = ResourceBundle.getBundle("Messages", localeEn);
        System.out.println("English: " + messagesEn.getString("greeting") + ", " + messagesEn.getString("farewell"));

        // 设置区域为法语
        Locale localeFr = new Locale("fr", "FR");
        ResourceBundle messagesFr = ResourceBundle.getBundle("Messages", localeFr);
        System.out.println("French: " + messagesFr.getString("greeting") + ", " + messagesFr.getString("farewell"));
    }
}
```

![image-20240109224722499](https://s.ires.cc:9099/files/2024/01/09/202401092247502.png)

##### 基于`ChatGPT`使用 自定义 `java.util.ResourceBundle.Control` 实现 `UTF-8`编码

![image-20240109225442172](https://s.ires.cc:9099/files/2024/01/09/202401092254076.png)

![image-20240109225507900](https://s.ires.cc:9099/files/2024/01/09/202401092255994.png)

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class UTF8Control extends ResourceBundle.Control {
    public ResourceBundle newBundle(String baseName, Locale locale, String format, ClassLoader loader, boolean reload)
            throws IllegalAccessException, InstantiationException, IOException {
        
        String bundleName = toBundleName(baseName, locale);
        String resourceName = toResourceName(bundleName, "properties");
        ResourceBundle bundle = null;
        InputStream stream = null;

        if (reload) {
            stream = loader.getResourceAsStream(resourceName);
        } else {
            stream = loader.getResourceAsStream(resourceName);
        }

        if (stream != null) {
            try (InputStreamReader isr = new InputStreamReader(stream, StandardCharsets.UTF_8);
                 BufferedReader reader = new BufferedReader(isr)) {
                bundle = new PropertyResourceBundle(reader);
            }
        }

        return bundle;
    }
}
```

![image-20240109225746515](https://s.ires.cc:9099/files/2024/01/09/202401092257585.png)

![image-20240109230006497](https://s.ires.cc:9099/files/2024/01/09/202401092300509.png)

```java
import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationExample {
    public static void main(String[] args) {
        // 设置区域为中文（中国）
        Locale localeZh = new Locale("zh", "CN");
        ResourceBundle messagesZh = ResourceBundle.getBundle("Messages", localeZh, new UTF8Control());
        System.out.println("Chinese: " + messagesZh.getString("greeting") + ", " + messagesZh.getString("farewell"));
    }
}
```

![image-20240109230122815](https://s.ires.cc:9099/files/2024/01/09/202401092301810.png)

### Java 文本格式化

#### 核心接口

> ```java
> java.text.MessageFormat
> ```

#### 基本用法

- 设置消息格式模式

  - ![image-20240109232829176](https://s.ires.cc:9099/files/2024/01/09/202401092328116.png)

- 格式化

  ![](https://s.ires.cc:9099/files/2024/01/09/202401092326412.png)

- 消息格式模式

  - 格式元素

    {argumentIndex,(,formatType,(formatStyle))}

    - formatType

      消息类型格式,(可选项)

      - number
      - date
      - time
      - choice

    - formatStyle

      - short
      - medium
      - long
      - full
      - integer
      - currency
      - percent

    - ![image-20240109233236451](https://s.ires.cc:9099/files/2024/01/09/202401092332670.png)

> ![image-20240109231225503](https://s.ires.cc:9099/files/2024/01/09/202401092312271.png)
>
> ![image-20240109231350062](https://s.ires.cc:9099/files/2024/01/09/202401092313202.png)
>
> ![image-20240109231413764](https://s.ires.cc:9099/files/2024/01/09/202401092314879.png)
>
> ```java
> import java.text.MessageFormat;
> import java.util.Date;
> import java.util.Locale;
> import java.util.ResourceBundle;
> 
> public class MessageFormatExample {
>     public static void main(String[] args) {
>         // 创建 Locale 和 ResourceBundle
>         Locale localeEn = new Locale("en", "US");
>         ResourceBundle bundleEn = ResourceBundle.getBundle("Messages", localeEn);
> 
>         Locale localeZh = new Locale("zh", "CN");
>         ResourceBundle bundleZh = ResourceBundle.getBundle("Messages", localeZh);
> 
>         // 设置参数
>         Object[] messageArguments = {"John", new Date(), 10};
> 
>         // 格式化消息
>         String formattedEn = MessageFormat.format(bundleEn.getString("message"), messageArguments);
>         System.out.println("English: " + formattedEn);
> 
>         String formattedZh = MessageFormat.format(bundleZh.getString("message"), messageArguments);
>         System.out.println("Chinese: " + formattedZh);
>     }
> }
> ```
>
> ![image-20240109232653281](https://s.ires.cc:9099/files/2024/01/09/202401092326412.png)
>
> ![image-20240109233854070](https://s.ires.cc:9099/files/2024/01/09/202401092338047.png)
>
> ![image-20240109231444843](https://s.ires.cc:9099/files/2024/01/09/202401092314903.png)

### MessageSource 开箱即用的实现

#### 开箱即用的内置实现

- `ResouceBundle` + `MessageFormat` 组合实现 `MessageSouce`
  - org.springframework.context.support.ResourceBundleMesssageSource
- `Properyties` + `MessageFormat` 组合实现 `MessageSource`
  - org.springframework.context.support.ReloadableResourceBundleMessageSource

![image-20240109234637471](https://s.ires.cc:9099/files/2024/01/09/202401092346400.png)

![image-20240109234712489](https://s.ires.cc:9099/files/2024/01/09/202401092347687.png)

![image-20240109234748440](https://s.ires.cc:9099/files/2024/01/09/202401092347532.png)

![image-20240109234828411](https://s.ires.cc:9099/files/2024/01/09/202401092348474.png)

### `MessageSource`内建依赖

> ```java
> org.springframework.context.support.AbstractApplicationContext#initMessageSource
> ```
>
> ![image-20240109235120664](https://s.ires.cc:9099/files/2024/01/09/202401092351617.png)

#### `SpringBoot`为什么需要新建`MessageSource` Bean

- org.springframework.context.support.AbstractApplicationContext 实现决定了 内建 `MessageSource`内建实现

  ![](https://s.ires.cc:9099/files/2024/01/09/202401092351617.png)

- Spring Boot 通过 外部化配置来简化  MessageSource Bean 构建

  ![image-20240110002040572](https://s.ires.cc:9099/files/2024/01/10/202401100020666.png)

- Spring Boot 基于  Bean Validation 校验非常普遍

  Spring Boot 资源记载配置资源的时候是会区分主次的

  ![image-20240110002332976](https://s.ires.cc:9099/files/2024/01/10/202401100023720.png)

  ![image-20240110002745313](https://s.ires.cc:9099/files/2024/01/10/202401100027442.png)
 ### 我们如何覆盖`Spring Boot`的默认实现

  ![image-20240110002911363](https://s.ires.cc:9099/files/2024/01/10/202401100029293.png)

### 面试题:  Spring 国际化接口有哪些

  - > org.springframework.context.MessageSource
  
  - > org.springframework.context.HierarchicalMessageSource

### 面试题: Spring 有哪些内建的`org.springframework.context.MessageSource`的实现

  - > org.springframework.context.suppor.ResouceBundleMessageRersouce
  
  - > org.springframework.context.support.ReloadableResouceBundleMessageResouce
  
  - > org.springframework.context.support.StaticMessageSource
    >
    > ![image-20240115220725764](https://s.ires.cc:9099/files/2024/01/15/202401152207980.png)
  
  - > org.springframework.context.support.DelegatingMessageSource
  
    - 这是 `Spring`默认初始化的时候，如果`IOC`容器中没有则会注册一个`org.springframework.context.support.DelegatingMessageSource`

### 面试题：如何实现配置自动更新的`org.springframework.context.MessageSource`

#### 实现要素步骤:

- 基于`java.io.File`，本地文件实现
- 基于 `Java` `NIO2`：java.nio.file.WatchService 监听文件的修改
- 基于 `JUC``java.util.current.ExecutorService`实现文件修改时间的异步处理
- 基于`org.springframework.context.support.AbstractMessageSource`实现自定义的`MessageSource`

#### 代码实现示例

##### 注册文件监听

```java
	private void initResourceFileWatchService() {
		try {
			FileSystem fileSystem = FileSystems.getDefault();
			WatchService watchService = fileSystem.newWatchService();
			File resouceFile = resource.getFile();
			if (resouceFile.isFile()) {
				String parent = resouceFile.getParent();
				Paths.get(parent).register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
				this.watchService=watchService;
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
```

##### 文件修改时间处理

```java
protected void processingMessageFileChanged() {
		executorService.submit(()->{
			while (true){
				WatchKey watchKey=watchService.take();
				try {
					if (watchKey.isValid()) {
						for (WatchEvent<?> pollEvent : watchKey.pollEvents()) {
							Watchable watchable = watchKey.watchable();
							if (watchable instanceof Path) {
								Path parentPath = (Path) watchable;
								Object context = pollEvent.context();
								if (context instanceof Path) {
									// 相对路径
									Path changeFileRelativePath = (Path) context;
									// 通过 父Path 解析成变更文件的路径
									Path changePath = parentPath.resolve(changeFileRelativePath);
									File file = changePath.toFile();
									if (!file.isFile()) {
										continue;
									}
									Properties properties = loadMessagesProperties(new FileReader(file));
									synchronized (messagesProperties) {
										messagesProperties.clear();
										messagesProperties.putAll(properties);
									}
								}
							}
						}
					}
				}
				finally {
					if (Objects.nonNull(watchKey)) {
						boolean reset = watchKey.reset();
						if (!reset) {
							System.err.println("watchKey reset failed");
							initResourceFileWatchService();
						}
					}
				}
			}
		});
	}
```

## Spring中的常用注解源码解析

#### `@Bean`

1. @Bean 的官方说明: [Java-doc-Bean](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Bean.html)

2. 梗概

   > - ChatGPT 对于 @Bean 搭配 @Order和@Primary 的解释
   >
   >   ![image-20231009235834780](https://s2.loli.net/2023/10/09/SpYL4GBgdEtHF56.png)
   >
   > - @Bean 可以搭配 注解了 @Configuration 的注解一起使用
   >
   >   ![image-20231010000143370](https://s2.loli.net/2023/10/10/aO98cZGRbmlPES7.png)
   >
   >   - @Bean 的 Lite 模式
   >
   >     ![image-20231010000900844](https://s2.loli.net/2023/10/10/iVxhTDKuW4Gnlvb.png)
   >
   >     - @Bean 返回 `@BeanFactoryPostProcessor`
   >
   >       ![image-20231010001701384](https://s2.loli.net/2023/10/10/fcAo712ni95PmWI.png)
   >
   >       ![image-20231010001722791](https://s2.loli.net/2023/10/10/LcVW9pDqAhfoxr6.png)

##### @Bean源码调试

> @Bean  解析之后会被封装成  `org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.ConfigurationClassBeanDefinition`
>
> > 其调用堆栈信息如下:
> >
> > ![image-20231010003143968](https://s2.loli.net/2023/10/10/MCbJTc1WXh9GLaY.png)
> >
> > - 将@Bean信息解析并封装的是`ConfigurationClassPostProcessor`
> >
> >   ![image-20231010003431045](https://s2.loli.net/2023/10/10/1YP5pQb4BSdMcoK.png)
> >
> >   -  ConfigurarionPostProcessor 何时被放入到 IOC容器?
> >
> >     - 何时进入 IOC 容器的   `beanDefinitionMap`
> >
> >       ![image-20231010004712039](https://s2.loli.net/2023/10/10/hRwzketAIMm4Epy.png)
> >
> >       - 堆栈信息
> >
> >         ![image-20231010004915830](https://s2.loli.net/2023/10/10/9l75ihvfeSrRm2x.png)

#### `@Import`

@Import 的官方说明: [Java-doc-Import](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Import.html)

> - 官方说通常 使用@Import 导入的类是被 @Configuration 标注的类
>
>   ![image-20231010154847670](https://s2.loli.net/2023/10/10/cTGsMUuQegv1IbX.png)
>
> - 还可以导入 ImportSelector,ImportBeanDefinitionRegister 的实现类
>
>   - Spring 4.2 之后也可以导入 普通组件，类似于 AnnotaionConfigApplicationContent#register
>
>   ![image-20231010155339057](https://s2.loli.net/2023/10/10/DuWKx2VRtABNekJ.png)

关于 @Import 注解 ChatGPT 的解释

> ![image-20231010152053982](https://s2.loli.net/2023/10/10/XpPMmHCB4v3Ydnh.png)

##### @Import 源码调试

> 1. @Import 注册的组件什么时候被什么翻译注册成 BeanDefinition的呢？
>
>    通过ConfiurationClassPostProcessor 进行 BeanDefinition 注册
>
>    ![image-20231010160154243](https://s2.loli.net/2023/10/10/5ScmKBJeIO6uZYf.png)
>
>    ![image-20231010160845392](https://s2.loli.net/2023/10/10/JQHEtzsrFMNOK5X.png)

## Spring Bean的生命周期

### 生命周期图示

> 此图出自于雷锋阳老师

![此图出自于雷丰阳老师](https://s2.loli.net/2023/10/10/yfFA7Rc8wk3ndEW.png)

### Spring Bean 后置处理器

> - 后置处理器器
>
>   - BeanFactoryPostProcessor
>
>     ![image-20231010114832710](https://s2.loli.net/2023/10/10/fE6DVcwqzF9e2Im.png)
>
>   - BeanPostprocessor
>
>     ![image-20231010011113589](https://s2.loli.net/2023/10/10/JiQPKHvczNUZtme.png)
>
> - 生命周期接口
>
>   - InitializingBean
>   - DisposeableBean

### BeanFactoryPostProcessor

#### BeanDefinitionRegisterPostProcessor

>  自定义组件扫描的BeanDefinitionRegisterPostProcessor 是何时被注册成 BeanDefinition 的呢
>
> ![](https://s2.loli.net/2023/10/10/FaOQpoSdWs6DhYU.png)
>
>  BeanDefinitionRegisterPostProcessor的执行
>
> ![image-20231010162231627](https://s2.loli.net/2023/10/10/snyVOxZgoz8ClU4.png)
>
> > 如上图的Spring 源码显示，BeanDefinitionRegisterPostProcessor 执行顺序优于 BeanFactoryPostProcessor 
> >
> > Spring 容器启动的时候，BeanDefinitionRegisterPostProcessor 方法执行顺序
> >
> > ![image-20231010162549716](https://s2.loli.net/2023/10/10/sIwUWQ2rF1Mzhjf.png)
> >
> > ![image-20231010162637560](https://s2.loli.net/2023/10/10/8CqwcNI15RJgkEo.png)

#### BeanFactoryPostprocessor

##### 如果我们使用 `XML`配置文件作为 Spring 的 Configuration Metadata

> 程序调用栈信息
>
> ![image-20231010115526051](https://s2.loli.net/2023/10/10/D9jT7bz24HluKUP.png)

##### 如果我们使用 `Configuration Class` 作为 Spring 的 Configuration Metadata

> 程序调用栈信息
>
> ![image-20231010115854730](https://s2.loli.net/2023/10/10/XE7gHvsoAtQBC5R.png)

##### 文字梗概

1. BeanFactoryPostProcessor 的 BeanDefinition 何时生成呢？

   > 1. ![image-20231010122321613](https://s2.loli.net/2023/10/10/ugQXcCBkV1SH5mp.png)
   >
   > 2. C lassPathBeanDefinitionScanner 执行 scan 进行扫描组件的BeanDefinition的注册
   >
   >    ![image-20231010150330926](https://s2.loli.net/2023/10/10/3zUolRFJ5Qu1GOr.png)
   >
   > 3. ![image-20231010122106521](https://s2.loli.net/2023/10/10/f31PN6tv2MrkjIp.png)
   >
   > 4. BeanFactoryPostProcessor 执行时机
   >
   >    ![image-20231010150734862](https://s2.loli.net/2023/10/10/JUpMfAqsVyxP3vt.png)

#### 特别小提示

> 无论是 BeanDefinitionRegisterPostProcessor 还是 BeanFactoryPostProcessor，我们都可以分别使用
>
> - PriorityOrdered：org.springframework.core.PriorityOrdered
> - Ordered： org.springframework.core.Ordered
>
>  来指定其同类间的执行顺序
>
> ![image-20231010162940348](https://s2.loli.net/2023/10/10/7ecraAoWHzvR3f4.png)
>
> ![image-20231010163014743](https://s2.loli.net/2023/10/10/kxqD5XzEdPFtwyS.png)
>
> ![image-20231010163238954](https://s2.loli.net/2023/10/10/ELHgUViewSns8QY.png)

### BeanPostProcessor

#### BeanPostProcessor 后置处理何时被什么注册到 beanDefinitionMap

![image-20231010165007527](https://s2.loli.net/2023/10/10/gbmM4Ri2EFLkGv1.png)

![image-20231010165206803](https://s2.loli.net/2023/10/10/iKzBhQjGRm1NFJr.png)

#### BeanPostProcessor 如何被创建

![image-20231010165821235](https://s2.loli.net/2023/10/10/Hr91g2AmwhLEPGb.png)

![image-20231010170027793](https://s2.loli.net/2023/10/10/8j3IbHQ4zCuUWRK.png)

> 如上图所示，我们可以了解到，在Spring到底层，MergedBeanDefinitionPostProcessor 属于 internalPostProcessor

## applicationContext#getBean

![image-20231010180115353](https://s2.loli.net/2023/10/10/vAxMjzmoU2y58Vt.png)