package com.mutistic.structural.proxy.virtual;

import com.mutistic.utils.PrintUtil;

/**
 * @program 虚拟代理 
 * @description 
 * @author mutisitic
 * @date 2018年8月20日
 */
public class VirtualProxy {
	
	private OrderApi orderApi;
	public OrderApi getOrderApi() {
		return orderApi;
	}
	public void setOrderApi(Order order) {
		this.orderApi = order;
	}
	
	/**
	 * @description 转调真正的业务功能
	 * @author mutisitic
	 * @date 2018年8月20日
	 * @param price
	 */
	public void updatePrice(Double price) {
		if(this.orderApi == null) {
			return;
		}
		
		PrintUtil.two("转调真正的业务功能前，price", this.orderApi.getPrice());
		this.orderApi.updatePrice(price);
		PrintUtil.three("转调真正的业务功能后，price", this.orderApi.getPrice());
	}
	
}
