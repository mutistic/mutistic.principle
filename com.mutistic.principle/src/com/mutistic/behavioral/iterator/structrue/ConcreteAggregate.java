package com.mutistic.behavioral.iterator.structrue;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteAggregate：
 * @description 具体聚合对象。实现创建相应的迭代器对象。
 * @author mutisitic
 * @date 2018年8月23日
 */
public class ConcreteAggregate extends Aggregate {
	
	/**
	 * 表示聚合对象具体的内容
	 */
	private String[] ss;
	/**
	 * 构造函数：传入聚合对象具体的内容
	 * @param ss 聚合对象具体的内容
	 */
	public ConcreteAggregate(String[] ss) {
		super();
		this.ss = ss;
	}

	/**
	 * @description 工厂方法，创建相应迭代器对象的具体方法
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return 创建相应迭代器对象
	 */
	@Override
	public Iterator createrIterator() {
		PrintUtil.two("工厂方法，创建相应迭代器对象的具体方法", "ConcreteAggregate.createrIterator()");
		return new ConcreteIterator(this);
	}
	
	/**
	 * @description 获取索引所对应的元素
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param index 索引
	 * @return 索引所对应的元素
	 */
	public Object get(int index) {
		if(index > ss.length) {
			return null;
		}
		
		return ss[index];
	}
	
	/**
	 * @description 获取聚合对象的大小 
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return 聚合对象的大小
	 */
	public int size() {
		return ss == null ? 0 : ss.length;
	}
}
