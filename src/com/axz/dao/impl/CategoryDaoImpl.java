package com.axz.dao.impl;

import com.axz.dao.ICategoryDao;
import com.axz.entity.CategoryEntity;
import com.axz.entity.NewsEntity;

import java.sql.*;
import java.util.ArrayList;

public class CategoryDaoImpl implements ICategoryDao {
    @Override
    public ArrayList<CategoryEntity> queryCategory() {
        Connection connection = null;
        PreparedStatement prepareStatement = null;
        ResultSet result = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/news?serverTimezone=UTC", "root",
                    "root");
            String sql = "SELECT categoryID,categoryName,categoryDesc FROM `category`";
            //3.获取用于向数据库发送sql语句的Preperedstatement
            prepareStatement = connection.prepareStatement(sql);
            result = prepareStatement.executeQuery();
            ArrayList<CategoryEntity> listMap = new ArrayList<CategoryEntity>();
            while (result.next()) {
                CategoryEntity categoryEntity = new CategoryEntity();
                categoryEntity.setCategoryName(result.getString("categoryName"));
                categoryEntity.setCategoryID(result.getInt("categoryID"));
                categoryEntity.setCategoryDesc(result.getString("categoryDesc"));
                listMap.add(categoryEntity);
            }
            return listMap;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (prepareStatement != null) {
                    prepareStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public ArrayList<NewsEntity> queryNews() {
        Connection connection = null;
        PreparedStatement prepareStatement = null;
        ResultSet result = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/news?serverTimezone=UTC", "root",
                    "root");
            String sql = "select * from news;";
            prepareStatement = connection.prepareStatement(sql);
            result = prepareStatement.executeQuery();
            ArrayList<NewsEntity> list = new ArrayList<NewsEntity>();
            while (result.next()) {
                NewsEntity newsEntity = new NewsEntity(
                        result.getInt("newsID"),
                        result.getString("newsTitle"),
                        result.getString("newsContent"),
                        result.getString("newDate"),
                        result.getString("newsDesc"),
                        result.getString("newsImagePath"),
                        result.getInt("newRate"),
                        result.getBoolean("newsIscheck"),
                        result.getBoolean("newsIstop")
                );
                list.add(newsEntity);
            }
            return list;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (prepareStatement != null) {
                    prepareStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}