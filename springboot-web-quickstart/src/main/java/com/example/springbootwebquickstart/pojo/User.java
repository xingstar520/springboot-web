package com.example.springbootwebquickstart.pojo;

/**
 * @author Jie.
 * @description: TODO
 * @date 2023/10/29
 * @version: 1.0
 */
public class User {
    private String name;
    private Integer age;
    private Address address;

    public Integer getAge() {
        return age;
    }

    public String getname() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + ", address=" + address + '}';
    }
}
