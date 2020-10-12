package com.fengwenyi.springbootdatacachedemo.service.impl;

import com.fengwenyi.springbootdatacachedemo.entity.UserEntity;
import com.fengwenyi.springbootdatacachedemo.service.IDataService;
import com.fengwenyi.springbootdatacachedemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Erwin Feng
 * @since 2020-10-12
 */
@Service
public class UserServiceImpl implements IUserService {

    // @Autowired
    private IDataService iDataService;

    @Autowired
    public void setiDataService(IDataService iDataService) {
        this.iDataService = iDataService;
    }

    @Override
    @Cacheable(value = "user", key = "#id")
    public UserEntity queryById(int id) {
        return iDataService.selectUserById(id);
    }

    @Override
    //@Cacheable(value = "user")
    public List<UserEntity> queryAll() {
        return iDataService.selectUserAll();
    }

    @Override
    @CachePut(value = "user", key = "#userEntity.id")
    public UserEntity add(UserEntity userEntity) {
        return iDataService.insertUser(userEntity);
    }

    @Override
    @CachePut(value = "user", key = "#userEntity.id")
    public UserEntity updateById(UserEntity userEntity) {
        return iDataService.updateById(userEntity);
    }

    @Override
    @CacheEvict(value = "user", key = "#id")
    public void deleteById(int id) {
        iDataService.deleteById(id);
    }

    @Override
    @CacheEvict(value = "user", allEntries = true)
    public void deleteAll() {
        iDataService.deleteAll();
    }

}
