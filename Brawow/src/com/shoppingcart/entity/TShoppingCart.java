package com.shoppingcart.entity;

public class TShoppingCart {

	/*
	 * 购物车编号
	 */
	private int id;
	
	/*
	 * 用户编号
	 */
	private int user_id;
	
	/*
	 * 商品编号
	 */
	private int commodity_id;
	
	/*
	 * 商品数量
	 */
	private int number;
	
	/*
	 * 商品单价
	 */
	private float money;
	
	/*
	 * 商品总价
	 */
	private float num_money;

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

	public int getCommodity_id() {
		return commodity_id;
	}

	public void setCommodity_id(int commodity_id) {
		this.commodity_id = commodity_id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public float getNum_money() {
		return num_money;
	}

	public void setNum_money(float num_money) {
		this.num_money = num_money;
	}
	
}
