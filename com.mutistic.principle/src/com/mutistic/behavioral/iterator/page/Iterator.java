package com.mutistic.behavioral.iterator.page;

import java.util.List;

/**
 * @program Iterator：
 * @description 迭代器接口。翻页迭代器
 * @author mutisitic
 * @date 2018年8月24日
 */
public interface Iterator {
	
	/**
	 * @description 定义：获取下面几个元素
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @return
	 */
	List<Object> next(int num);
	
	/**
	 * @description 定义：判断是否已经移动移动聚合对象的最后一个位置接口
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @return true：最后一个位置，false：不是最后一个位置
	 */
	boolean hasNext();
	
	/**
	 * @description 定义：判断是否已经移动移动聚合对象的第一个位置接口
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @return
	 */
	boolean hasPrevioue();
	
	/**
	 * @description 定义：获取上面几个元素
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @return
	 */
	List<Object> previous(int num);
}
