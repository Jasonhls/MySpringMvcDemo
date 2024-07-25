package com.cn.javabean;

import org.junit.Test;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-03 17:10
 **/
public class BeanInfoTest {
    @Test
    public void testBeanInfo() {
        UserInfoDemo user = new UserInfoDemo();
        user.setName("张三");
        user.setSex(false);
        String propertyName = "name";
        String propertyValue = "李四";

        String propertyName2 = "sex";
        boolean propertyValue2 = true;


        try {
            Object beforeValue = BeanInfoUtilOne.getProperty(user, propertyName);
            System.out.println("设置前的值：" + beforeValue);
            //设置字段的值
            BeanInfoUtilOne.setProperty(user, propertyName, propertyValue);
            Object afterValue = BeanInfoUtilOne.getProperty(user, propertyName);
            System.out.println("设置后的值：" + afterValue);


            BeanInfoUtilTwo.setPropertyByIntrospector(user, propertyName2, propertyValue2);
            Object value = BeanInfoUtilTwo.getPropertyByIntrospector(user, propertyName2);
            System.out.println("方式2，设置后的值：" + value);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
