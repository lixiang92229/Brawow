package com.feedback.entity;

public class TFeedback {

	/*
	 * 反馈意见编号
	 */
	public int id;

	/*
	 * 用户编号
	 */
	public int user_id;

	/*
	 * 联系方式
	 */
	public String contact;

	/*
	 * 反馈意见内容
	 */
	public String description;
	
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
