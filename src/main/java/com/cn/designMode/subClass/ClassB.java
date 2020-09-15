package com.cn.designMode.subClass;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-04 14:21
 **/
public class ClassB extends ClassA{
    @Override
    public String eat(String name){
        return name + "在B中吃东西";
    }
}
