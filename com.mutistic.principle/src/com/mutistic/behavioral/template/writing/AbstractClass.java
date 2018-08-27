package com.mutistic.behavioral.template.writing;

import com.mutistic.utils.PrintUtil;

/**
 * @program AbstractClass：
 * @description 抽象类。用来定义算法骨架和原语操作，在这类里面，还可以提供算法的通用的实现
 * @author mutisitic
 * @date 2018年8月27日
 */
public abstract class AbstractClass {
	/**
	 * @description 模板方法：定义算法骨架：声明为final不支持重写
	 * @author mutisitic
	 * @date 2018年8月27日
	 */
	public final void templateMethod() {
		opeartion1();
		doPrimitiveOpeartion1();
		componOperation();
		doPrimitiveOpeartion2();
		opeartion2();
		hookOpeation1();
		facatory1();
	}
	
	/**
	 * @description 具体操作1：算法中的步骤，固定实现，子类不需要访问，声明成private
	 * @author mutisitic
	 * @date 2018年8月27日
	 */
	private void opeartion1() {
		PrintUtil.three("AbstractClass.opeartion1()", "具体操作1：算法中的步骤，固定实现，子类不需要访问，声明成private");
	}
	
	/**
	 * @description 具体操作2：算法中的步骤，固定实现，子类可能需要访问，不可以被覆盖，声明成final
	 * @author mutisitic
	 * @date 2018年8月27日
	 */
	protected final void opeartion2() {
		PrintUtil.three("AbstractClass.opeartion2()", "具体操作2：算法中的步骤，固定实现，子类可能需要访问，不可以被覆盖，声明成final");
	}
	
	/**
	 * @description 具体的AbstractClass操作，子类的公共功能，当通常不是具体算法步骤
	 * @author mutisitic
	 * @date 2018年8月27日
	 */
	protected void componOperation() {
		PrintUtil.three("AbstractClass.componOperation()", "具体的AbstractClass操作，子类的公共功能，当通常不是具体算法步骤");
	}
	
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
	 * @description 钩子操作：算法中的步骤，不一定需要，提供默认实现，由子类选择并具体实现
	 * @author mutisitic
	 * @date 2018年8月27日
	 */
	protected void hookOpeation1() {
		PrintUtil.three("AbstractClass.hookOpeation1()", "钩子操作：算法中的步骤，不一定需要，提供默认实现，由子类选择并具体实现");
	}
	
	/**
	 * @description 工厂方法：创建某个对象，在算法实现中可能需要
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @return 创建的某个算法实现需要的对象
	 */
	protected Object facatory1() {
		PrintUtil.three("AbstractClass.facatory1()", "工厂方法：创建某个对象，在算法实现中可能需要");
		return new Object();
	}
}
