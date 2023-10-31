package com.example.springbootwebquickstart.controller;

import com.example.springbootwebquickstart.pojo.Address;
import com.example.springbootwebquickstart.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jie.
 * @description: TODO
 * @date 2023/10/29
 * @version: 1.0
 */
@RestController
public class ResponseController {
//    @RequestMapping("/hello")
//    public String hello() {
//        System.out.println("Hello World~");
//        return "Hello World~";
//    }
//
//    @RequestMapping("/getAddr")
//    public String getAddr() {
//        Address addr = new Address();
//        addr.setProvince("广东省");
//        addr.setCity("深圳市");
//        return addr.toString();
//    }
//
//    @RequestMapping("/listAddr")
//    public List<Address> listAddr() {
//        List<Address> list = new ArrayList<>();
//
//        Address addr = new Address();
//        addr.setProvince("广东省");
//        addr.setCity("深圳市");
//
//        Address addr2 = new Address();
//        addr2.setProvince("广东省");
//        addr2.setCity("广州市");
//        list.add(addr);
//        list.add(addr2);
//        return list;
//    }
    @RequestMapping("/hello")
    public Result hello() {
    System.out.println("Hello World~");
//    return new Result(1,"success","Hello World~");
    return Result.success("Hello World~");
}

    @RequestMapping("/getAddr")
    public Result getAddr() {
        Address addr = new Address();
        addr.setProvince("广东省");
        addr.setCity("深圳市");
        return Result.success(addr);
    }

    @RequestMapping("/listAddr")
    public Result listAddr() {
        List<Address> list = new ArrayList<>();

        Address addr = new Address();
        addr.setProvince("广东省");
        addr.setCity("深圳市");

        Address addr2 = new Address();
        addr2.setProvince("广东省");
        addr2.setCity("广州市");
        list.add(addr);
        list.add(addr2);
        return Result.success(list);
    }
}
