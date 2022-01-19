package com.yr.rongmall.service.impl;

import com.yr.rongmall.entity.Users;
import com.yr.rongmall.mapper.UsersMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.yr.rongmall.service.UsersService;

import javax.annotation.Resource;

/**
 * @author yerong
 * @date 2022/1/14 14:33
 */
@Service
@Slf4j
public class UsersServiceImpl implements UsersService {

    @Resource
    UsersMapper usersMapper;

    @Override
    public int insertUser(Users user) {
        return usersMapper.insert(user);
    }

    @Override
    public boolean login(String username, String password) {
        Users users = new Users();
        users.setUsername(username);
        users.setPassword(password);
        int i = usersMapper.selectCount(users);
        log.info("数量:"+i);
        return i > 0;
    }
}
