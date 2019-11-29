package com.axz.dao.impl;

import com.axz.dao.UserDao;
import com.axz.entity.UserEntity;
import com.axz.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public int insertUser(UserEntity userEntity) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = JDBCUtils.getConnection();
            String name = userEntity.getName();
            String passwd = userEntity.getPasswd();
            String email = userEntity.getEmail();
            String phone = userEntity.getPhone();
            String sql = "INSERT INTO USER (name, phone, passwd, email) values (?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, phone);
            preparedStatement.setString(3, passwd);
            preparedStatement.setString(4, email);
            int res = preparedStatement.executeUpdate();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection, preparedStatement, result);
        }
        return 0;
    }
}
