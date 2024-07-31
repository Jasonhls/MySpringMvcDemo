package com.cn.mybatis.test;

import com.cn.mybatis.User;
import com.cn.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;

/**
 * @description:
 * @author: helisen
 * @create: 2020-09-02 14:52
 **/
public class TestMapper {

    static SqlSessionFactory sqlSessionFactory;

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
            User user = mapper.getUser(1);
            System.out.println("第一次查询结果：" + user);

            sqlSession.clearCache();//清空一级缓存

            User user2 = mapper.getUser(1);
            System.out.println("第二次查询结果：" + user2);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void getUser1() throws Exception {
        String resource = "mybatis/test/mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println("第一次查询结果：" + user);
        User user2 = mapper.getUser(1);
        System.out.println("第二次查询结果：" + user2);
        sqlSession.close();
    }

    @Test
    public void getUser2() throws Exception {
        String resource = "mybatis/test/mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println("第一次查询结果：" + user);
        sqlSession.clearCache();//清空一级缓存
        User user2 = mapper.getUser(1);
        System.out.println("第二次查询结果：" + user2);
        sqlSession.close();
    }

    @Test
    public void getUser3() throws Exception {
        String resource = "mybatis/test/mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println("第一次查询结果：" + user);
        sqlSession.close();

        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.getUser(1);
        System.out.println("第二次查询结果：" + user2);
        sqlSession2.close();
    }

    @Test
    public void getUser4() throws Exception {
        String resource = "mybatis/test/mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println("第一次查询结果：" + user);

        //插入操作
        User insertUser = new User("tom", 5,"男");
        mapper.insertUser(insertUser);
        sqlSession.commit();

        User user2 = mapper.getUser(1);
        System.out.println("第二次查询结果：" + user2);
        sqlSession.close();
    }

    @Test
    public void getUser5() throws Exception {
        String resource = "mybatis/test/mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println("第一次查询结果：" + user);
        User user2 = mapper.getUser(1);
        System.out.println("第二次查询结果：" + user2);
        sqlSession.close();
    }


    @Test
    public void getUser6() throws Exception {
        String resource = "mybatis/test/mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println("第一次查询结果：" + user);

        sqlSession.close();

        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.getUser(1);
        System.out.println("第二次查询结果：" + user2);
        System.out.println(user == user2);
        sqlSession2.close();
    }

    @Test
    public void getUser7() throws Exception {
        String resource = "mybatis/test/mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println("第一次查询结果：" + user);

        sqlSession.close();

        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        //插入操作
        User insertUser = new User("tom", 5,"男");
        mapper2.insertUser(insertUser);

        User user2 = mapper2.getUser(1);
        System.out.println("第二次查询结果：" + user2);
        System.out.println(user == user2);
        sqlSession2.close();
    }

    @Test
    public void getUser8() throws Exception {
        String resource = "mybatis/test/mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println("第一次查询结果：" + user);

        sqlSession.close();

        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.getUser(1);
        System.out.println("第二次查询结果：" + user2);
        System.out.println(user == user2);
        sqlSession2.close();
    }

    @Test
    public void getUser9() throws Exception {
        String resource = "mybatis/test/mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //先从二级缓存里面查询，再从一级缓存里面查询，再从数据库查询（发送SQL），将查询的结果集存入一级缓存
        User user = mapper.getUser(1);
        System.out.println("第一次查询结果：" + user);
        //一级缓存关闭，将一级缓存的数据写入二级缓存
        sqlSession.close();

        //获取session，开启新的一级缓存
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        //执行新增(flushCache为false,并不会清空二级缓存)
        User insertUser = new User("tom", 5,"男");
        mapper2.insertUser(insertUser);

        //先查询二级缓存（查询到了）
        User user2 = mapper2.getUser(1);
        System.out.println("第二次查询结果：" + user2);
        System.out.println(user == user2);
        sqlSession2.close();
    }
}
