package com.tomato.common.constant;

/**
 * @author nanbo
 * @description 系统结果常量枚举
 * @create 2018-10-31
 **/
public enum CenterResultConstant {
	/**
	 * 失败
	 */
	FAILED(400, "failed"),

	/**
	 * 成功
	 */
	SUCCESS(200, "success");

	public int code;

	public String message;

	CenterResultConstant (int code, String message){
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
