package com.mutistic.behavioral.command.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteCommand：
 * @description 命令接口的实现对象，是“虚”的实现：通常会持有接收者，并调用接收者的功能来完成命令要执行的操作
 * @author mutisitic
 * @date 2018年8月22日
 */
public class ConcreteCommand implements Command {

	/** 持有相应的接收者对象 */
	private Receiver receiver;
	/** 命令对象可有自己的状态 */
	private String state;
	
	/**
	 * @description 命令接口的具体实现
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @see com.mutistic.behavioral.command.structure.Command#execute()
	 */
	@Override
	public void execute() {
		PrintUtil.two("命令的具体对象开始转调接收者对象的对应方法", "ConcreteCommand.execute()");
		// 转调接收者对象的对应方法，接收者来真正执行功能。所以称其ConcreteCommand是虚的实现
		receiver.action();
		// 设置命令对象的状态
		state = "SUCCESS";
		PrintUtil.two("命令的具体对象转调接收者对象的对应方法结束，命令状态", state);
	}

	/**
	 * 构造函数：注入接收者对象实例
	 * @param receiver 接收者对象实例
	 */
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
		PrintUtil.two("命令的具体对象注入接收者对象实例", receiver);
	}
}
