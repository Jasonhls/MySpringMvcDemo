package com.cn.dynamic;

import com.cn.dynamic.cglib.CglibConfig;
import com.cn.dynamic.cglib.UserServiceImpl;
import com.cn.dynamic.jdk.JdkConfig;
import com.cn.dynamic.jdk.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-29 17:31
 **/
public class DynamicTest {
    @Test
    public void testJdkDynamic() {
        //第一步，会把所有的bean初始化并放入spring容器中，而beanName为userServiceImpl的bean实例为JdkDynamicAopProxy对象
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdkConfig.class);
        //获取的bean为JdkDynamicAopProxy对象
        UserService bean = context.getBean(UserService.class);
        //这里的bean为代理对象，执行sayHello方法的时候，会去调用JdkDynamicAopProxy的invoke方法，因为JdkDynamicAopProxy实现了InvocationHandler
        bean.sayHello("hls");
    }

    @Test
    public void testCglibDynamic() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CglibConfig.class);
        UserServiceImpl bean = context.getBean(UserServiceImpl.class);
        //返回的bean为UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f@1942，
        //会去执行CglibAopProxy的内部类DynamicAdvisedInterceptor的interceptor方法
        bean.sayHello("hls");
    }
}
