package com.user.entity;

public class TUser {
	private int id;
	private String t_name;
	
	
	public TUser(){
	}
	
	public TUser(String t_name){
		this.t_name = t_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	

}
