package com.cn.mybatis.mapper;

import com.cn.mybatis.User;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-02 14:10
 **/
public interface UserMapper {
    void insertUser(User user);

    User getUser(Integer id);
}
