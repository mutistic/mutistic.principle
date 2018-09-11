package com.mutistic.behavioral.visitor.structure;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program ObjectStructure：
 * @description 对象结构，通常包含多个被访问的对象，它可以遍历这多个被访问的对象，也可以让访问者访问它的元素。可以是一个复合或是一个集合，如一个列表或无序集合。
 * @author mutisitic
 * @date 2018年9月11日
 */
public class ObjectStructure {

	/**
	 * 示意：表示对象结构，可以是一个组合结果或是集合
	 */
	private List<Element> eleList = new ArrayList<Element>();
	
	/**
	 * @description 示意：向组合对象结构添加元素（不同的对象结构有不同的构建方法）
	 * @author mutisitic
	 * @date 2018年9月11日
	 * @param element 被添加的元素
	 */
	public void addElement(Element element) {
		if(null != element) {
			eleList.add(element);
			PrintUtil.two("addElement.addElement()：向组合对象结构添加元素（不同的对象结构有不同的构建方法）", element);
		}
	}
	
	/**
	 * @description 示意：提供给客户端操作的高层接口（元素接受具体的访问者实例）
	 * @author mutisitic
	 * @date 2018年9月11日
	 * @param visitor
	 */
	public void handleRequest(Visitor visitor) {
		PrintUtil.two("ObjectStructure.handleRequest()：提供给客户端操作的高层接口", visitor);
		for (Element element : eleList) {
			PrintUtil.two("ObjectStructure.handleRequest()：元素接受具体的访问者实例", element);
			element.accept(visitor);
		}
	}
	
}
