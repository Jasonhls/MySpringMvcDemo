package com.cn.jdbc;

import java.sql.*;

/**
 * @description:  手动连接数据库，并执行sql，返回结果
 * @author: helisen
 * @create: 2020-08-31 11:38
 **/
public class MyDataSourceTest {
    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "123456";
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            /*查询*/
//            statement = connection.createStatement();
//            String sql = "select * from user";
//            resultSet = statement.executeQuery(sql);
//            while(resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                String sex = resultSet.getString("sex");
//                System.out.println("id==" + id + ";name==" + name + ";age==" + age + ";sex==" + sex);
//            }
            /*插入*/
            String sql = "insert into user(name, age, sex) values(?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "小明");
            preparedStatement.setInt(2, 28);
            preparedStatement.setString(3, "男");
            int i = preparedStatement.executeUpdate();
            System.out.println("插入返回结果：" + i);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
           /* if(resultSet != null) {
                try {
                        resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }*/
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
