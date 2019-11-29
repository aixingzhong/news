package com.axz.dao.impl;

import com.axz.dao.ICategoryDao;
import com.axz.entity.ArticleEntity;
import com.axz.entity.CategoryEntity;
import com.axz.entity.NewsEntity;
import com.axz.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;

public class CategoryDaoImpl implements ICategoryDao {
    @Override
    public ArrayList<CategoryEntity> queryCategory() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        ArrayList<CategoryEntity> listMap = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "SELECT categoryID,categoryName,categoryDesc FROM `category`";
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            listMap = new ArrayList<CategoryEntity>();
            while (result.next()) {
                CategoryEntity categoryEntity = new CategoryEntity();
                categoryEntity.setCategoryName(result.getString("categoryName"));
                categoryEntity.setCategoryID(result.getInt("categoryID"));
                categoryEntity.setCategoryDesc(result.getString("categoryDesc"));
                listMap.add(categoryEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection, preparedStatement, result);
        }
        return listMap;
    }

    @Override
    public ArrayList<NewsEntity> queryNews() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        ArrayList<NewsEntity> list = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "select * from news;";
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            list = new ArrayList<NewsEntity>();
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
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection, preparedStatement, result);
        }
        return list;
    }

    @Override
    public ArticleEntity queryArticle(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        ArticleEntity articleEntity = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "SELECT * from news WHERE newsID =" + id;
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            if (result.next()) {
                articleEntity = new ArticleEntity(
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
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection, preparedStatement, result);
        }
        return articleEntity;
    }
}