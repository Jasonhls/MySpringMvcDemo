package com.cn.mybatis.javaBean;

import com.cn.mybatis.User;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-03 16:56
 **/
public class BeanInfoUtilOne {
    public static void setProperty(UserInfoDemo user, String name) throws Exception {
        PropertyDescriptor pd = new PropertyDescriptor(name, UserInfoDemo.class);
        Method writeMethod = pd.getWriteMethod();
        writeMethod.invoke(user, true);
        System.out.println("set name: " + user.getSex());
    }


    public static void getProperty(UserInfoDemo user, String name) throws Exception{
        PropertyDescriptor pd = new PropertyDescriptor(name, UserInfoDemo.class);
        Method readMethod = pd.getReadMethod();
        Object obj = readMethod.invoke(user);
        System.out.println("get name: " + obj.toString());
    }
}
