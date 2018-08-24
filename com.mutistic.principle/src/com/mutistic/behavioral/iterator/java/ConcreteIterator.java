package com.mutistic.behavioral.iterator.java;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteIterator：
 * @description 具体迭代器实现对象。实现Java中的Iterator（内部迭代器）
 * @author mutisitic
 * @date 2018年8月24日
 */
public class ConcreteIterator implements Iterator<Object> {
	/** 持有被迭代的具体的聚合对象 */
	private ConcreteAggregate aggregate;
	/**
	 * 内部索引，记录当前迭代到的索引位置
	 * -1：表示刚开始时，迭代器指向聚合对象第一个对象之前
	 */
	private int index = -1;
	/**
	 * 数据大小，记录被迭代聚合对象的数据大小
	 * -1：表示没有
	 */
	private int size = -1;
	/**
	 * 构造函数：注入被迭代的具体的聚合对象
	 * @param aggregate 被迭代的具体的聚合对象
	 */
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
		if (null != aggregate.getData()) {
			this.size = aggregate.getData().length;
		}
	}

	/**
	 * @description 判断是否已经移动移动聚合对象的最后一个位置
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @return
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		PrintUtil.two("判断是否已经移动移动聚合对象的最后一个位置", "ConcreteItreator.hasNext()");
		return index + 1 != size;
	}

	/**
	 * @description 获取迭代当前元素
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @return
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Object next() {
		if (index > size) {
			throw new ConcurrentModificationException();
		}
		index++;
		return aggregate.getData()[index];
	}

}
