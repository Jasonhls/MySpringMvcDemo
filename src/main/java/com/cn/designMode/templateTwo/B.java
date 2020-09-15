package com.cn.designMode.templateTwo;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-01 09:33
 **/
public class B {
    private String name;

    public B() {
    }

    public B(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String eatLunch(String name) {
        return name + "开始吃午餐了，然后准备休息一会";
    }
}
