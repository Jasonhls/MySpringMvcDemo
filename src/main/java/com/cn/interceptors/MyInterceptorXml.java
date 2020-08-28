package com.cn.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: helisen
 * @create: 2020-08-20 10:34
 **/
//public class MyInterceptorXml implements HandlerInterceptor {
//
//    @Override
//    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//        System.out.println("开始执行preHandle方法");
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
//        System.out.println("执行postHandle方法");
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
//        System.out.println("完成之后，执行afterCompletion方法");
//    }
//}
