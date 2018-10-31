package com.tomato.dal.mapper;

import com.tomato.dal.model.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author nanbo
 * @description 系统日志
 * @create 2018-10-31
 **/
@Component
@Mapper
public interface SysLogMapper extends BaseMapper<SysLog> {

}
