package com.test.service.Impl;

import com.test.entity.User;
import com.test.mapper.UserMapper;
import com.test.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper UserMapper;
    @Override
    public User getUserById(int id) {
      return UserMapper.getUserById(id);
    }
}
