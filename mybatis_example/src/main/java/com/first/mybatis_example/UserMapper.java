package com.first.mybatis_example;

import com.first.mybatis_example.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> findAllUser();
    public List<User> findUserByUserId(int userid);
}

