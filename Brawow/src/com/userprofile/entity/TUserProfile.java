package com.userprofile.entity;

import javax.xml.soap.Text;

public class TUserProfile {


	/*
	 * 用户详情编号
	 */
	private int id;
	
	/*
	 * 用户编号
	 */
	private int user_id;
	
	/*
	 * 真实姓名
	 */
	private String realname;
	
	/*
	 * 昵称
	 */
	private String nickname;
	
	/*
	 * 性别
	 * 0 － 男
	 * 1 － 女
	 */
	private int gender;
	
	/*
	 * 头像地址
	 */
	private String avatar_url;
	
	/*
	 * 个性签名
	 */
	private Text signature;

	/*
	 * 用户地址信息
	 */
	private String address;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public Text getSignature() {
		return signature;
	}

	public void setSignature(Text signature) {
		this.signature = signature;
	}
	
}
