package com.mutistic.principle.abstractfactory.structure;

/**
 * @program AbstractFactory: 抽象工厂，定义创建一系列产品对象的操作接口
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public interface AbstractFactory {

	/**
	 * @description 定义创建一系列产品对象的操作接口:AbstractProductA
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @return
	 */
	AbstractProductA ceraterProductA();
	
	/**
	 * @description 定义创建一系列产品对象的操作接口:AbstractProductB
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @return
	 */
	AbstractProductB ceraterProductB();
}
