package com.cn.dynamic.cglib2;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-31 09:27
 **/
public class Cglib2Test {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\code\\cglib2");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloService.class);
        enhancer.setCallback(new MyMethodInterceptor());
        HelloService helloService = (HelloService) enhancer.create();
        helloService.eatDinner("hls");
    }
}
