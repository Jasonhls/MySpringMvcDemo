package com.cn.transactionManager.service;

import com.cn.pojo.User1;

public interface AccountService {
    void addAccount(String name, int initMoney);

    void addTest(User1 user1);
}
