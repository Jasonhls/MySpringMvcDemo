package com.cn.mybatis.mybatisSpring;

import com.cn.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-02 16:15
 **/
public class UserServiceTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mybatisSpring/spring.xml");
        UserMapper userDao = (UserMapper) context.getBean("userMapper");
        System.out.println(userDao.getUser(27));
    }
}
