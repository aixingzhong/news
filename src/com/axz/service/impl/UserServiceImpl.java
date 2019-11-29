package com.axz.service.impl;

import com.axz.dao.impl.UserDaoImpl;
import com.axz.entity.UserEntity;
import com.axz.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public int insertUser(UserEntity userEntity) {
        return new UserDaoImpl().insertUser(userEntity);
    }
}
