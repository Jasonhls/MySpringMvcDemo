package com.cn.dynamic;

import com.cn.dynamic.cglib.CglibConfig;
import com.cn.dynamic.cglib.UserServiceImpl;
import com.cn.dynamic.jdk.JdkConfig;
import com.cn.dynamic.jdk.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-29 17:31
 **/
public class DynamicTest {
    @Test
    public void testJdkDynamic() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdkConfig.class);
        UserService bean = context.getBean(UserService.class);
        bean.sayHello("hls");
    }

    @Test
    public void testCglibDynamic() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CglibConfig.class);
        UserServiceImpl bean = context.getBean(UserServiceImpl.class);
        bean.sayHello("hls");
    }
}
