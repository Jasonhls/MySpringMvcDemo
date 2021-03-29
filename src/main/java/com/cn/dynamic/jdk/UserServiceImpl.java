package com.cn.dynamic.jdk;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-29 17:40
 **/
@Component
public class UserServiceImpl implements UserService{
    @Override
    public void sayHello(String name) {
        System.out.println("say hello to " + name);
    }
}
