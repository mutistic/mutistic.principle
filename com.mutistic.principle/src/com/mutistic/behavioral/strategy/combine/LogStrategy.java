package com.mutistic.behavioral.strategy.combine;

/**
 * @program Strategy
 * @description 日志记录的策略的接口
 * @author mutisitic
 * @date 2018年8月29日
 */
public interface LogStrategy {

	/**
	 * @description 定义：记录日志接口
	 * @author mutisitic
	 * @date 2018年8月29日
	 * @param msg 日志信息
	 */
	void doLog(String msg);
}
