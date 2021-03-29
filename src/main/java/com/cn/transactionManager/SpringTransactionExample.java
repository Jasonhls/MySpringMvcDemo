package com.cn.transactionManager;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * 编程式
 */

public class SpringTransactionExample {
    private static String url = "jdbc:mysql://127.0.0.1:3306/test";
    private static String user = "root";
    private static String password = "123456";

    public static void main(String[] args) {
        //获取数据源
        DriverManagerDataSource ds = new DriverManagerDataSource(url, user, password);
        //编程式事务
        TransactionTemplate template = new TransactionTemplate();
        //设置事务管理器
        template.setTransactionManager(new DataSourceTransactionManager(ds));
        template.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                Connection connection = DataSourceUtils.getConnection(ds);
                Object savePoint = null;
                try {
                    {
                        //插入
                        PreparedStatement ps = connection.prepareStatement(
                                "insert into account(account_name, user, money) values (?, ? ,?)");
                        ps.setString(1, "111");
                        ps.setString(2, "aaa");
                        ps.setInt(3, 10000);
                        ps.executeUpdate();
                    }
                    //设置保存点
                    savePoint = transactionStatus.createSavepoint();
                    {
                        //插入
                        PreparedStatement ps = connection.prepareStatement(
                                "insert into account(account_name, user, money) values (?, ? ,?)");
                        ps.setString(1, "222");
                        ps.setString(2, "bbb");
                        ps.setInt(3, 10000);
                        ps.executeUpdate();
                    }
                    {
                        //更新
                        //插入
                        PreparedStatement ps = connection.prepareStatement(
                                "update account set money = money + 10 where user = ?");
                        ps.setString(1, "aaa");
                        ps.executeUpdate();
                    }

                }catch (Exception e) {
                    System.out.println("更新失败");
                    if(savePoint != null) {
                        transactionStatus.rollbackToSavepoint(savePoint);
                    }else {
                        transactionStatus.setRollbackOnly();
                    }
                }
                return null;
            }
        });
    }
}
