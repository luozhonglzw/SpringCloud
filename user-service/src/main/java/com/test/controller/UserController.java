package com.test.controller;

import com.test.entity.User;
import com.test.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController//直接返回数据
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/user/{uid}")
    public User findUserById(@PathVariable("uid") int uid){//这里是一种风格 通过路径去改变uid的值
        return userService.getUserById(uid);
    }
}
