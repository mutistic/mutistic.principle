package com.mutistic.behavioral.command.intelligent;

import com.mutistic.utils.PrintUtil;

/**
 * @program Invoker：
 * @description 调用者，要求命令对象执行请求，通常会持有命令对象，可以持有很多个命令对象。这个是客户端真正触发命令并要求
命令执行相应操作的地方，也就是说相当于使用命令对象的入口
 * @author mutisitic
 * @date 2018年8月23日
 */
public class Invoker {
	/** 持有命令对象 */
	private Command command;

	/**
	 * @description 要求命令对象执行的具体操作
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	public void runCommand() {
		PrintUtil.two("要求命令对象执行的具体操作", "Invoker.runCommand()");
		command.execute();
	}

	/**
	 * @description 获取命令对象实例
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return
	 */
	public Command getCommand() {
		return command;
	}

	/**
	 * @description 注入命令对象实例
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param command 命令对象实例
	 */
	public void setCommand(Command command) {
		this.command = command;
	}
}
