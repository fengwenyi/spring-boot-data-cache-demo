package com.fengwenyi.springbootdatacachedemo.service;

import com.fengwenyi.springbootdatacachedemo.entity.UserEntity;

import java.util.List;

/**
 * @author Erwin Feng
 * @since 2020-10-12
 */
public interface IDataService {

    UserEntity insertUser(UserEntity entity);

    UserEntity selectUserById(int id);

    List<UserEntity> selectUserAll();

    UserEntity updateById(UserEntity userEntity);

    void deleteById(int id);

    void deleteAll();
}
