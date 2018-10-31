package com.tomato.service.log;

import com.tomato.service.IService;
import com.tomato.dal.model.SysLog;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author nanbo
 * @description 系统日志
 * @create 2018-10-31
 **/
public interface SysLogService extends IService<SysLog> {

	/**
	 * 查询所有日志列表
	 * @param params
	 * @return
	 */
	List<SysLog> list(@RequestParam Map<String, Object> params);
}
