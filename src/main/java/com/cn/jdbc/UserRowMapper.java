package com.cn.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @description:
 * @author: helisen
 * @create: 2020-08-31 10:24
 **/
public class UserRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int index) throws SQLException {
        User user = new User(resultSet.getInt("id"), resultSet.getString("name"),
                resultSet.getInt("age"), resultSet.getString("sex"));
        return user;
    }
}
