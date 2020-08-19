package com.cn.duotai;

/**
 * @description:
 * @author: helisen
 * @create: 2020-07-31 10:21
 **/
public class B extends A{
    public String show(B obj) {
        return "B and B";
    }

    @Override
    public String show(A obj) {
        return "B and A";
    }
}
