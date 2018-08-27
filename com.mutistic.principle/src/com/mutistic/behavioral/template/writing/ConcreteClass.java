package com.mutistic.behavioral.template.writing;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteClass：
 * @description 具体实现类。用来实现算法骨架中的某些步骤，完成跟特定子类相关的功能
 * @author mutisitic
 * @date 2018年8月27日
 */
public class ConcreteClass extends AbstractClass {

	/**
	 * @description 原语操作1：具体实现
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @see com.mutistic.behavioral.template.structure.AbstractClass#doPrimitiveOpeartion1()
	 */
	@Override
	public void doPrimitiveOpeartion1() {
		PrintUtil.three("ConcreteClass.doPrimitiveOpeartion1()", "原语操作1：具体实现");
	}

	/**
	 * @description 原语操作2：具体实现
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @see com.mutistic.behavioral.template.structure.AbstractClass#doPrimitiveOpeartion2()
	 */
	@Override
	public void doPrimitiveOpeartion2() {
		PrintUtil.three("ConcreteClass.doPrimitiveOpeartion2()", "原语操作2：具体实现");
	}

	/**
	 * @description 钩子操作：具体实现
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @see com.mutistic.behavioral.template.writing.AbstractClass#hookOpeation1()
	 */
	@Override
	protected void hookOpeation1() {
		super.hookOpeation1();
		PrintUtil.three("ConcreteClass.hookOpeation1()", "钩子操作：具体实现");
	}

}
