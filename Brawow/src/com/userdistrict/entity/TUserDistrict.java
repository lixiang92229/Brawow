package com.userdistrict.entity;

public class TUserDistrict {

	/*
	 * 收货地址编号
	 */
	private int id;
	
	/*
	 * 用户编号
	 */
	private int user_id;
	
	/*
	 * 收件人名称
	 */
	private String name;
	
	/*
	 * 省编号
	 */
	private int province_id;
	
	/*
	 * 市编号
	 */
	private int city_id;
	
	/*
	 * 区编号
	 */
	private int county_id;
	
	/*
	 * 电话
	 */
	private int mobile;
	
	/*
	 * 邮编
	 */
	private int postcode;
	
	/*
	 * 中文地址
	 */
	private String location;
	
	/*
	 * 备注
	 */
	private String text;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProvince_id() {
		return province_id;
	}

	public void setProvince_id(int province_id) {
		this.province_id = province_id;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public int getCounty_id() {
		return county_id;
	}

	public void setCounty_id(int county_id) {
		this.county_id = county_id;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
