package com.mutistic.behavioral.strategy.write;

/**
 * @program 继承 Strategy类的具体策略类
 * @description 封装了具体的算法或行为
 * @author mutistic
 * @date 2018年5月14日
 */
public class ConcreteStrategyA extends Strategy {

	/**
	 * 封装了具体的算法或行为
	 */
	@Override
	public void algorithmInterface() {
		// TODO Auto-generated method stub
		System.out.println("继承 Strategy类的具体策略类：ConcreteStrategyA");
	}
	
}