package com.first.mybatis_example;


import com.first.mybatis_example.User;
import com.first.mybatis_example.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired(required=false)
    public UserMapper userMapper;

    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }

    public List<User> findUserByUserId(int userid){
        return userMapper.findUserByUserId(userid);
    }
}

