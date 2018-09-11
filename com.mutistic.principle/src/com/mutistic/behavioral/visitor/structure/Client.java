package com.mutistic.behavioral.visitor.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 访问者模式[Visitor Pattern]-结构
 * @author mutisitic
 * @date 2018年9月11日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("访问者模式[Visitor Pattern]-结构");
		// 创建ObjectStructure对象结构
		ObjectStructure os = new ObjectStructure();
		// 创建被访问的具体元素
		Element ea = new ConcreteElementA();
		Element eb = new ConcreteElementB();
		// 将元素添加至对象结构中
		os.addElement(ea);
		os.addElement(eb);
		// 创建具体的访问者对象1
		Visitor v1 = new ConcreteVisitor1();
		// 调用业务处理方法
		os.handleRequest(v1);
		
		// 创建具体的访问者对象
		Visitor v2 = new ConcreteVisitor2();
		// 调用业务处理方法
		os.handleRequest(v2);
	}
}
