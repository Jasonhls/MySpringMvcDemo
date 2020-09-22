package com.cn.factoryBean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-17 16:00
 **/
public class FactoryBeanTest {
    @Test
    public void testFactoryBeanOne() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/factoryBean/factoryBean.xml");
        Car car = (Car) context.getBean("car");
        CarFactoryBean carFactoryBean = (CarFactoryBean) context.getBean("&car");
        System.out.println(car.getMaxSpeed() + "; " + car.getBrand() + "; " + car.getPrice());
        System.out.println(carFactoryBean.getCarInfo());
    }
}
