package com.cn.spi;

/**
 * @Description
 * @Author HeLiSen
 * @Date 2022/12/6 10:27
 */
public class Dog implements IShout{

    private String name;

    /*public Dog(String name) {
        this.name = name;
    }*/

    @Override
    public void shout() {
        System.out.println("狗叫");
    }
}
