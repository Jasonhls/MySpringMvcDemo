package com.cn.debug;

/**
 * @description: IDEA debug模式下会自动调用变量的toString方法，具体的开关设置在setting-->Debugger-->Java-->Enable ''toString object view
 * @author: helisen
 * @create: 2020-09-16 11:47
 **/
public class ToStringTest {
    public static void main(String[] args) {
        WillToStringInvoked will = new WillToStringInvoked();
//        System.out.println("如果在这里设置断点，则输出1");
        System.out.println(will.getValue());
//        System.out.println("如果不设置断点，则输出0");
    }
}
