package com.fengwenyi.springbootdatacachedemo.service;

import com.fengwenyi.springbootdatacachedemo.entity.UserEntity;

import java.util.List;

/**
 * @author Erwin Feng
 * @since 2020-10-12
 */
public interface ITestService {
    UserEntity add(UserEntity userEntity);

    UserEntity getById(int id);

    List<UserEntity> getAll();
}
