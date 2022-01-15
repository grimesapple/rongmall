package com.yr.rongmall.controller;

import com.yr.rongmall.entity.Users;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.yr.rongmall.service.UsersService;
import com.yr.rongmall.vo.ResultVO;

import javax.annotation.Resource;

/**
 * @author yerong
 * @date 2022/1/14 14:40
 */
@RestController
@Api(tags = "用户控制器")
@RequestMapping("users")
public class UsersController {


    @Resource
    UsersService usersService;

    ResultVO<Users> resultVO = new ResultVO<>();

    /**
     * 注册用户
     *
     * @param users 用户信息
     * @return 返回结果
     */
    @ApiOperation("注册用户")
    @PostMapping("/register")
    public ResultVO<Users> insertUser(Users users) {
        return usersService.insertUser(users) == 1 ? resultVO.ok() : resultVO.error();
    }

    /**
     * 登录账号
     * @param username 账号
     * @param password 密码
     * @return 返回结果
     */
    @ApiOperation("登录账号")
    @PostMapping("/login")
    public ResultVO<Users> login(@RequestParam(value = "username") String username,
                                 @RequestParam(value = "password") String password) {
        return usersService.login(username,password)?resultVO.ok("登录成功") : resultVO.error("账号密码错误");
    }
}
