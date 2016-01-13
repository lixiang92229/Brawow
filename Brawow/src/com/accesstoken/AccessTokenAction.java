package com.accesstoken;

import com.accesstoken.service.AccessTokenService;

public class AccessTokenAction {
	private AccessTokenService accessTokenService;
	//用户token
	private String token;
	
	public String getWXUsableAccessToken()
	{
		return accessTokenService.getwxaccesstoken(token);
	}
}
