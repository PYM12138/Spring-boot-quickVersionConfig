package com.atguigu;

import com.atguigu.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/*
* SpringBoot的单元测试
* */

@SpringBootTest
class SpringBootQuickVersionApplicationTests {

    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;

    @Test
    void contextLoads() {
       boolean helloService = ioc.containsBean("helloService01");
        System.out.println(helloService);
        //System.out.println(person);
    }

}
