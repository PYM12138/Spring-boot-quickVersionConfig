package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component //配置文件（组件）也要载入Spring容器，这样才能提供@ConfigurationProperties功能
//直接把配置文件绑定配置类，默认是全局配置
@ConfigurationProperties(prefix = "person")
//这个写法是单独的配置文件，不作用于全局
//@PropertySource(value = {"classpath:person.properties"})
//这个不能加在这里
//@ImportResource(locations = {"classpath:beanss.xml"})
public class Person {
    //写配置类不用构造器，需要get/set方法
    /*
        这种写法在spring5的学过
    * <bean class="Person">
        <property name="lastName" value="字面量/${环境变量、配置文件中获取值}/#{spEl表达式}"><property/>
    * <bean/>
    *
    * */
    //这个就是相当于spring的bean形式 ，适用于获取写入单个值（只能获取基本变量的值），而且还不支持JSR303校验
    @Value("${person.last-name}")
    private String lastName;
    private Integer age;
    private String gender;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;



    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
