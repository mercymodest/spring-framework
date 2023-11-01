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