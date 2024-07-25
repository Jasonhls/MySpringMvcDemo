package com.cn.javabean;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-03 16:56
 **/
public class BeanInfoUtilOne {
    /**
     * 设置对象属性的值
     * @param user 对象
     * @param propertyName 属性名称
     * @param propertyValues 属性值
     * @throws Exception
     */
    public static void setProperty(UserInfoDemo user, String propertyName, Object... propertyValues) throws Exception {
        PropertyDescriptor pd = new PropertyDescriptor(propertyName, UserInfoDemo.class);
        Method writeMethod = pd.getWriteMethod();
        writeMethod.invoke(user, propertyValues);
    }


    public static Object getProperty(UserInfoDemo user, String propertyName) throws Exception{
        PropertyDescriptor pd = new PropertyDescriptor(propertyName, UserInfoDemo.class);
        Method readMethod = pd.getReadMethod();
        return readMethod.invoke(user);
    }
}
