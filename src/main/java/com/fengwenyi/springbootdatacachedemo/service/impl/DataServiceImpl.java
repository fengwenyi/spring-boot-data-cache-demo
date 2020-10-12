package com.fengwenyi.springbootdatacachedemo.service.impl;

import com.fengwenyi.springbootdatacachedemo.entity.UserEntity;
import com.fengwenyi.springbootdatacachedemo.service.IDataService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.time.LocalDateTime;
import java.util.*;

/**
 * @author Erwin Feng
 * @since 2020-10-12
 */
@Service
public class DataServiceImpl implements IDataService {

    private static final Map<Integer, UserEntity> userDataMap = new HashMap<>();

    @Override
    public UserEntity insertUser(UserEntity entity) {
        Set<Integer> userIds = userDataMap.keySet();
        int idMax = userIds.stream().mapToInt(Integer::intValue).max().orElse(0);
        int userId = idMax + 1;
        entity.setId(userId).setCreateTime(LocalDateTime.now());
        userDataMap.put(userId, entity);
        return entity;
    }

    @Override
    public UserEntity selectUserById(int id) {
        return userDataMap.get(id);
    }

    @Override
    public List<UserEntity> selectUserAll() {
        return new ArrayList<>(userDataMap.values());
    }

    @Override
    public UserEntity updateById(UserEntity userEntity) {
        UserEntity dbUserEntity = userDataMap.get(userEntity.getId());
        if (!ObjectUtils.isEmpty(dbUserEntity)) {
            userEntity.setCreateTime(dbUserEntity.getCreateTime());
        }
        userEntity.setUpdateTime(LocalDateTime.now());
        userDataMap.put(userEntity.getId(), userEntity);
        return userEntity;
    }

    @Override
    public void deleteById(int id) {
        userDataMap.remove(id);
    }

    @Override
    public void deleteAll() {
        userDataMap.clear();
    }
}
