package com.mutistic.behavioral.command.revocation;

/**
 * @program Command
 * @description 命令接口：可撤销命令
 * @author mutisitic
 * @date 2018年8月23日
 */
public interface Command {
	/**
	 * @description 定义执行命令接口
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	void execute();

	/**
	 * @description 定义撤销命令接口
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	void undo();
}
