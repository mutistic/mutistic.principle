package com.mutistic.behavioral.iterator.structrue;

/**
 * @program Iterator：
 * @description 迭代器接口。定义访问和遍历元素的接口
 * @author mutisitic
 * @date 2018年8月23日
 */
public interface Iterator {

	/**
	 * @description 定义：移动到聚合对象的第一个位置接口
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	void first();
	
	/**
	 * @description 定义：移动到聚合对象的下一个位置接口
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	void next();
	
	/**
	 * @description 定义：判断是否已经移动移动聚合对象的最后一个位置接口
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return true：最后一个位置，false：不是最后一个位置
	 */
	boolean isDone();
	
	/**
	 * @description 定义：获取迭代当前元素接口
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return 迭代的当前元素
	 */
	Object currentItem();
}
