package com.cn.dynamic.jdk;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-29 17:29
 **/
@Aspect
@Component
public class JdkAop {
    @Pointcut(value = "execution(* com.cn.dynamic.jdk.UserServiceImpl.*(..))")
    public void cut() {}

    @Around(value = "cut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        try {
            System.out.println("方法之前----------");
            Object proceed = joinPoint.proceed(args);
            System.out.println("方法返回值===" + proceed);
            System.out.println("方法之后----------");
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
