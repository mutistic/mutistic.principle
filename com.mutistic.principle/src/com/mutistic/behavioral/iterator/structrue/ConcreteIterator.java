package com.mutistic.behavioral.iterator.structrue;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteIterator：
 * @description 具体迭代器实现对象。定义对聚合对象的遍历，并跟踪遍历时的当前位置（外部迭代器）（游标）
 * @author mutisitic
 * @date 2018年8月23日
 */
public class ConcreteIterator implements Iterator {

	/** 持有被迭代的具体的聚合对象 */
	private ConcreteAggregate aggregate;

	/**
	 * 内部索引，记录当前迭代到的索引位置 
	 * -1：表示刚开始时，迭代器指向聚合对象第一个对象之前
	 */
	private int index = -1;

	/**
	 * 构造函数：注入被迭代的具体的聚合对象
	 * @param aggregate 被迭代的具体的聚合对象
	 */
	public ConcreteIterator(ConcreteAggregate aggregate) {
		super();
		this.aggregate = aggregate;
		PrintUtil.two("构造函数：注入被迭代的具体的聚合对象", "ConcreteIterator()");
	}

	/**
	 * @description 移动到聚合对象的第一个位置
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @see com.mutistic.behavioral.iterator.structrue.Iterator#first()
	 */
	@Override
	public void first() {
		index = 0;
		PrintUtil.three("移动到聚合对象的第一个位置", "ConcreteIterator.first()");
	}

	/**
	 * @description 移动到聚合对象的下一个位置
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @see com.mutistic.behavioral.iterator.structrue.Iterator#next()
	 */
	@Override
	public void next() {
		if (index < aggregate.size()) {
			index++;
		}
		PrintUtil.three("移动到聚合对象的第一个位置", "ConcreteIterator.next()");
	}

	/**
	 * @description 判断是否已经移动移动聚合对象的最后一个位置
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return
	 * @see com.mutistic.behavioral.iterator.structrue.Iterator#isDone()
	 */
	@Override
	public boolean isDone() {
		PrintUtil.two("判断是否已经移动移动聚合对象的最后一个位置", "ConcreteIterator.isDone()");
		return index == aggregate.size();
	}

	/**
	 * @description 获取迭代当前元素
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return
	 * @see com.mutistic.behavioral.iterator.structrue.Iterator#currentItem()
	 */
	@Override
	public Object currentItem() {
		PrintUtil.three("（外部迭代器）获取迭代当前元素，转调聚合对象的get方法", "ConcreteIterator.currentItem()");

		if (index < 0) {
			first();
		}

		return aggregate.get(index);
	}

}
