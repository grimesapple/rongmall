package com.yr.rongmall.mapper;

import com.yr.rongmall.entity.User;

import java.util.List;

/**
 * @author : yerong
 * @date : 2022/1/6 16:24
 */
public interface UserMapper {
     /**
      * 根据条件查询用户账号
      * @param user 用户信息
      * @return 用户列表
      */
     List<User> select(User user);

     /**
      * 新增用户
      * @param user 用户信息
      * @return 插入行数
      */
     int insertUser(User user);
}
