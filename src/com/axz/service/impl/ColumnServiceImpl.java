package com.axz.service.impl;

import com.axz.dao.impl.CategoryImpl;
import com.axz.entity.CategoryEntity;
import com.axz.service.IColumnService;

import java.util.ArrayList;

public class ColumnServiceImpl implements IColumnService {

    @Override
    public ArrayList<CategoryEntity> queryAllColumn() throws Exception {
        return new CategoryImpl().queryColumn();
    }
}
