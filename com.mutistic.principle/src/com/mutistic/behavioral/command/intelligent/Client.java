package com.mutistic.behavioral.command.intelligent;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 智能命令
 * @author mutisitic
 * @date 2018年8月23日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one(" 智能命令");
		Invoker invoker = new Invoker();
		invoker.setCommand(new ConcreteCommand());
		invoker.runCommand();
	}
}
