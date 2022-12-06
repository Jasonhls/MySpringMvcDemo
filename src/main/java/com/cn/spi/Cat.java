package com.cn.spi;

/**
 * @Description
 * @Author HeLiSen
 * @Date 2022/12/6 10:26
 */
public class Cat implements IShout{
    @Override
    public void shout() {
        System.out.println("喵叫");
    }
}
