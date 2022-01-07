package com.yr.rongmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : yerong
 * @date : 2022/1/6 16:12
 */
@SpringBootApplication
@MapperScan(value = "com.yr.rongmall.mapper")
public class ApiRunApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(ApiRunApplicationMain.class,args);
    }

}
