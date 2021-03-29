package com.cn.dynamic.cglib;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-29 18:12
 **/
@Component
public class UserServiceImpl {
    public void sayHello(String name) {
        System.out.println("say hello to " + name);
    }
}
