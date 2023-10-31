package org.example.service.impl;

import org.example.bean.Demo;
import org.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jie.
 * @description: TODO
 * @date 2023/10/24
 * @version: 1.0
 */

@Service(value = "demoService")//服务层
public class DemoServiceImpl implements DemoService {
    @Autowired
    private Demo demo;
    @Override
    public Demo getDemo() {
        return demo;
    }
}
