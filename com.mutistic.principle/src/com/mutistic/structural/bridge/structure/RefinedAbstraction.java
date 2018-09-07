package com.mutistic.structural.bridge.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program RefinedAbstraction：
 * @description 扩展抽象部分的接口，通常在这些对象里面，定义跟实际业务相关的方法，
 * 这些方法的实现通常会使用Abstraction中定义的方法，也可能需要调用实现部分的对象来完成
 * @author mutisitic
 * @date 2018年9月7日
 */
public class RefinedAbstraction extends Abstraction {

	/**
	 * 构造函数：注入实现部分的对象
	 * @param impl
	 */
	public RefinedAbstraction(Implementor impl) {
		super(impl);
	}
	
	/**
	 * @description 示意：实现一定的功能，可能会由具体实现部分的实现方法，也可能会转调抽象父类的功能
	 * @author mutisitic
	 * @date 2018年9月7日
	 */
	public void otherOperation() {
		PrintUtil.two("RefinedAbstraction.otherOperation()", "实现一定的功能，可能会由具体实现部分的实现方法，也可能会转调抽象父类的功能");
		operation();
	}
}
