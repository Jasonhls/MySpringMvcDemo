package com.cn.dynamic.custom;

import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.support.AopUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

/**
 * @Author: 何立森
 * @Date: 2024/07/12/10:09
 * @Description:
 */
public class ProxyUtils {

    public static AdvisedSupport getAdvisedSupport(Object proxy) throws Exception {
        Object advisedInterceptor;
        //如果是jdk代理
        if(AopUtils.isJdkDynamicProxy(proxy)) {
            advisedInterceptor = Proxy.getInvocationHandler(proxy);
        }else {
            //如果是cglib代理
            Field field = proxy.getClass().getDeclaredField("CGLIB$CALLBACK_0");
            field.setAccessible(true);
            //拿到字段值
            advisedInterceptor = field.get(proxy);
        }
        Field advised = advisedInterceptor.getClass().getDeclaredField("advised");
        advised.setAccessible(true);
        Object advisedValue = advised.get(advisedInterceptor);
        return (AdvisedSupport) advisedValue;
    }
}
