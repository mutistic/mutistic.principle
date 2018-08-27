package com.mutistic.behavioral.template.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program AbstractClass：
 * @description 抽象类。用来定义算法骨架和原语操作，在这类里面，还可以提供算法的通用的实现
 * @author mutisitic
 * @date 2018年8月27日
 */
public abstract class AbstractClass {
	/**
	 * @description 原语操作1：所谓原语操作就是抽象操作，必须要由子类提供实现
	 * @author mutisitic
	 * @date 2018年8月27日
	 */
	public abstract void doPrimitiveOpeartion1();

	/**
	 * @description 原语操作2：所谓原语操作就是抽象操作，必须要由子类提供实现
	 * @author mutisitic
	 * @date 2018年8月27日
	 */
	public abstract void doPrimitiveOpeartion2();
	
	/**
	 * @description 模板方法：定义算法骨架：声明为final不支持重写
	 * @author mutisitic
	 * @date 2018年8月27日
	 */
	public final void templateMethod() {
		PrintUtil.three("AbstractClass", "通用的实现1");
		doPrimitiveOpeartion1();
		doPrimitiveOpeartion2();
		PrintUtil.three("AbstractClass", "通用的实现2");
	}
}
