package com.mutistic.behavioral.command.queue;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteCommand
 * @description 具体菜品的命令对象
 * @author mutisitic
 * @date 2018年8月23日
 */
public class ChopCommand implements Command {

	/**
	 * 持有厨师实例
	 */
	private CookApi cook;
	/**
	 * 餐桌号
	 */
	private int tableNum;
	
	/**
	 * @description 要求厨师开始做菜
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @see com.mutistic.behavioral.command.macro.Command#execute()
	 */
	@Override
	public void execute() {
		PrintUtil.two("ChopCommand接收到命令，开始通知厨师做菜", "ChopCommand.execute()");
		cook.cook("ChopCommand", tableNum);
	}

	@Override
	public void setCook(CookApi cook) {
		this.cook = cook;
		PrintUtil.two("ChopCommand开始注入具体的厨师实例", cook);
	}

	@Override
	public int getTableNum() {
		return tableNum;
	}

	public ChopCommand(int tableNum) {
		super();
		this.tableNum = tableNum;
	}
}
