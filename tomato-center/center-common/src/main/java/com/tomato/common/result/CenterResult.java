package com.tomato.common.result;

import com.tomato.common.constant.CenterResultConstant;

/**
 * @author nanbo
 * @description 系统常量枚举类
 * @create 2018-10-31
 **/
public class CenterResult extends ResponseResult {

	public CenterResult(CenterResultConstant centerResultConstant, Object data) {
		super(centerResultConstant.getCode(), centerResultConstant.getMessage(), data);
	}
}
