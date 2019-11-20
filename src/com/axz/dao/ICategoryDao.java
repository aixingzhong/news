package com.axz.dao;

import com.axz.entity.ArticleEntity;
import com.axz.entity.CategoryEntity;
import com.axz.entity.NewsEntity;

import java.util.ArrayList;

public interface ICategoryDao {
    ArrayList<CategoryEntity> queryCategory() throws Exception;
    ArrayList<NewsEntity> queryNews() throws Exception;
    ArticleEntity queryArticle(int id) throws Exception;
}
