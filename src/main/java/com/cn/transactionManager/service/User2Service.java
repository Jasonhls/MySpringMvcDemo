package com.cn.transactionManager.service;

import com.cn.pojo.User2;

/**
 * @description:
 * @author: helisen
 * @create: 2021-04-02 13:27
 **/
public interface User2Service {
    void addRequired(User2 user2);

    void addRequiredException(User2 user2);

    void addRequiresNew(User2 user2);

    void addRequiresNewException(User2 user2);

    void addNested(User2 user2);

    void addNestedException(User2 user2);
}
