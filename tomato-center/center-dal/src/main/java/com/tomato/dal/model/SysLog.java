package com.tomato.dal.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author nanbo
 * @description 系统日志
 * @create 2018-10-31
 **/
@Table(name = "sys_log")
public class SysLog implements Serializable {
	private static final long serialVersionUID = -8878596941954995444L;

	@Id
	@GeneratedValue(generator = "JDBC")
	private Long id;

	//用户名
	@Column(name = "username")
	private String username;

	//用户操作
	@Column(name = "operation")
	private String operation;

	//请求方法
	@Column(name = "method")
	private String method;

	//请求参数
	@Column(name = "params")
	private String params;

	//执行时长(毫秒)
	@Column(name = "time")
	private Long time;

	//IP地址
	@Column(name = "ip")
	private String ip;

	//创建时间
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@Column(name = "create_date")
	private Date createDate;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置：用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 获取：用户名
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 设置：用户操作
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * 获取：用户操作
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * 设置：请求方法
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * 获取：请求方法
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * 设置：请求参数
	 */
	public void setParams(String params) {
		this.params = params;
	}

	/**
	 * 获取：请求参数
	 */
	public String getParams() {
		return params;
	}

	/**
	 * 设置：IP地址
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * 获取：IP地址
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * 设置：创建时间
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 获取：创建时间
	 */
	public Date getCreateDate() {
		return createDate;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}
}
