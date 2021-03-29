package com.cn.transactionManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 虽然加了事务，sql不会执行，但是表里面的主键id值却自增了一下
     * @param name
     * @param initMoney
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addAccount(String name, int initMoney) {
        String accountName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        jdbcTemplate.update("insert into account (account_name, user, money) values (?, ?, ?)",
                accountName, name, initMoney);
//        int i = 1 / 0 ;

    }
}
