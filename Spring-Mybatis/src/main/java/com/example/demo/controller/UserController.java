package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@RestController
@RequestMapping("/testuser")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){

        return userService.Sel(id).toString();
    }
    @RequestMapping("getAllUser")
    public List<User> GetAllUser(){
        return userService.getAllUser();
    }
    @RequestMapping("insertOne")
    public void insertOne(){
        User uer=new User(9,"kkkk");
        userService.insertOne(uer);
    }
    @RequestMapping("updateOne")
    public void updateOne(){
        User uer=new User(3,"dddddddddd");
        userService.updateByID(uer);
    }
    @RequestMapping("deleteOne/{id}")
    public void deleteOne(@PathVariable Integer id){
        userService.deleteById(id);
    }


}
