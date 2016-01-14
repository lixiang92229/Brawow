package com.commodity.entity;

public class TCommodity {

	/*
	 * 	商品表
	 */
	private int id;
	
	/*
	 * 	标题
	 */
	private String title;
	
	/*
	 * 	商品类别编号
	 */
	private int commodity_category;
	
	/*
	 * 	描述
	 */
	private String description;
	
	/*
	 * 	促销价格
	 */
	private float price;
	
	/*
	 * 	会员价格
	 */
	public float vip_price;
	
	/*
	 * 	原始价格
	 */
	private float original_price;
	
	/*
	 * 	好评所占百分比例
	 */
	private float score;
	
	/*
	 * 封面图片
	 * 多张图片以“；”隔开
	 */
	private String cover;
	
	/*
	 * 商品文字／图片介绍
	 * 通过富文本编辑器
	 */
	private String content;
	
	/*
	 * 收藏数
	 */
	public int collect_count;
	
	/*
	 * 评价数
	 */
	private int comment_count;
	
	/*
	 * 销量数
	 */
	private int sales_count;
	
	/*
	 * 点赞数
	 */
	private int like_count;
	
	/*
	 * 创建时间
	 */
	private int created_time;
	
	/*
	 * 状态
	 * 1——上架
	 * 0——下架
	 */
	private int state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCommodity_category() {
		return commodity_category;
	}

	public void setCommodity_category(int commodity_category) {
		this.commodity_category = commodity_category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getVip_price() {
		return vip_price;
	}

	public void setVip_price(float vip_price) {
		this.vip_price = vip_price;
	}

	public float getOriginal_price() {
		return original_price;
	}

	public void setOriginal_price(float original_price) {
		this.original_price = original_price;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCollect_count() {
		return collect_count;
	}

	public void setCollect_count(int collect_count) {
		this.collect_count = collect_count;
	}

	public int getComment_count() {
		return comment_count;
	}

	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}

	public int getSales_count() {
		return sales_count;
	}

	public void setSales_count(int sales_count) {
		this.sales_count = sales_count;
	}

	public int getLike_count() {
		return like_count;
	}

	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}

	public int getCreated_time() {
		return created_time;
	}

	public void setCreated_time(int created_time) {
		this.created_time = created_time;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
