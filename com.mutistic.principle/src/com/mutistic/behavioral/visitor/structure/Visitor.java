package com.mutistic.behavioral.visitor.structure;

/**
 * @program Visitor：
 * @description 访问者接口，为所有的访问者对象声明一个visit方法，用来代表为对象结构添加的功能，理论上可以代表任意的功能。
 * @author mutisitic
 * @date 2018年9月11日
 */
public interface Visitor {

	/**
	 * @description 定义：访问具体元素A：相当于给元素A添加访问者的功能 
	 * @author mutisitic
	 * @date 2018年9月11日
	 * @param elementA 具体元素A
	 */
	void visitConceteElementA(ConcreteElementA elementA);

	/**
	 * @description 定义：访问具体元素B：相当于给元素B添加访问者的功能 
	 * @author mutisitic
	 * @date 2018年9月11日
	 * @param elementB 具体元素B
	 */
	void visitConceteElementB(ConcreteElementB elementB);
}
