package com.mutistic.design.simplefactory.structure;

/**
 * @program 简单工厂模式核心类，工厂类
 * @description 负责实现创建所有实例的内部逻辑
 * @author mutistic
 * @date 2018年5月14日
 */
public class Factory {

	/**
	 * @description 根据条件创建所需的产品对象 
	 * @author mutisitic
	 * @date 2018年8月10日
	 * @param condition 条件
	 * @return 具体API的实例
	 */
	public static API createrAPI(int condition) {
		switch (condition) {
		case 1:
			return new ImplA();
		case 2:
			return new ImplB();
		default:
			return null;
		}
	}

}
