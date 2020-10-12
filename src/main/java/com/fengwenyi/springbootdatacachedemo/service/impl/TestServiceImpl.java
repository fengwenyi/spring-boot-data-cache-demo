package com.fengwenyi.springbootdatacachedemo.service.impl;

import com.fengwenyi.springbootdatacachedemo.entity.UserEntity;
import com.fengwenyi.springbootdatacachedemo.service.ITestService;
import com.fengwenyi.springbootdatacachedemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Erwin Feng
 * @since 2020-10-12
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private IUserService iUserService;

    @Override
    public UserEntity add(UserEntity userEntity) {
        return iUserService.add(userEntity);
    }

    @Override
    public UserEntity getById(int id) {
        return iUserService.queryById(id);
    }

    @Override
    public List<UserEntity> getAll() {
        return iUserService.queryAll();
    }
}
