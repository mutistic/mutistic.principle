package com.mutistic.behavioral.iterator.java;

import java.util.Iterator;

/**
 * @program Aggregate：
 * @description 聚合对象。定义创建相应迭代器对象的接口
 * @author mutisitic
 * @date 2018年8月24日
 */
public abstract class Aggregate {
	/**
	 * @description 定义：工厂方法，创建相应迭代器对象的抽象方法接口
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @return 创建相应迭代器对象
	 */
	abstract Iterator createrIterator();
}
