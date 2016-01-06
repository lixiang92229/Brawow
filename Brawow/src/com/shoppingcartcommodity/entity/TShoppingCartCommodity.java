package com.shoppingcartcommodity.entity;

public class TShoppingCartCommodity {

	/*
	 * 购物城商品表编号
	 */
	private int id;
	
	/*
	 * 购物车编号
	 */
	private int shopping_cart_id;
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getShopping_cart_id() {
		return shopping_cart_id;
	}

	public void setShopping_cart_id(int shopping_cart_id) {
		this.shopping_cart_id = shopping_cart_id;
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
	
	
}
