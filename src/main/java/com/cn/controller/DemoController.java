package com.cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: helisen
 * @create: 2020-07-22 13:35
 **/
@RestController
public class DemoController {
    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "abc";
    }

    @RequestMapping(value = "/hello2")
    public String haha2() {
        return "abc";
    }

    public String haha3() {
        return "abc";
    }
}
