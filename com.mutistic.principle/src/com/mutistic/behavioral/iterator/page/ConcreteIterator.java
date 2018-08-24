package com.mutistic.behavioral.iterator.page;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteIterator：
 * @description 具体迭代器实现对象。翻页迭代器
 * @author mutisitic
 * @date 2018年8月24日
 */
public class ConcreteIterator implements Iterator {

	/** 持有被迭代的具体的聚合对象 */
	private ConcreteAggregate aggregate;

	/**
	 * 内部索引，记录当前迭代到的索引位置
	 */
	private int index = 0;
	/**
	 * 内部迭代数据大小
	 */
	private int size = 0;

	/**
	 * 构造函数：注入被迭代的具体的聚合对象
	 * 
	 * @param aggregate
	 *            被迭代的具体的聚合对象
	 */
	public ConcreteIterator(ConcreteAggregate aggregate) {
		super();
		this.aggregate = aggregate;
		this.size = aggregate.size();
		PrintUtil.two("构造函数：注入被迭代的具体的聚合对象", "ConcreteIterator()");
	}

	/**
	 * @description 获取下面几个元素
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @see com.mutistic.behavioral.iterator.structrue.Iterator#next()
	 */
	@Override
	public List<Object> next(int num) {
		List<Object> list = new ArrayList<Object>();
		int count = 0;
		while (hasNext() && count < num) {
			list.add(aggregate.get(index));
			index++;
			count++;
		}

		return list;
	}

	/**
	 * @description 判断是否已经移动移动聚合对象的最后一个位置
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @return
	 * @see com.mutistic.behavioral.iterator.structrue.Iterator#isDone()
	 */
	@Override
	public boolean hasNext() {
		return index != aggregate.size();
	}

	/**
	 * @description 判断是否已经移动移动聚合对象的第一个位置
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @return
	 * @see com.mutistic.behavioral.iterator.bidirectional.Iterator#isFirst()
	 */
	@Override
	public boolean hasPrevioue() {
		return index >= 0;
	}

	/**
	 * @description 获取上面几个元素
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @see com.mutistic.behavioral.iterator.bidirectional.Iterator#previous()
	 */
	@Override
	public List<Object> previous(int num) {
		List<Object> list = new ArrayList<Object>();

		int count = 0;
		int idx = index;
		// 当翻到最后一页数据时
		if(index == size) {
			num = (size % num == 0) ? num : size % num;
		}
		idx = (index < num) ? 0 : index - num;
		index = idx;
		while (hasPrevioue() && count < num) {
			list.add(aggregate.get(idx));
			idx++;
			count++;
		}

		return list;
	}

}
