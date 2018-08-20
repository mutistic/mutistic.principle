package com.mutistic.structural.proxy.dynmic;

/**
 * @program 具体目标对象
 * @description 
 * @author mutisitic
 * @date 2018年8月20日
 */
public class Order implements OrderApi {

	private String user;
	private Double price;
	private String title;
	
	@Override
	public void setPrice(Double price, String user) {
		this.price = price;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Order(String user, Double price, String title) {
		super();
		this.user = user;
		this.price = price;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "OrderApi [user=" + user + ", price=" + price + ", title=" + title + "]";
	}
}
