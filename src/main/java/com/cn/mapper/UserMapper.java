package com.cn.mapper;

import com.cn.pojo.User;

/**
 * @description:
 * @author: helisen
 * @create: 2021-03-26 15:57
 **/
public interface UserMapper {
    /**
     * 插入user
     * @param user
     */
    void insertUser(User user);

    /**
     * 根据id查询user
     * @param id
     * @return
     */
    User getUserById(Integer id);
}
