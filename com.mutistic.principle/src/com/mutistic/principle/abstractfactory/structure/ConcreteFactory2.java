package com.mutistic.principle.abstractfactory.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteFactory: 具体的工厂，实现抽象工厂定义的方法，具体实现一系列产品对象的创建
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public class ConcreteFactory2 implements AbstractFactory {

	/**
	 * @description 具体实现一系列产品对象的创建:ProductA2
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @return
	 * @see com.mutistic.design.abstractfactory.structure.AbstractFactory#ceraterProductA()
	 */
	@Override
	public AbstractProductA ceraterProductA() {
		PrintUtil.printThree("ConcreteFactoryB", "ceraterProductA");
		return new ProductA2();
	}

	/**
	 * @description 具体实现一系列产品对象的创建:ProductB2
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @return
	 * @see com.mutistic.design.abstractfactory.structure.AbstractFactory#ceraterProductA()
	 */
	@Override
	public AbstractProductB ceraterProductB() {
		PrintUtil.printThree("ConcreteFactoryB", "ceraterProductB");
		return new ProductB2();
	}

}
