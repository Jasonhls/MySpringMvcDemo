package com.cn.dynamic.cglib2;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-31 09:24
 **/
public class HelloService {
    public HelloService() {
        System.out.println("HelloService构造");
    }

    /**
     * 该方法不能被子类覆盖，Cglib是无法代理final修饰的方法的
     * @param name
     * @return
     */
    public final String sayOthers(String name) {
        System.out.println("HelloService:sayOthers");
        return name;
    }

    public String sayHello() {
        System.out.println("HelloService:sayHello");
        return null;
    }

    public void eatDinner(String name) {
        System.out.println(name + " start to eat dinner");
    }
}
