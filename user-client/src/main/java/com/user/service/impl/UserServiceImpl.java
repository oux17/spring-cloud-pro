package com.user.service.impl;

import com.user.dto.UserInfoDTO;
import com.user.mapper.UserMapper;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserInfoDTO> searchAll() {
        return userMapper.searchAll();
    }
}
