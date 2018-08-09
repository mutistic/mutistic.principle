package com.mutistic.design.simplefactory.structure;

/**
 * @program 简单工厂模式核心类，工厂类
 * @description 负责实现创建所有实例的内部逻辑
 * @author mutistic
 * @date 2018年5月14日
 */
public class Creator {

	/**
	 * @description 根据产品类型创建所需的产品对象
	 * @author mutistic
	 * @date 2018年5月14日
	 * @param productType
	 *            产品类型
	 * @return 具体产品实例对象
	 */
	public Product createrOpeartion(String productType) {
		switch (productType) {
		case "A":
			return new ConcreteProductA();
		case "B":
			return new ConcreteProductB();
		case "C":
			return new ConcreteProductC();
		default:
			return null;
		}
	}

}
