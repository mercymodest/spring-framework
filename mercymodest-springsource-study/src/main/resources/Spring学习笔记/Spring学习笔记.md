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