package com.cn.transactionManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addAccount(String name, int initMoney) {
        String accountName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        jdbcTemplate.update("insert into account (account_name, user, money) values (?, ?, ?)",
                accountName, name, initMoney);

    }
}
