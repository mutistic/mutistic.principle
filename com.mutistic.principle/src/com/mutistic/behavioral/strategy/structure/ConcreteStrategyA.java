package com.mutistic.behavioral.strategy.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteStrategy：
 * @description 具体的策略实现，也就是具体的算法实现
 * @author mutistic
 * @date 2018年8月27日
 */
public class ConcreteStrategyA implements Strategy {

	/**
	 * @description 算法的具体实现
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @see com.mutistic.behavioral.strategy.structure.Strategy#algorithmInterface()
	 */
	@Override
	public void algorithmInterface() {
		PrintUtil.three("ConcreteStrategyA.algorithmInterface()", "算法的具体实现");
	}
	
}