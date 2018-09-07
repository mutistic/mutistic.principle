package com.mutistic.structural.bridge.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Abstraction：
 * @description 抽象部分的接口。通常在这个对象里面，要维护一个实现部分的对象引用，在抽象对象里面的方法，
 * 需要调用实现部分的对象来完成。这个对象里面的方法，通常都是具体的业务相关的方法
 * @author mutisitic
 * @date 2018年9月7日
 */
public abstract class Abstraction {
	/** 持有：一个实现部分的对象 */
	protected Implementor impl;
	/**
	 * 构造函数：注入实现部分的对象
	 * @param impl 实现部分的对象
	 */
	public Abstraction(Implementor impl) {
		super();
		this.impl = impl;
		PrintUtil.two("Abstraction 构造函数：注入实现部分的对象", impl);
	}
	
	/**
	 * @description 实现一定的功能，可能需要转调实现部分的具体实现方法
	 * @author mutisitic
	 * @date 2018年9月7日
	 */
	public void operation() {
		PrintUtil.three("Abstraction.operation()", "实现一定的功能，可能需要转调实现部分的具体实现方法，开始转调");
		impl.operationImpl();
	}
}
