package com.cn.designMode.subClass;

import org.junit.Test;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-04 14:22
 **/
public class TestSub {
    @Test
    public void testOne() {
        ClassA ca = new ClassB();
        String hls = ca.eat("hls");
        System.out.println("返回吃的结果为：" + hls);
    }
}
