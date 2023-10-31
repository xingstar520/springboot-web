package com.example.springbootwebquickstart.controller;

import com.example.springbootwebquickstart.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jie.
 * @description: TODO
 * @date 2023/10/29
 * @version: 1.0
 */
@RestController
public class RequestController {
    //原始方式
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name = "name") String username, Integer age) {
        System.out.println(username + " " + age);
        return "success";
    }

    //pojo方式
    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "success";
    }

    //数组方式
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] name) {
        System.out.println(Arrays.toString(name));
        return "success";
    }

    //集合方式
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> name) {
        System.out.println(name);
        return "success";
    }

    //日期方式
    @RequestMapping("/dateParam")
    public String dataParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "success";
    }

    //json方式
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {
        System.out.println(user);
        return "success";
    }

    //路径方式
    @RequestMapping("/path/{id}/{name}")
    public String pathParam(@PathVariable Integer id ,@PathVariable String name) {
        System.out.println(id + " " + name);
        return "success";
    }
}
