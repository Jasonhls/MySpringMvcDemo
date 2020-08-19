package com.cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: helisen
 * @create: 2020-08-13 16:55
 **/
@RequestMapping(value = "/test")
public class TestController {
    public String testOne() {
        return "efg";
    }
}
