package com.cn.mybatis.javaBean;

import com.cn.mybatis.User;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-03 17:10
 **/
public class BeanInfoTest {
    @Test
    public void testBeanInfo() {
        UserInfoDemo user = new UserInfoDemo();
        user.setName("peida");
        user.setSex(false);
        String name = "sex";
        try {
            BeanInfoUtilOne.getProperty(user, name);
            BeanInfoUtilOne.setProperty(user, name);
            BeanInfoUtilOne.getProperty(user, name);

            BeanInfoUtilTwo.setPropertyByIntrospector(user, name);
            BeanInfoUtilTwo.getPropertyByIntrospector(user, name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
