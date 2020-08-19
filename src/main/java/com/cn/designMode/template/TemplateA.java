package com.cn.designMode.template;

/**
 * @description:
 * @author: helisen
 * @create: 2020-08-10 14:20
 **/
public class TemplateA {
    /**
     *被子类覆盖的方法，如果对象是子类，调用refresh方法，肯定调用子类的refresh方法
     */
    protected void refresh(){
        System.out.println("啦啦");
    };

    public void sayHello()  {
        System.out.println("hello");
        refresh();
    }
}
