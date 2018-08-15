package com.mutistic.creational.factory.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteCreator: 具体的创建对象，覆盖实现Creator定义的工厂方法，返回具体的Product实例
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public class ConcreteCreator extends Creator {

	/**
	 * @description 创建Product的工厂方法的具体实现（创建Product的具体实例ConcreteProduce）
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @return
	 * @see com.mutistic.design.factory.structure.Creator#factoryMethod()
	 */
	@Override
	public Product factoryMethod() {
		PrintUtil.printTwo("ConcreteCreator-factoryMethod()", "创建Product的具体实例ConcreteProduce");
		return new ConcreteProduce();
	}
	
}
