package com.comment.entity;

import java.sql.Date;

public class TComment {

	/*
	 * 评价编号
	 */
	private int id;
	
	/*
	 * 评价人编号
	 */
	private int user_id;
	
	/*
	 * 评价对象编号
	 */
	private int object_id;
	
	/*
	 * 字典项-评价级别：1好评 2中评 3差评
	 */
	private int level;
	
	/*
	 * 评价内容
	 */
	private String content;
	
	/*
	 * 创建时间
	 */
	private Date created_time;

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

	public int getObject_id() {
		return object_id;
	}

	public void setObject_id(int object_id) {
		this.object_id = object_id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	
	
}
