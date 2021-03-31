package com.cn.dynamic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * 默认proxyTargetClass为false，即表示默认是jdk动态代理，但是必须要实现接口，如果没有实现接口，实际上还是会用cglib动态代理
 * @author: helisen
 * @create: 2021-03-29 17:27
 **/
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = false)
@ComponentScan(value = {"com.cn.dynamic.jdk"})
public class JdkConfig {

}
