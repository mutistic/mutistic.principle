package com.mutistic.behavioral.command.queue;

/**
 * @program Receiver
 * @description 厨师接口 
 * @author mutisitic
 * @date 2018年8月23日
 */
public interface CookApi {
	/**
	 * @description 定义：做菜的操作
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param name 菜名
	 * @param tableNum 餐桌号
	 */
	void cook(String name, int tableNum);
}
