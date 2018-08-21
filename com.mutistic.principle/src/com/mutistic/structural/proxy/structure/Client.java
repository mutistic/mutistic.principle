package com.mutistic.structural.proxy.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client客户端
 * @description 
 * @author mutisitic
 * @date 2018年8月17日
 */
public class Client {
	public static void main(String[] args) {
		
		PrintUtil.one("代理模式[Proxy Pattern]");
		
		RealSubject real = new RealSubject();
		PrintUtil.two("创建RealSubject具体对象实例：", real);
		
		Proxy proxy = new Proxy(real);
		PrintUtil.two("创建Proxy代理对象实例：", proxy);
		
		proxy.request();
	}
}
