package com.tomato.common.result;

/**
 * @author nanbo
 * @description 相应结果，统一返回
 * @create 2018-10-31
 **/
public class ResponseResult {
	/**
	 * 状态码：200成功，其他为失败
	 */
	public int code;

	/**
	 * 成功为success，其他为失败原因
	 */
	public String message;

	/**
	 * 数据结果集
	 */
	public Object data;

	public ResponseResult(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
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

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
