package com.cn.designMode.templateTwo;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-02 09:37
 **/
public class MyExecutorSetter implements ExecutorSetter{
    private String name;
    private Integer age;
    private String sex;

    public MyExecutorSetter() {
    }

    public MyExecutorSetter(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void setValues(Executor executor) {
        System.out.println("MyExecutorSetter 开始执行setValues方法");
        executor.setAge(this.age);
        executor.setName(this.name);
    }
}
