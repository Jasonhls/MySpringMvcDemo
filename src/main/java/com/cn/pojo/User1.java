package com.cn.pojo;

/**
 * @description:
 * @author: helisen
 * @create: 2021-04-02 13:23
 **/
public class User1 {
    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
