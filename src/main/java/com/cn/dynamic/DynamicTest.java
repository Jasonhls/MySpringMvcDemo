package com.cn.dynamic;

import com.cn.dynamic.cglib.StudentService;
import com.cn.dynamic.config.CglibConfig;
import com.cn.dynamic.config.JdkConfig;
import com.cn.dynamic.jdk.UserService;
import org.junit.Test;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-29 17:31
 **/
public class DynamicTest {
    /**
     * 测试jdk动态代理，生成的代理对象的Class内容参考当前项目的notes/dynamicClasses/jdk下的$Proxy15.class，
     * 看这个class文件中的sayHello方法，就知道会调用InvocationHandler的invoke方法
     */
    @Test
    public void testJdkDynamic() {
        //利用HSDB工具结合打断点，获取代理对象的class文件，生成的Class文件在C:\Windows\System32\Com\sun\proxy目录下
        //第一步，会把所有的bean初始化并放入spring容器中，而beanName为userServiceImpl的bean实例为JdkDynamicAopProxy对象
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdkConfig.class);
        //获取的bean为jdk代理的对象，该代理对象封装了JdkDynamicAopProxy对象
        UserService bean = context.getBean(UserService.class);
        //返回的bean为$Proxy15@1905
        //这里的bean为代理对象，执行sayHello方法的时候，会去调用JdkDynamicAopProxy的invoke方法，因为JdkDynamicAopProxy实现了InvocationHandler
        bean.sayHello("hls");
    }

    /**
     * 测试cglib动态代理，生成的代理对象的Class内容参考当前项目的notes/dynamicClasses/cglib下的class文件，会生成三个，
     * 主要看StudentService$$EnhancerBySpringCGLIB$$18f9a3ab.class中的sayHello方法和eatDinner方法，就知道会调用
     * CGLIB$CALLBACK_0.intercept方法，而CGLIB$CALLBACK_0就是DynamicAdvisedInterceptor对象，
     * 因此会走DynamicAdvisedInterceptor的intercept方法
     */
    @Test
    public void testCglibDynamic() {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\code\\cglib");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CglibConfig.class);
        StudentService bean = context.getBean(StudentService.class);
        //返回的bean为UserServiceImpl$$EnhancerBySpringCGLIB$$c825bb8f@1942，该对象为Cglib代理对象
        //执行目标类方法的时候会去调用CglibAopProxy的内部类DynamicAdvisedInterceptor的interceptor方法
        bean.sayHello("hls");
    }
}
