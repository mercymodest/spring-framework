# Spring 学习笔记

> 当前学习的Spring的版本为 **5.3.x**

## Spring 架构图



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