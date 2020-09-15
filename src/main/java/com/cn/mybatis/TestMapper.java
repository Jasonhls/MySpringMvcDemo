package com.cn.mybatis;

import com.cn.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-02 14:52
 **/
public class TestMapper {
    static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }

    @Test
    public void testAdd(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = new User("tom", 5,"男");
            mapper.insertUser(user);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void getUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUser(27);
            System.out.println("name: " + user.getName() + "| age: " + user.getAge() + "| sex: " + user.getSex());
        } finally {
            sqlSession.close();
        }
    }
}
