package com.cn.designMode.template;

/**
 * @description:
 * @author: helisen
 * @create: 2020-08-10 14:21
 **/
public class TemplateSubA extends TemplateA{
    @Override
    protected void refresh() {
        System.out.println("大家好");
    }
}
