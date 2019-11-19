package com.axz.service;

import com.axz.entity.CategoryEntity;
import com.axz.entity.NewsEntity;

import java.util.ArrayList;

public interface ICategoryService {
   ArrayList<CategoryEntity> queryAllCategory() throws Exception ;
   ArrayList<NewsEntity> queryNews() throws Exception;
}
