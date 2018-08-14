package com.mutistic.design.builder.export;

public class GoodsBody {

	private Long id;
	private String goodsNo;
	private String name;
	private Double price;
	private Double number;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGoodsNo() {
		return goodsNo;
	}
	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getNumber() {
		return number;
	}
	public void setNumber(Double number) {
		this.number = number;
	}
	public GoodsBody() {
		super();
	}
	public GoodsBody(Long id, String goodsNo, String name, Double price, Double number) {
		super();
		this.id = id;
		this.goodsNo = goodsNo;
		this.name = name;
		this.price = price;
		this.number = number;
	}
	@Override
	public String toString() {
		return "GoodsBody [goodsNo=" + goodsNo + ", name=" + name + ", price=" + price + ", number="
				+ number + "]";
	}
	
}
