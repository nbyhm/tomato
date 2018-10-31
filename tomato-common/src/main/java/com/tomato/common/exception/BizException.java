package com.tomato.common.exception;

/**
 * @author nanbo
 * @description 自定义异常
 * @create 2018-10-02
 **/
public class BizException extends RuntimeException {
	private String message;
	private int code = 500;

	public BizException(String message) {
		super(message);
		this.message = message;
	}

	public BizException(String message, Throwable e) {
		super(message, e);
		this.message = message;
	}

	public BizException(int code, String message) {
		super(message);
		this.code = code;
		this.message = message;
	}

	public BizException(int code, String message, Throwable e) {
		super(message, e);
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
