package org.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jie.
 * @description: TODO
 * @date 2023/10/24
 * @version: 1.0
 */
@Component(value = "demo")//bean对象实体类
public class Demo {
    @Value("hhh")
    private String name;
    @Value(value = "19")
    private Integer age;
//    public Demo(){
//        this.name = "xxx";
//        this.age = 19;
//    }
//    public Demo(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
    @Override//表现层
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}