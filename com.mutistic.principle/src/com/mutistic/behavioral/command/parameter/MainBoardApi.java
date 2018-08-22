package com.mutistic.behavioral.command.parameter;

/**
 * @program 主板接口-接收者对象的接口
 * @description
 * @author mutisitic
 * @date 2018年8月22日
 */
public interface MainBoardApi {

	/**
	 * @description 声明开机方法接口
	 * @author mutisitic
	 * @date 2018年8月22日
	 */
	void open();

	/**
	 * @description 声明重启方法接口
	 * @author mutisitic
	 * @date 2018年8月22日
	 */
	void reset();
}
