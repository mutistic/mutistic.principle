package com.mutistic.behavioral.visitor.structure;

/**
 * @program Element：
 * @description 抽象的元素对象，对象结构的顶层接口，定义接受访问的操作。
 * @author mutisitic
 * @date 2018年9月11日
 */
public abstract class Element {

	/**
	 * @description 定义：接受访问者的访问 
	 * @author mutisitic
	 * @date 2018年9月11日
	 * @param visitor 具体的访问者对象
	 */
	public abstract void accept(Visitor visitor);
}
