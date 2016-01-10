package com.commodityreturn.entity;

import java.sql.Date;

public class TCommodityReturn {

	/*
	 * 换货单号
	 */
	public int id;

	/*
	 * 愿订单号
	 */
	public int order_profile_id;

	/*
	 * 用户编号
	 */
	public int user_id;

	/*
	 * 处理人名称
	 */
	public String admin_name;

	/*
	 * 换货寄回物流编号
	 */
	public String logistics_id_back;

	/*
	 * 用户收货地址编号
	 */
	public String logistics_id_return;

	/*
	 * 用户收货地址编号
	 */
	public int user_district_id;

	/*
	 * 描述原因
	 */
	public String description;

	/*
	 * 状态可更新时间
	 */
	public Date update_time;

	/*
	 * 创建时间
	 */
	public Date create_date;

	/*
	 * 状态
	 * 0——未处理
	 * 1——客户已发货
	 * 2——客服已收到货
	 * 3——客户确认可以换货
	 * 4——客服确认不可以换货
	 * 5——换货完成
	 */
	public int state;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrder_profile_id() {
		return order_profile_id;
	}
	public void setOrder_profile_id(int order_profile_id) {
		this.order_profile_id = order_profile_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getLogistics_id_back() {
		return logistics_id_back;
	}
	public void setLogistics_id_back(String logistics_id_back) {
		this.logistics_id_back = logistics_id_back;
	}
	public String getLogistics_id_return() {
		return logistics_id_return;
	}
	public void setLogistics_id_return(String logistics_id_return) {
		this.logistics_id_return = logistics_id_return;
	}
	public int getUser_district_id() {
		return user_district_id;
	}
	public void setUser_district_id(int user_district_id) {
		this.user_district_id = user_district_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
