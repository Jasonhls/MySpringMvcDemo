package com.cn.dynamic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: 何立森
 * @Date: 2024/07/12/10:27
 * @Description:
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(value = {"com.cn.dynamic.jdk", "com.cn.dynamic.custom"})
public class CustomDynamicConfig {
}
