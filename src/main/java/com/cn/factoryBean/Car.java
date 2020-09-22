package com.cn.factoryBean;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-17 15:51
 **/
public class Car {
    private Integer maxSpeed;
    private String brand;
    private Double price;

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
