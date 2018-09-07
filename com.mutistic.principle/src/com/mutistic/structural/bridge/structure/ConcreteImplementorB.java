package com.mutistic.structural.bridge.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteImplementor：
 * @description 真实实现Implementor接口的对象
 * @author mutisitic
 * @date 2018年9月7日
 */
public class ConcreteImplementorB implements Implementor {

	/**
	 * @description 实现抽象部分需要的某些功能的具体实现
	 * @author mutisitic
	 * @date 2018年9月7日
	 * @see com.mutistic.structural.bridge.structure.Implementor#operationImpl()
	 */
	@Override
	public void operationImpl() {
		PrintUtil.three("ConcreteImplementorB.operationImpl()", "实现抽象部分需要的某些功能的具体实现");
	}
}
