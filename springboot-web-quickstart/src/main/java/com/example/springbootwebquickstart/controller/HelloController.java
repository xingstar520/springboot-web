package com.example.springbootwebquickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jie.
 * @description: TODO
 * @date 2023/10/28
 * @version: 1.0
 */
//请求处理类
@RestController
public class HelloController {
    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("Hello World!");
        return "Hello World!";
    }
}
