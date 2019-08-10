package com.example.demo.mapper;


import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {

    User Sel(int id);
    List<User> getAllUser();
    void insertOne(User u);
    void updateByID(User u);
    void deleteById(Integer id);
}
