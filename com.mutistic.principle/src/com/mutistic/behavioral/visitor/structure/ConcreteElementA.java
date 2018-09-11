package com.mutistic.behavioral.visitor.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Element： 
 * @description 抽象的元素对象，对象结构的顶层接口，定义接受访问的操作。
 * @author mutisitic
 * @date 2018年9月11日
 */
public class ConcreteElementA extends Element {

	/**
	 * @description 接受访问者的具体访问，回调访问者对象的相应方法
	 * @author mutisitic
	 * @date 2018年9月11日
	 * @param visitor
	 * @see com.mutistic.behavioral.visitor.structure.Element#accept(com.mutistic.behavioral.visitor.structure.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		PrintUtil.three("ConcreteElementA.accept()", "接受访问者的具体访问，回调访问者对象的相应方法");
		visitor.visitConceteElementA(this);
	}
	
	/**
	 * @description 示意：表示元素已有的功能实现 
	 * @author mutisitic
	 * @date 2018年9月11日
	 */
	public void operation() {
		PrintUtil.three("ConcreteElementA.operation()", "示意：表示元素已有的功能实现");
	}
}
