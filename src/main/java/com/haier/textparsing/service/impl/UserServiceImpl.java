package com.haier.textparsing.service.impl;

import com.haier.textparsing.mapper.UserMapper;
import com.haier.textparsing.pojo.User;
import com.haier.textparsing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(Integer id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
