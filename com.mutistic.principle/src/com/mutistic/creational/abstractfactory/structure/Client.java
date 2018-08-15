package com.mutistic.creational.abstractfactory.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Clien: 客户端
 * @description 主要使用抽象工厂来获取一些列所需要的产品对象，然后面对这些产品对象的接口变成，以实现需要的功能
 * @author mutisitic
 * @date 2018年8月13日
 */
public class Client {

	public static void main(String[] args) {
		AbstractFactory factory1 = new ConcreteFactory1();
		factory1.ceraterProductA().operationA();
		factory1.ceraterProductB().operationB();
		
		PrintUtil.println();
		
		AbstractFactory factory2 = new ConcreteFactory2();
		factory2.ceraterProductA().operationA();
		factory2.ceraterProductB().operationB();
	}
	
}
