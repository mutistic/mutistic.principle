package com.mutistic.structural.bridge.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 桥接模式[Bridge Pattern]-结构
 * @author mutisitic
 * @date 2018年9月7日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("桥接模式[Bridge Pattern]-结构");
		
		Implementor implA = new ConcreteImplementorA();
		Abstraction refined = new RefinedAbstraction(implA);
		PrintUtil.println();
		refined.operation();
		
		Implementor implB = new ConcreteImplementorB();
		RefinedAbstraction refinedB = new RefinedAbstraction(implB);
		refinedB.otherOperation();
	}
}
