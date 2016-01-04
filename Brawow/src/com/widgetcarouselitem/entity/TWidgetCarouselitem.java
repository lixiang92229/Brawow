package com.widgetcarouselitem.entity;

public class TWidgetCarouselitem {
	
	/*
	 * 轮播详情编号
	 */
	private int id;
	
	/*
	 * 轮播编号
	 */
	private int carousel_id;
	
	/*
	 * 地址
	 */
	private String url;
	
	/*
	 * 类型
	 * 1 － 图片
	 * 2 － 跳转地址
	 */
	private String type;
	
	/*
	 * 图片url
	 */
	private String pic_url;
	
	/*
	 * 
	 */
	private String caption;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCarousel_id() {
		return carousel_id;
	}

	public void setCarousel_id(int carousel_id) {
		this.carousel_id = carousel_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
	
}
