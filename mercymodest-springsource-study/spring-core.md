# Spring Framework 核心技术学习

## Spring 常用核心注解梗概

- `@Order`

  - since spring 2.0

  ```java
  org.springframework.core.annotation.Order
  ```

- `@Componet`

  - since spring 2.5

  ```java
  org.springframework.stereotype.Component
  ```

- `@Autowired`

  - 手动装配

  - since spring 2.5

  ```java
  org.springframework.beans.factory.annotation.Autowired
  ```

- `@Qualifier`

  - 指定装配
  - since spring 2.5

  ```java
  org.springframework.beans.factory.annotation.Qualifier
  ```

- `@Bean`

  - 结合配置类`@Configuration`以方法的形式向 Spring IOC 中注册组件
  - since spring 3.0

  ```java
  org.springframework.context.annotation.Bean
  ```

- `@Value`

  - SpEL
  - since spring 3.0

  ```java
  org.springframework.beans.factory.annotation.Value
  ```

- `@Primary`

  - 同类型组件如果有多个，可以使用此注解标注主组件
  - since spring 3.0

  ```java
  org.springframework.context.annotation.Primary
  ```

- `@DependsOn`

  - 显示声明组件之间的依赖关系
  - since spring 3.0

  ```java
  org.springframework.context.annotation.DependsOn
  ```

- `@Lazy`

  - 实现 IOC 容器组件的懒加载
  - since spring 3.0

  ```java
  org.springframework.context.annotation.Lazy
  ```

- `@Configuration`

  - 声明一个配置类，用以替代3.0之前使用的 xml 配置文件
  - since spring 3.0

  ```java
  org.springframework.context.annotation.Configuration
  ```

- `@Import`

  - 一般用于导入第三方组件,或者定制批量导入组件
  - since spring 3.0
  
  ```java
  org.springframework.context.annotation.Import
  ```

- `@ImportResource`

  - 导入 xml 配置文件
  - since spring 3.0

  ```java
  org.springframework.context.annotation.ImportResource
  ```

- `@ComponentScan`

  - 扫描并注册指定包下面的IOC 组件
  - since spring 3.1

  ```java
  org.springframework.context.annotation.ComponentScan
  ```

- `@Profile`

  - 基于多环境的的配置激活

  - since spring 3.1

  ```java
  org.springframework.context.annotation.Profile
  ```

- `@PropertySource`

  - 外部 properties 配置文件和 JavaBean 的属性进行绑定

  - since spring 3.1
  
  ```java
  org.springframework.context.annotation.PropertySource
  
- `@PropertySources`

  - since spring 4.0

  ```java
  org.springframework.context.annotation.PropertySources
  ```
  
- `@Conditional`

  - 条件注册
  - since spring 4.0
  
  ```java
  org.springframework.context.annotation.Conditional
  ```

- `@LookUp`

  - 单实例Bean依赖非单实例Bean,需要使用 get 方法获取 非单实例Bean
  - since spring  4.1
  
  ```java
  org.springframework.beans.factory.annotation.Lookup
  ```
  
- `@Indexed`

  - 加速注解，所有标注了该注解的组件，直接会启动开始加载
  - since spring 5.0
  
  ```java
  org.springframework.stereotype.Indexed
  ```
