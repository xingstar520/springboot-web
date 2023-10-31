package com.example.springbootwebquickstart.pojo;

/**
 * @author Jie.
 * @description: TODO
 * @date 2023/10/29
 * @version: 1.0
 */
public class Address {
    private String province;
    private String city;

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + "province='" + province + '\'' + ", city='" + city + '\'' + '}';
    }
}
