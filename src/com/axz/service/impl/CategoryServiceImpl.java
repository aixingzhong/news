package com.axz.service.impl;

import com.axz.dao.impl.CategoryDaoImpl;
import com.axz.entity.CategoryEntity;
import com.axz.entity.NewsEntity;
import com.axz.service.ICategoryService;

import java.util.ArrayList;

public class CategoryServiceImpl implements ICategoryService {

    @Override
    public ArrayList<CategoryEntity> queryAllCategory() {
        return new CategoryDaoImpl().queryCategory();
    }

    @Override
    public ArrayList<NewsEntity> queryNews() {
        return new CategoryDaoImpl().queryNews();
    }
}
