package com.axz.utils;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtils {
    public static Connection getConnection() {
        try {
            InitialContext context = new InitialContext();
            DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/axz");
            Connection connection = ds.getConnection();
            return connection;
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void close(Connection connection, PreparedStatement PreparedStatement, ResultSet result) {
        try {
            if (result != null) {
                result.close();
            }
            if (PreparedStatement != null) {
                PreparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

