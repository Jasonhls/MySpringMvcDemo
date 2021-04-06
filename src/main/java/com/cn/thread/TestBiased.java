package com.cn.thread;

import org.openjdk.jol.info.ClassLayout;

/**
 * @description:
 * @author: helisen
 * @create: 2021-04-06 17:30
 **/
public class TestBiased {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(ClassLayout.parseInstance(dog));
    }
}
