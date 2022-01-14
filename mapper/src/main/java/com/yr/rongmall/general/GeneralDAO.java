package com.yr.rongmall.general;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author yerong
 * @date 2022/1/14 14:14
 */
public  interface  GeneralDAO<T> extends Mapper<T>, MySqlMapper<T> {
}
