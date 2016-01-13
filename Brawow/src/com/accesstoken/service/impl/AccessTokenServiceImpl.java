package com.accesstoken.service.impl;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.accesstoken.dao.AccessTokenDao;
import com.accesstoken.entity.TAccessToken;
import com.accesstoken.service.AccessTokenService;
import com.util.HttpRequestGet;

public class AccessTokenServiceImpl implements AccessTokenService {
	private AccessTokenDao accessTokenDao;

	public String getwxaccesstoken(String token)
	{//获取token·
		List<TAccessToken> taccesstoken=new ArrayList<TAccessToken>();
		taccesstoken = accessTokenDao.findwxaccesstoken();
		Date nowtime=new Date();
		if(taccesstoken.isEmpty())
		{
			//没有token,重新获取，存入
			String string_token=HttpRequestGet.get_request("https://api.weixin.qq.com/cgi-bin/token", "grant_type=client_credential&appid="+"wx04065007e1776bd4"+"&secret="+"86a986f8501306f8e9effa9f8ce62dd3");
			return string_token;
		}
		else {
			if((taccesstoken.get(0).end_time).compareTo(nowtime)<0)
			{
				//该access——token可以使用
				return taccesstoken.get(0).getAccess_token();
			}
			else
			{
				//超时重新获取,获取后存入数据库
					return null;	
			}
		}
}}
