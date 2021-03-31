package com.cn.dynamic.cglib;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-29 18:12
 **/
@Aspect
@Component
public class CglibAop {
    @Pointcut(value = "execution(* com.cn.dynamic.cglib.StudentService.*(..))")
    public void cut() {}

    @Around(value = "cut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        try {
            System.out.println("方法之前----------");
            Object proceed = joinPoint.proceed(args);
            System.out.println("方法之后----------");
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
