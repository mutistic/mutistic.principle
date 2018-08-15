package com.mutistic.principle.factory.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Creator: 创建器，声明工厂的抽象方法
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public abstract class Creator {

	/**
	 * @description 创建Product的抽象工厂方法
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @return
	 */
	public abstract Product factoryMethod();
	
	/**
	 * @description 具体业务逻辑 
	 * @author mutisitic
	 * @date 2018年8月13日
	 */
	public void operation() {
		PrintUtil.printTwo("Creator-operation", "具体业务逻辑 ");
		Product product = factoryMethod();
		product.operation();
	}
	
}
