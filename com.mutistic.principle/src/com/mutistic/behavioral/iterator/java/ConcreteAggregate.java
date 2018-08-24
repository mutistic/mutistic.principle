package com.mutistic.behavioral.iterator.java;

import java.util.Iterator;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteAggregate：
 * @description 具体聚合对象。实现创建相应的迭代器对象。
 * @author mutisitic
 * @date 2018年8月24日
 */
public class ConcreteAggregate extends Aggregate {
	
	/**
	 * 表示聚合对象具体的内容
	 */
	private String[] ss;

	/**
	 * @description 工厂方法，创建相应迭代器对象的具体方法
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @return 创建相应迭代器对象
	 */
	@Override
	public Iterator createrIterator() {
		PrintUtil.two("工厂方法，创建相应迭代器对象的具体方法", "ConcreteAggregate.createrIterator()");
		return new ConcreteIterator(this);
	}

	public String[] getData() {
		return ss;
	}

	public void setData(String[] data) {
		this.ss = data;
	}
	
}
