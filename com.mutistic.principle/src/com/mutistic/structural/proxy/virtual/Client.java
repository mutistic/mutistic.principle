package com.mutistic.structural.proxy.virtual;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client 客户端 
 * @description 
 * @author mutisitic
 * @date 2018年8月20日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("虚拟代理的使用：");
		Order order = new Order("AAA", 100d, "bbbb");
		PrintUtil.three("创建Order具体实例信息", order.toString());
		
		VirtualProxy proxy = new VirtualProxy();
		proxy.setOrderApi(order);
		
		proxy.updatePrice(200d);
		PrintUtil.two("调用updatePrice后的Order信息", proxy.getOrderApi().toString());
	}
}
