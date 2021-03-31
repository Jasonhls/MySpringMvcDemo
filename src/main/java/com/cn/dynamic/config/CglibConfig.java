package com.cn.dynamic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * proxyTargetClass设置为true，表示使用cglib动态代理
 * @author: helisen
 * @create: 2021-03-29 18:13
 **/
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(value = {"com.cn.dynamic.cglib"})
public class CglibConfig {
}
