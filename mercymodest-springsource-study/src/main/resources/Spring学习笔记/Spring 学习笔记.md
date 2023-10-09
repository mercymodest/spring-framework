# Spring 学习笔记

> 当前学习的Spring的版本为 **5.3.x**

## Spring 架构图



## Spring中的常用注解之@Bean的源码解析

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
> > - 将@Bean信息解析并封装的是`ConfigurationPostProcessor`
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

## Spring Bean的生命周期

### 生命周期图示

> 此图出自于雷锋阳老师

![此图出自于雷丰阳老师](https://s2.loli.net/2023/10/10/yfFA7Rc8wk3ndEW.png)

> - 后置处理器器
>
>   - BeanFactoryPostProcessor
>
>   - BeanPostprocessor
>
>     ![image-20231010011113589](https://s2.loli.net/2023/10/10/JiQPKHvczNUZtme.png)
>
> - 生命周期接口
>
>   - InitializingBean
>   - DisposeableBean