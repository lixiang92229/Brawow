package com.verificationcode.entity;

import java.sql.Date;

public class TVerificationCode {

	/*
	 * 验证码编号
	 */
	private int id;
	
	/*
	 * 6位随机数
	 */
	private int code;
	
	/*
	 * 创建时间
	 */
	private Date created_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	
	
}
