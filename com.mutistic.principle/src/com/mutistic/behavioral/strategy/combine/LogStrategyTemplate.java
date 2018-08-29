package com.mutistic.behavioral.strategy.combine;

import java.util.Date;

/**
 * @program AbstractClass
 * @description 记录日志模板类：抽象模板类：策略模式结合模板模式
 * @author mutisitic
 * @date 2018年8月29日
 */
public abstract class LogStrategyTemplate implements LogStrategy {

	/**
	 * @description 具体模板算法
	 * @author mutisitic
	 * @date 2018年8月29日
	 * @param msg
	 */
	public final void templateMethod(String msg) {
		doLog(new Date() +" "+ msg);
	}
	
	/**
	 * @description 定义：记录日志接口
	 * @author mutisitic
	 * @date 2018年8月29日
	 * @param msg 日志信息
	 */
	public abstract void doLog(String msg);
}
