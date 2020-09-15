package com.cn.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: helisen
 * @create: 2020-08-31 10:57
 **/
public class SpringJdbcTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean/beanJdbc.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setSex("男");
        userService.save(user);

//        List<User> users = userService.getUsers();
//        System.out.println("++++++++++==" + users.toString());
    }
}
