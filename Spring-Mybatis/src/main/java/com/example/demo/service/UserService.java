package com.example.demo.service;


import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
    public List<User> getAllUser(){
        return  userMapper.getAllUser();
    }
    public void insertOne(User u){
        userMapper.insertOne(u);
    }
    public void updateByID(User u){
        userMapper.updateByID(u);
    }
    public void deleteById(Integer id){
        userMapper.deleteById(id);
    }
}
