package com.cn.customElement;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 自定义标签使用样例，源码分析
 * @author: helisen
 * @create: 2020-09-15 18:28
 **/
public class MyCustomElementTest {
    @Test
    public void testMyCustomElement() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/customElement/test.xml");
        User user = (User) context.getBean("testBean");
        System.out.println(user.getUsername() + "; " + user.getEmail());
    }

    @Test
    public void testMyCustomElementImport() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/customElement/importTest.xml");
        User user = (User) context.getBean("testBean");
        System.out.println(user.getUsername() + "; " + user.getEmail());
    }
}
