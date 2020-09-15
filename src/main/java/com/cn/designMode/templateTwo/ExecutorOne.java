package com.cn.designMode.templateTwo;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-01 10:59
 **/
public class ExecutorOne implements Executor {
    private String name;
    private Integer age;

    public ExecutorOne() {
    }

    public ExecutorOne(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String execute() {
        return this.name + "的年纪是" + this.age + "岁，喜欢冒险";
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }


}
