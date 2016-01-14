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

	public AccessTokenService getAccessTokenService() {
		return accessTokenService;
	}

	public void setAccessTokenService(AccessTokenService accessTokenService) {
		this.accessTokenService = accessTokenService;
	}
}
