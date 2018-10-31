package com.tomato.service.log.impl;

import com.tomato.dal.model.SysLog;
import com.tomato.service.base.BaseService;
import com.tomato.service.log.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author nanbo
 * @description 系统日志
 * @create 2018-10-31
 **/
@Slf4j
@Service("sysLogService")
public class SysLogServiceImpl extends BaseService<SysLog> implements SysLogService {

	@Override
	public List<SysLog> list(@RequestParam Map<String, Object> params) {
		try {
			String key = (String) params.get("key");
			Example example = new Example(SysLog.class);
			Example.Criteria criteria = example.createCriteria();
			if (StringUtils.isNotBlank(key)){
				criteria.andCondition("username=", key);
			}
			example.setOrderByClause("create_date desc");
			return this.selectByExample(example);
		} catch (Exception e) {
			log.error("获取系统日志信息失败", e);
			return new ArrayList<>();
		}
	}
}
