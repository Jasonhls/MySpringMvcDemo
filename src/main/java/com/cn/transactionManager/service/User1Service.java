package com.cn.transactionManager.service;

import com.cn.pojo.User1;

/**
 * @description:
 * @author: helisen
 * @create: 2021-04-02 13:21
 **/
public interface User1Service {
    void addRequired(User1 user1);

    void addRequiresNew(User1 user1);

    void addNested(User1 user1);

    void add(User1 user1);

    void addTest(User1 user1);

    void addTest2(User1 user1);
}
