package com.cn.mybatis.javaBean;

import com.cn.mybatis.User;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-03 17:02
 **/
public class BeanInfoUtilTwo {
    public static void setPropertyByIntrospector(UserInfoDemo user, String name) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(UserInfoDemo.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        if(propertyDescriptors != null && propertyDescriptors.length > 0) {
            for (PropertyDescriptor pd : propertyDescriptors) {
                if(pd.getName().equals(name)) {
                    Method writeMethod = pd.getWriteMethod();
                    writeMethod.invoke(user, false);
                    System.out.println("set name: "+ user.getSex());
                    break;
                }
            }
        }
    }

    public static void getPropertyByIntrospector(UserInfoDemo user, String name) throws Exception{
        BeanInfo beanInfo = Introspector.getBeanInfo(UserInfoDemo.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        if(propertyDescriptors != null && propertyDescriptors.length > 0) {
            for (PropertyDescriptor pd : propertyDescriptors) {
                if(pd.getName().equals(name)) {
                    Method readMethod = pd.getReadMethod();
                    Object obj = readMethod.invoke(user);
                    System.out.println("get name: " + obj.toString());
                    break;
                }
            }
        }
    }
}
