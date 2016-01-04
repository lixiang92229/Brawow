package com.widgetcarousel.entity;

public class TWidgetCarousel {
	/*
	 * 轮播编号
	 */
	private int id;
	
	/*
	 * 轮播位置
	 */
	private String key;
	
	/*
	 * 轮播状态
	 * 0 - 不显示
	 * 1 - 显示
	 */
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
