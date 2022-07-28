package com.atguigu.config;
/*
 * 用配置类的方式替代spring配置文件
 * */


import com.atguigu.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//@Configuration 指明当前类是一个配置类
@Configuration
public class MyConfig {
    //使用@Bean的方式添加组件
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

}
/*
* 总共有四种内部配置方式：f
*   @ConfigurationProperties(prefix = "person") 导入全局配置文件，application.yml 或  application.properties
*   @PropertySource(value = {"classpath:person.properties"}) 导入单独的配置文件 xxxx.properties
*   @ImportResource(locations = {"classpath:beanss.xml"}) spring5的方式导入外部全局配置文件，xxxx.xml
*   推荐：@Configuration+@Bean spring boot 的配置文件方式,定义类的方式
*
* 在外部配置方式:
*   1.可以直接用命令行的方式
*   2.多写几个不同生产环境的配置文件,随时激活
*
*
* */
