package org;

import org.example.bean.Demo;
import org.example.config.SpringConfig;
import org.junit.Test;
import org.example.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jie.
 * @description: TODO
 * @date 2023/10/24
 * @version: 1.0
 */
public class Main {
    @Test
    public void test(){
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        DemoService demo = (DemoService) context.getBean("demoService");
        System.out.println(demo.getDemo());
//        Demo demo = (Demo) context.getBean("demo");
//        System.out.println(demo);
    }
}
