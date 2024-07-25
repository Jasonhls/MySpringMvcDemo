package com.cn.javabean;

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
    public static void setPropertyByIntrospector(UserInfoDemo user, String propertyName, Object... propertyValues) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(UserInfoDemo.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        if(propertyDescriptors != null && propertyDescriptors.length > 0) {
            for (PropertyDescriptor pd : propertyDescriptors) {
                if(pd.getName().equals(propertyName)) {
                    Method writeMethod = pd.getWriteMethod();
                    writeMethod.invoke(user, propertyValues);
                    break;
                }
            }
        }
    }

    public static Object getPropertyByIntrospector(UserInfoDemo user, String propertyName) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(UserInfoDemo.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        if(propertyDescriptors != null && propertyDescriptors.length > 0) {
            for (PropertyDescriptor pd : propertyDescriptors) {
                if(pd.getName().equals(propertyName)) {
                    Method readMethod = pd.getReadMethod();
                    return  readMethod.invoke(user);
                }
            }
        }
        return null;
    }
}
