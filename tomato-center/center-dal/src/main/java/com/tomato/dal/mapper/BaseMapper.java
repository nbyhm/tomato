package com.tomato.dal.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author nanbo
 * @description
 * @create 2018-10-31
 **/
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
