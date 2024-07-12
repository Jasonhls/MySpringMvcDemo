package com.cn.dynamic.jdk;

import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-29 17:40
 **/
@Component
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("say hello to " + name);
    }

    @Override
    public String getClassName(String studentName) {
        if(Objects.equals(studentName, "张三")) {
            return "高三5班";
        }else if(Objects.equals(studentName, "李四")) {
            return "高三6班";
        }
        return "高三7班";
    }
}
