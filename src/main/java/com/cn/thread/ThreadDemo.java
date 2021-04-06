package com.cn.thread;

/**
 * @description:
 * @author: helisen
 * @create: 2021-04-06 15:49
 **/
public class ThreadDemo {
    static final Object lock = new Object();
    static int counter = 0;

    public static void main(String[] args) {
        synchronized (lock) {
            counter++;
        }
    }
}
