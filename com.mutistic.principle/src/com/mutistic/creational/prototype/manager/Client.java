package com.mutistic.creational.prototype.manager;

import com.mutistic.utils.PrintUtil;

/**
 * @program 演示使用 原型管理器
 * @description 
 * @author mutisitic
 * @date 2018年8月15日
 */
public class Client {
	public static void main(String[] args) {
		Prototype p1 = new ConcretePrototype1();
		PrintUtil.printTwo("创建的原型实例Prototype", p1.toString());
		PrototypeManager.setPrototype("Prototype1", p1);

		PrintUtil.println();
		// 动态切换
		PrototypeManager.setPrototype("Prototype1", new ConcretePrototype2());

		Prototype p2 = PrototypeManager.getPrototype("Prototype1").clone();
		p2.setName("AAA");
		PrintUtil.printTwo("从原型管理器获取的Prototype1并重置name", p2.toString());

		Prototype p3 = PrototypeManager.getPrototype("Prototype1").clone();
		p3.setName("BBB");
		PrintUtil.printTwo("从原型管理器获取的Prototype1并重置name", p3.toString());

		PrintUtil.println();
		PrototypeManager.removePrototype("Prototype1");

		PrintUtil.println();
		Prototype p4 = PrototypeManager.getPrototype("Prototype1");
		PrintUtil.printThree("从原型管理器获取的Prototype1", p4 == null ? "null" : p4.toString());

	}
}
