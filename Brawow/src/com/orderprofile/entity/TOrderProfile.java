package com.orderprofile.entity;

public class TOrderProfile {

	/*
	 * 订单详情编号
	 */
	private int id;
	
	/*
	 * 订单编号
	 */
	private int order_id;
	
	/*
	 * 商品编号
	 */
	private int commodity_id;
	
	/*
	 * 商品单价
	 */
	private float money;
	
	/*
	 * 商品数量
	 */
	private int number;
	
	/*
	 * 商品总价
	 */
	private float num_money;
	
	/*
	 * 尺码
	 */
	private int size;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCommodity_id() {
		return commodity_id;
	}

	public void setCommodity_id(int commodity_id) {
		this.commodity_id = commodity_id;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public float getNum_money() {
		return num_money;
	}

	public void setNum_money(float num_money) {
		this.num_money = num_money;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
