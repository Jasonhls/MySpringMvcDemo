package com.cn.debug;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-16 11:41
 **/
public class WillToStringInvoked {
    private volatile int value = 0;
    private int setValue() {
        if(value == 0) {
            synchronized (this) {
                if(value == 0) {
                    value = 1;
                }
            }
        }
        return value;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "This value is:" + setValue();
    }
}
