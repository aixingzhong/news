package com.axz.dao;

import com.axz.entity.CategoryEntity;

import java.util.ArrayList;

public interface IColumnDao {
    ArrayList<CategoryEntity> queryColumn() throws Exception;
}
