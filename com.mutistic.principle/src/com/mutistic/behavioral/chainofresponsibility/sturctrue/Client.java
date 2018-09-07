package com.mutistic.behavioral.chainofresponsibility.sturctrue;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：
 * @description 职责链的客户端，向链上的具体处理者对象提交请求，让职责链负责处理
 * @author mutisitic
 * @date 2018年9月7日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("职责链模式[Chain of Responsibility Pattern]-结构");
		Handler h1 = new ConcreteHandler1();
		
		PrintUtil.two("创建职责链ConcreteHandler1", h1);
		
		Handler h2 = new ConcreteHandler2();
		PrintUtil.two("创建职责链ConcreteHandler1", h2);
		
		h1.setSuccessor(h2);
		h1.handleRequest();
	}
}
