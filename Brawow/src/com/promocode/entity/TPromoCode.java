package com.promocode.entity;

import java.sql.Date;

public class TPromoCode {

	/*
	 * 优惠码编号
	 */
	private int id;
	
	/*
	 * 可使用该卷的用户编号
	 */
	private int user_id;
	
	/*
	 * 优惠金额或折扣
	 */
	private float money;
	
	/*
	 * 类型（1-优惠金额，2-折扣）
	 */
	private int type;
	
	/*
	 * 优惠结束时间
	 */
	private Date end_time;
	
	/*
	 * 创建时间
	 */
	private Date created_time;
	
	/*
	 * 状态（1-可用，2-不可用）
	 */
	private int state;

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

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
}
