package com.order.entity;

import java.sql.Date;

public class TOrder {

	/*
	 * 订单编号
	 */
	private int id;
	
	/*
	 * 购买人编号
	 */
	private int user_id;
	
	/*
	 * 总金额
	 */
	private float money;
	
	/*
	 * 用户收获地址信息编号
	 */
	private int user_district;
	
	/*
	 * 数量
	 */
	private int number;
	
	/*
	 * 状态（0-取消订单，1-已下单，2-已支付，3-已发货，4-已收货，5-已完成）
	 */
	private int state;
	
	/*
	 *支付凭证
	 */
	private String sn;
	
	/*
	 * 创建时间
	 */
	private Date created_time;
	
	/*
	 * 更新时间
	 */
	private Date updated_at;
	
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

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public int getUser_district() {
		return user_district;
	}

	public void setUser_district(int user_district) {
		this.user_district = user_district;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
