package com.fengwenyi.springbootdatacachedemo.controller;

import com.fengwenyi.springbootdatacachedemo.entity.UserEntity;
import com.fengwenyi.springbootdatacachedemo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Erwin Feng
 * @since 2020-10-12
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private ITestService iTestService;

    @Autowired
    public void setiTestService(ITestService iTestService) {
        this.iTestService = iTestService;
    }

    @PostMapping("/add")
    public UserEntity add(@RequestBody UserEntity userEntity) {
        return iTestService.add(userEntity);
    }

    @GetMapping("/get")
    public UserEntity get(int id) {
        return iTestService.getById(id);
    }

    @GetMapping("/all")
    public List<UserEntity> getAll() {
        return iTestService.getAll();
    }

}
