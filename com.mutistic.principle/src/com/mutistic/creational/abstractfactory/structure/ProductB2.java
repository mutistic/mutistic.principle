package com.mutistic.creational.abstractfactory.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteProduct: 具体的产品实现对象，
 * @description 通过在具体工厂里面，会选择具体的产品实现对象来创建符合抽象工厂定义的方法返回的产品的对象。
 * @author mutisitic
 * @date 2018年8月13日
 */
public class ProductB2 implements AbstractProductB {

	/**
	 * @description 具体的产品实现对象的功能
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @see com.mutistic.design.abstractfactory.structure.AbstractProductA#operationA()
	 */
	@Override
	public void operationB() {
		PrintUtil.printThree("ProductB2", "operationA");
	}

}
