package com.mutistic.structural.flyweight.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：
 * @description 享元模式[Flyweight Pattern]-结构
 * 享元客户端，主要的作是维持一个对flweight的引用，计算或存储享元对象的外部状态，当然这里可以访问共享和不共享的flyweight对象。
 * @author mutisitic
 * @date 2018年8月31日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("享元模式[Flyweight Pattern]-结构");
		
		FlyweightFactory factory = new FlyweightFactory();
		PrintUtil.two("Client创建享元工厂实例： ", factory);
		
		Flyweight f1 = factory.getFlyweight("Concrete1");
		f1.opeartion("ConcreteFlyweight");
		
		Flyweight f2 = factory.getFlyweight("Unshared1");
		f2.opeartion("UnsharedConcreteFlywelght");
	}
}
