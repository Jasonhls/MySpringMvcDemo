package com.cn.interceptors.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @description:
 * @author: helisen
 * @create: 2020-08-20 14:40
 **/
@Configuration
@EnableWebMvc
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("execute addInterceptors");
        registry.addInterceptor(new MyInterceptorAnnotation()).addPathPatterns("/efg").excludePathPatterns("/abc");
    }
}
