package com.cn.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-04 16:38
 **/
@Configuration
@ComponentScan(value = {"com.cn.bean"})
public class BeanConfig {

    @Bean
    public Student studentOne() {
        Student student = new Student();
        student.setName("我是第一个学生");
        student.setAge(20);
        return student;
    }

    @Bean
    public Student studentTwo() {
        Student student = new Student();
        student.setName("我是第二个学生");
        student.setAge(30);
        return student;
    }
}
