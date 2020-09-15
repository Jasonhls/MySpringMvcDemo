package com.cn.customElement;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-15 18:28
 **/
public class MyCustomElementTest {
    @Test
    public void testMyCustomElement() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/customElement/test.xml");
        User user = (User) context.getBean("testBean");
        System.out.println(user.getUsername());
    }
}
