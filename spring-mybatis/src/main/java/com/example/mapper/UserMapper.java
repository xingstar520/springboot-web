package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Jie.
 * @description: TODO
 * @date 2023/10/30
 * @version: 1.0
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> list(); // 查询所有用户
}
