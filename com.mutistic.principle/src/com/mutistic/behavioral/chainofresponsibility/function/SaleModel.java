package com.mutistic.behavioral.chainofresponsibility.function;

/**
 * @program POJO
 * @description 销售数据
 * @author mutisitic
 * @date 2018年9月7日
 */
public class SaleModel {
	/** 销售商品 */
	private String goods;
	/** 销售数量 */
	private int saleNum;
	
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public int getSaleNum() {
		return saleNum;
	}
	public void setSaleNum(int saleNum) {
		this.saleNum = saleNum;
	}
	public SaleModel(String goods, int saleNum) {
		super();
		this.goods = goods;
		this.saleNum = saleNum;
	}
	
}
