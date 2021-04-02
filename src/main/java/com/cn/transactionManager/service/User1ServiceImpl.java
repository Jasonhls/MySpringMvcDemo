package com.cn.transactionManager.service;

import com.cn.pojo.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: helisen
 * @create: 2021-04-02 13:24
 **/
@Service
public class User1ServiceImpl implements User1Service{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void addRequired(User1 user1) {
        jdbcTemplate.update("insert into user1 (name) values (?)", user1.getName());
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void addRequiresNew(User1 user1) {
        jdbcTemplate.update("insert into user1 (name) values (?)", user1.getName());
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.NESTED)
    public void addNested(User1 user1) {
        jdbcTemplate.update("insert into user1 (name) values (?)", user1.getName());
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void add(User1 user1) {
        jdbcTemplate.update("insert into user1 (name) values (?)", user1.getName());
        int i = 1 / 0;
    }

    /**
     * 同一个类中调用内部方法（带有@Transactional注解的），内部方法的事务不生效
     * @param user1
     */
    @Override
    public void addTest(User1 user1) {
        this.add(user1);
    }
}
