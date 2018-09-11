package com.mutistic.behavioral.visitor.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteVisitor：
 * @description 具体访问者实现对象，实现要真正被添加到对象结构中的功能。
 * @author mutisitic
 * @date 2018年9月11日
 */
public class ConcreteVisitor2 implements Visitor {

	/**
	 * @description 具体的访问具体元素A：相当于给元素A添加访问者的功能 
	 * @author mutisitic
	 * @date 2018年9月11日
	 * @param elementA
	 * @see com.mutistic.behavioral.visitor.structure.Visitor#visitConceteElementA(com.mutistic.behavioral.visitor.structure.ConcreteElementA)
	 */
	@Override
	public void visitConceteElementA(ConcreteElementA elementA) {
		PrintUtil.three("ConcreteVisitor2.visitConceteElementA()", "具体的访问具体元素A：相当于给元素A添加访问者的功能 ");
		elementA.operation();
	}

	/**
	 * @description 具体的访问具体元素B：相当于给元素B添加访问者的功能 
	 * @author mutisitic
	 * @date 2018年9月11日
	 * @param elementB
	 * @see com.mutistic.behavioral.visitor.structure.Visitor#visitConceteElementB(com.mutistic.behavioral.visitor.structure.ConcreteElementB)
	 */
	@Override
	public void visitConceteElementB(ConcreteElementB elementB) {
		PrintUtil.three("ConcreteVisitor2.visitConceteElementB()", "具体的访问具体元素A：相当于给元素A添加访问者的功能 ");
		elementB.operation();
	}

}
