package com.inventory.entity;

public class TInventory {

	/*
	 * 仓库编号
	 */
	private int id;
	
	/*
	 * 仓库编号
	 */
	private int commodity_id;
	
	/*
	 * 尺码编号
	 */
	private int size_id;
	
	/*
	 * 数量
	 */
	private int number;
	
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
	public int getSize_id() {
		return size_id;
	}
	public void setSize_id(int size_id) {
		this.size_id = size_id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
