package com.accesstoken.entity;

import java.util.Date;

public class wxaccesstokenmodel {

	private String access_token;
	private Date expires_in;
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public Date getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(Date expires_in) {
		this.expires_in = expires_in;
	}
	
	
	
}
