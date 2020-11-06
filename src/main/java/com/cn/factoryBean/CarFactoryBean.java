package com.cn.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-17 15:50
 **/
public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        car.setBrand("宝马");
        car.setMaxSpeed(300);
        car.setPrice(500000d);
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
