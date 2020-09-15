package com.cn.designMode.templateTwo;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-01 09:36
 **/
public class TemplateTest {
    public static void main(String[] args) {
        String person = "tom";
        String name = "hls";
        Integer age = 29;
        String sex = "男";
        TemplateDemo ttt = new TemplateDemo();
        String result = ttt.test(person, name, age, sex);
        System.out.println("测试返回结果：" + result);
    }
}
