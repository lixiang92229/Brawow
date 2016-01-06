package com.intoinvoice.entity;

import java.sql.Date;

public class TIntoInvoice {

	/*
	 * 入货单编号
	 */
	private int id;
	
	/*
	 * 货物编号
	 */
	private int commodity_id;
	
	/*
	 * 入货人编号
	 */
	private int user_id;
	
	/*
	 * 尺码
	 */
	private int size;
	
	/*
	 * 总金额
	 */
	private float money;
	
	/*
	 * 单价
	 */
	private float price;
	
	/*
	 * 数量
	 */
	private int number;
	
	/*
	 * 创建时间 
	 */
	private Date created_time;
	
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

	public int getCommodity_id() {
		return commodity_id;
	}

	public void setCommodity_id(int commodity_id) {
		this.commodity_id = commodity_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
