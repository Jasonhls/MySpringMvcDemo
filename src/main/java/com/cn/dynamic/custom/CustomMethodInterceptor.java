package com.cn.dynamic.custom;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Author: 何立森
 * @Date: 2024/07/12/9:57
 * @Description:
 */
public class CustomMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //添加自己的拦截逻辑
        getDescription();
        return methodInvocation.proceed();
    }


    public void getDescription() {
        System.out.println("自定义advisor执行逻辑");
    }
}
