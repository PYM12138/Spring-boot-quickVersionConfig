package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
//用这种方式导入Spring的配置文件
@ImportResource(locations = {"classpath:beanss.xml"})
@SpringBootApplication
public class SpringBootQuickVersionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQuickVersionApplication.class, args);
    }

}
