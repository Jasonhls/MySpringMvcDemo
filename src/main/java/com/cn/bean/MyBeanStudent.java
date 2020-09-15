package com.cn.bean;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-04 15:05
 **/
public class MyBeanStudent {
    private String name;
    private Integer age;
    private String sex;

    public MyBeanStudent() {
    }

    public MyBeanStudent(String name, Integer age, String sex) {
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
    public String toString() {
        return "MyBeanStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
