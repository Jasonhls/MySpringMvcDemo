package com.cn.designMode.template.test;

import com.cn.designMode.template.TemplateA;
import com.cn.designMode.template.TemplateSubA;

/**
 * @description:
 * @author: helisen
 * @create: 2020-08-10 14:23
 **/
public class TestTemplate {
    public static void main(String[] args) {
        TemplateA templateA = new TemplateSubA();
        templateA.sayHello();
    }
}
