package com.mutistic.principle.prototype.clone;

public class Goods implements Cloneable {

	private Long goodsId;
	private String goodsNo;

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsNo() {
		return goodsNo;
	}

	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return super.toString() + "Goods [goodsId=" + goodsId + ", goodsNo=" + goodsNo + "]";
	}

}
