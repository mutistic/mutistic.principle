package com.mutistic.behavioral.command.revocation;

/**
 * @program 定义Invoker操作运算接口
 * @description 
 * @author mutisitic
 * @date 2018年8月23日
 */
public interface OpeartionApi {

	/**
	 * @description 定义：获取计算结果
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return
	 */
	int getResult();
	
	/**
	 * @description 定义：加法运算
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param number
	 */
	void add(int number);
	
	/**
	 * @description 定义减法运算
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param number
	 */
	void substract(int number);
}
