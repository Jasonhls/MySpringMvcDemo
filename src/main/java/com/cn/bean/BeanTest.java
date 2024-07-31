package com.cn.bean;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-04 15:07
 **/
public class BeanTest {
    /**
     * 如果是xml配置文件创建容器，使用ClassPathXmlApplicationContext对象，XmlWebApplicationContext没有有参构造，
     * 可以使用GenericXmlApplicationContext，如下面的beanTestTwoXml方法
     */
    @Test
    public void beanTestOneXml() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean/beanTestOne.xml");
        MyBeanStudent mbs = (MyBeanStudent) context.getBean("myBeanStudent");
        System.out.println(mbs.toString());
    }

    /**
     * 使用GenericXmlApplicationContext创建容器
     */
    @Test
    public void beanTestTwoXml() {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("bean/beanTestOne.xml");
        MyBeanStudent mbc =  (MyBeanStudent) context.getBean("myBeanStudent");
        System.out.println(mbc.toString());
    }

    /**
     * 如果使用配置创建容器，只能使用AnnotationConfigApplicationContext对象
     * 这里不能使用AnnotationConfigWebApplicationContext，因为这个对象没有有参构造
     */
    @Test
    public void beanTestTwoConfig() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
        MyBeanConfigStudent bean = ac.getBean(MyBeanConfigStudent.class);
        System.out.println(bean.toString());
    }

    @Test
    public void testCandidateBean() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
        Student bean = (Student) ac.getBean("studentOne");
        System.out.println("学生姓名：" + bean.getName() + "，年龄：" + bean.getAge());
    }
}
