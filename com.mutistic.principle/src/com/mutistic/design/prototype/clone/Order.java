package com.mutistic.design.prototype.clone;

public class Order implements Cloneable {

	private Long orderId;
	private String orderNo;
	private Goods goods;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Order clone = (Order) super.clone();
		clone.setGoods((Goods) this.goods.clone());
		return clone;
	}

	@Override
	public String toString() {
		return super.toString() + "Order [orderId=" + orderId + ", orderNo=" + orderNo + ", goods=" + goods + "]";
	}

}
