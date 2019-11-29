package com.axz.service;

import com.axz.dao.UserDao;
import com.axz.dao.impl.UserDaoImpl;
import com.axz.entity.UserEntity;

public interface UserService {
    int insertUser(UserEntity userEntity);
}
