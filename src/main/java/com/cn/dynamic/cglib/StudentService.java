package com.cn.dynamic.cglib;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-29 18:12
 **/
@Component
public class StudentService {
    public void sayHello(String name) {
        System.out.println("say hello to " + name);
    }

    public String eatDiner(String name) {
        return name + " start to eat dinner";
    }
}
