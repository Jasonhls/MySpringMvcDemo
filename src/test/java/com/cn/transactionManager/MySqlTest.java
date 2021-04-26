package com.cn.transactionManager;

import java.sql.*;

/**
 * @description:
 * @author: helisen
 * @create: 2021-04-25 09:43
 **/
public class MySqlTest {
    public static void main(String[] args) {
        String connStr = "jdbc:mysql://localhost:3306/test";
        String sql ="select * from user where name = ?";
        Connection connection = null;
        ResultSet rs = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(connStr, "root", "123456");
            preparedStatement = connection.prepareStatement(sql);
//            String s = "'张三';drop table user;";
            String s = "'张三';delete from user;";
            System.out.println("s=" + s);
            preparedStatement.setString(1, s);
            rs = preparedStatement.executeQuery();
            System.out.println("sql=" + preparedStatement.toString());
            int col = rs.getMetaData().getColumnCount();
            System.out.println("------------------------------------------");
            while(rs.next()) {
                for (int i = 1; i < col; i++) {
                    System.out.println(rs.getString(i) + "\t");
                    if((i == 2 && (rs.getString(i).length() < 8))) {
                        System.out.println("\t");
                    }
                }
                System.out.println("");
            }
            System.out.println("==========================");
        } catch (Exception exception) {
            exception.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
