package com.tomato.web.log;

import com.tomato.common.constant.CenterResultConstant;
import com.tomato.common.result.CenterResult;
import com.tomato.common.result.ResponseResult;
import com.tomato.dal.model.SysLog;
import com.tomato.service.log.SysLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author nanbo
 * @description 系统日志
 * @create 2018-10-31
 **/
@RestController
@RequestMapping("/sys/log")
@Api(tags = "系统日志")
public class SysLogController {

	@Autowired
	private SysLogService sysLogService;

	@PostMapping("/list")
	@ApiOperation("所有日志信息")
	public ResponseResult list(@RequestParam Map<String, Object> params){
		List<SysLog> list = sysLogService.list(params);
		return new CenterResult(CenterResultConstant.SUCCESS, list);
	}
}
