package com.district.entity;

public class TDistrict {

	/*
	 *地区编号 
	 */
	private int id;
	
	/*
	 * 地区名称
	 */
	private String name;
	
	/*
	 * 等级
	 */
	private int level;
	
	/*
	 * 上一级编号
	 */
	private int upid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getUpid() {
		return upid;
	}

	public void setUpid(int upid) {
		this.upid = upid;
	}
	
	
	
}
