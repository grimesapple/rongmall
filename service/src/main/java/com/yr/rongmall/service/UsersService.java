package com.yr.rongmall.service;

import com.yr.rongmall.entity.Users;

/**
 * @author yerong
 * @date 2022/1/14 14:33
 */
public interface UsersService {
    //注册用户
    int insertUser(Users user);
    //登录账号
    boolean login(String username,String password);
}
