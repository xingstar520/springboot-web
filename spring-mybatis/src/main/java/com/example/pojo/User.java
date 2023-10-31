package com.example.pojo;

import lombok.*;

import java.math.BigInteger;

/**
 * @author Jie.
 * @description: TODO
 * @date 2023/10/30
 * @version: 1.0
 */
// 以下是使用lombok插件后的代码
// 在pom.xml中添加lombok依赖
@Data           //getter setter tostring equals hashcode
@NoArgsConstructor//无参构造
@AllArgsConstructor //全参构造
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Integer gender;
    private BigInteger phone;

//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setGender(Integer gender) {
//        this.gender = gender;
//    }
//
//    public Integer getGender() {
//        return gender;
//    }
//
//    public void setPhone(BigInteger phone) {
//        this.phone = phone;
//    }
//
//    public BigInteger getPhone() {
//        return phone;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                ", phone=" + phone +
//                '}';
//    }
}
