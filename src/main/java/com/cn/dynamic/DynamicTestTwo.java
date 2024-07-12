package com.cn.dynamic;

import com.cn.dynamic.config.CustomDynamicConfig;
import com.cn.dynamic.jdk.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: 何立森
 * @Date: 2024/07/12/9:24
 * @Description:
 */
public class DynamicTestTwo {
    /**
     * 测试 添加自定义的advisor
     */
    @Test
    public void testCustomAdvisor() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomDynamicConfig.class);
        UserService bean = context.getBean(UserService.class);
        String className = bean.getClassName("张三");
        System.out.println(className);
    }
}
