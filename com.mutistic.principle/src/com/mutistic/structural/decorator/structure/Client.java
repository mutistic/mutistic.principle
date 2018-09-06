package com.mutistic.structural.decorator.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端 
 * @description 演示 装饰模式[Decorator Pattern]-结构
 * @author mutisitic
 * @date 2018年9月6日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("装饰模式[Decorator Pattern]-结构");
		
		Component component = new ConcreteComponent();
		PrintUtil.two("创建具体组件对象：", component);
		
		Decorator decorator1 = new ConcreteDecoratorA(component);
		PrintUtil.two("创建具体的装饰对象：", decorator1);
		decorator1.operation();
		
		Decorator decorator2 = new ConcreteDecoratorB(component);
		PrintUtil.two("创建具体的装饰对象：", decorator2);
		decorator2.operation();
	}
}
