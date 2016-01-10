package com.user.entity;

public class TUser {
	
	/*
	 * 用户编号
	 */
	private int id;
	
	/*
	 * 用户名
	 */
	private String username;
	
	/*
	 * 电话号码
	 */
	private String mobile;
	
	/*
	 * token
	 */
	private String access_token;
	
	/*
	 * 密码的hash值
	 */
	private String password_hash;
	
	/*
	 * 状态
	 * 1 － 普通用户
	 * 2 － 管理员
	 * 3 － 会员
	 */
	private int status;
	
	/*
	 * 余额
	 */
	private int integral;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getPassword_hash() {
		return password_hash;
	}

	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

}
