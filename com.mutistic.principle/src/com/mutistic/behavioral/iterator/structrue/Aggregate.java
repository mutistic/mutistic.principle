package com.mutistic.behavioral.iterator.structrue;

/**
 * @program Aggregate：
 * @description 聚合对象。定义创建相应迭代器对象的接口
 * @author mutisitic
 * @date 2018年8月23日
 */
public abstract class Aggregate {
	/**
	 * @description 定义：工厂方法，创建相应迭代器对象的抽象方法接口
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return 创建相应迭代器对象
	 */
	abstract Iterator createrIterator();
}
