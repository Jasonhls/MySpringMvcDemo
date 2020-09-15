package com.cn.mybatis;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-02 14:09
 **/
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private String sex;

    /**
     * 必须要有这个无参构造方法，不然根据 UserMapper.xml中的配置，在查询数据库时，将不能反射构造出User实例
     */
    public User() {
    }

    public User(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
