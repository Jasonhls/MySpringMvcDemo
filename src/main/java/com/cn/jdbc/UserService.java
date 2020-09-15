package com.cn.jdbc;

import java.util.List;

/**
 * @description:
 * @author: helisen
 * @create: 2020-08-31 10:28
 **/
public interface UserService {
    void save(User user);

    List<User> getUsers();
}
