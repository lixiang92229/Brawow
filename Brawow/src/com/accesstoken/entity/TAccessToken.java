package com.accesstoken.entity;

import java.sql.Date;

public class TAccessToken {

	/*
	 * 令牌编号
	 */
	public int id;
	
	/*
	 * 令牌
	 */
	public String access_token;
	
	/*
	 * 令牌结束时间
	 */
	public Date end_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
}
