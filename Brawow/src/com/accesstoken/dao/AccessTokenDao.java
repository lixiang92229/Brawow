package com.accesstoken.dao;

import java.util.List;

import com.accesstoken.entity.TAccessToken;

public interface AccessTokenDao {
	public List<TAccessToken>  findwxaccesstoken();
	public int setwxaccesstoken(TAccessToken accesstoken);
}
