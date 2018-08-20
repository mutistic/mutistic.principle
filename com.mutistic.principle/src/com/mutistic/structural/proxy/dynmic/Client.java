package com.mutistic.structural.proxy.dynmic;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client 客户端 
 * @description 
 * @author mutisitic
 * @date 2018年8月20日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.printOne("Java动态代理的使用：");
		Order order = new Order("AAA", 100d, "bbbb");
		PrintUtil.printThree("创建Order具体实例信息", order.toString());
		
		DynmicProxy proxy = new DynmicProxy();
		OrderApi api = proxy.getProxyInterface(order);
		
		api.setPrice(200d, "BBB");
		PrintUtil.printThree("BBB 修改后的Order信息", api.toString());
		
		api.setPrice(200d, "AAA");
		PrintUtil.printThree("AAA 修改后的Order信息", api.toString());
	}
}
