package com.cn.configuration;

import org.springframework.context.annotation.Bean;

/**
 * @description:  如果子类是带有@Configuration的类，那么父类中的@Bean也会生效
 * @author: helisen
 * @create: 2020-08-21 09:19
 **/
public class ParentTestConfig {
    @Bean
    public BeanTest beanTest() {
        System.out.println("init beanTest");
        return new BeanTest();
    }
}
