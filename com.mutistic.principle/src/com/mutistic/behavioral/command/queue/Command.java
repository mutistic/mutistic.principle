package com.mutistic.behavioral.command.queue;

/**
 * @program Command
 * @description 定义命令接口
 * @author mutisitic
 * @date 2018年8月23日
 */
public interface Command {
	/**
	 * @description 定义 执行命令接口
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	void execute();
	
	/**
	 * @description 定义 注入接收者实例接口
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param cook
	 */
	void setCook(CookApi cook);
	
	/**
	 * @description 定义 获取餐桌号接口 
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return
	 */
	int getTableNum();
}
