package com.fengwenyi.springbootdatacachedemo.service;

import com.fengwenyi.springbootdatacachedemo.entity.UserEntity;

import java.util.List;

/**
 * @author Erwin Feng
 * @since 2020-10-12
 */
public interface IUserService {

    UserEntity queryById(int id);

    List<UserEntity> queryAll();

    UserEntity add(UserEntity userEntity);

    UserEntity updateById(UserEntity userEntity);

    void deleteById(int id);

    void deleteAll();
}
