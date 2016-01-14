package com.accesstoken.service.impl;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.accesstoken.dao.AccessTokenDao;
import com.accesstoken.entity.TAccessToken;
//import com.accesstoken.entity.wxaccesstokenmodeal;
import com.accesstoken.entity.wxaccesstokenmodel;
import com.accesstoken.service.AccessTokenService;
//import com.util.HttpRequestGet;

import net.sf.json.JSONObject;

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
			String string_token="{\"access_token\":\"12321321\"}";//HttpRequestGet.get_request("https://api.weixin.qq.com/cgi-bin/token", "grant_type=client_credential&appid="+"wx04065007e1776bd4"+"&secret="+"86a986f8501306f8e9effa9f8ce62dd3");
			//System.out.println(string_token);
			//存入数据库
			System.out.println("222");
			JSONObject jsonObject = JSONObject.fromObject(string_token);
			wxaccesstokenmodel wxmodeal=(wxaccesstokenmodel)JSONObject.toBean(jsonObject,wxaccesstokenmodel.class);
			System.out.println("1");
			TAccessToken accesstoken=new TAccessToken();
			accesstoken.setAccess_token(wxmodeal.getAccess_token());
			System.out.println(wxmodeal.getAccess_token());
			
			Date d=new Date();   
			SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH：mm：ss");   
			df.format(new Date(d.getTime() + 2 * 60 * 60 * 1000));  
			accesstoken.setEnd_time(new Date(d.getTime() + 2 * 60 * 60 * 1000));  //当前时间加两个小时
			 
			System.out.println("1111");
			int a=accessTokenDao.setwxaccesstoken(accesstoken);
			if(a!=-1)
			{
				System.out.println("999");
				return string_token;
			}
			else
			{
				System.out.println("erroe");
				return "Error";
			}
				
			
			
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
		
		
}

	public AccessTokenDao getAccessTokenDao() {
		return accessTokenDao;
	}

	public void setAccessTokenDao(AccessTokenDao accessTokenDao) {
		this.accessTokenDao = accessTokenDao;
	}}
