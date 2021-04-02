package com.cn.transactionManager.service;

import com.cn.pojo.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: helisen
 * @create: 2021-04-02 13:28
 **/
@Service
public class User2ServiceImpl implements User2Service{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void addRequired(User2 user2) {
        jdbcTemplate.update("insert into user2 (name) values (?)", user2.getName());
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void addRequiredException(User2 user2) {
        jdbcTemplate.update("insert into user2 (name) values (?)", user2.getName());
        throw new RuntimeException();
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void addRequiresNew(User2 user2) {
        jdbcTemplate.update("insert into user2 (name) values (?)", user2.getName());
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void addRequiresNewException(User2 user2) {
        jdbcTemplate.update("insert into user2 (name) values (?)", user2.getName());
        throw new RuntimeException();
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.NESTED)
    public void addNested(User2 user2) {
        jdbcTemplate.update("insert into user2 (name) values (?)", user2.getName());
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.NESTED)
    public void addNestedException(User2 user2) {
        jdbcTemplate.update("insert into user2 (name) values (?)", user2.getName());
        throw new RuntimeException();
    }
}
