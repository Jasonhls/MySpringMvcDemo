package com.cn.dynamic.custom;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.Advisor;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.stereotype.Component;

/**
 * @Author: 何立森
 * @Date: 2024/07/12/10:04
 * @Description:
 */
@Component
public class CustomAutoProxyCreator extends AbstractAutoProxyCreator {

    private MethodInterceptor methodInterceptor;


    @Override
    protected Object wrapIfNecessary(Object bean, String beanName, Object cacheKey) {
        //如果不是代理对象，直接跳过
        if(!AopUtils.isAopProxy(bean)) {
            return bean;
        }

        //创建自定义的MethodInterceptor
        methodInterceptor = new CustomMethodInterceptor();

        try {
            //获取代理对象原来的advisedSupport对象，该对象中advisors存放原来所有的advisor
            AdvisedSupport advisedSupport = ProxyUtils.getAdvisedSupport(bean);
            //添加自定义的Advisor
            Advisor[] advisors = buildAdvisors(beanName, getAdvicesAndAdvisorsForBean(null, null, null));
            for (Advisor advisor : advisors) {
                advisedSupport.addAdvisor(advisor);
            }
            return bean;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected Object[] getAdvicesAndAdvisorsForBean(Class<?> aClass, String s, TargetSource targetSource) throws BeansException {
        return new Object[]{methodInterceptor};
    }
}
