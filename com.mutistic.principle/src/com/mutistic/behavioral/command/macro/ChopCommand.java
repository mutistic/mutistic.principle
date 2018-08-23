package com.mutistic.behavioral.command.macro;

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
	 * @description 要求厨师开始做菜
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @see com.mutistic.behavioral.command.macro.Command#execute()
	 */
	@Override
	public void execute() {
		PrintUtil.three("ChopCommand接收到命令，开始通知厨师做菜", "ChopCommand.execute()");
		cook.cook("AAA");
	}

	public CookApi getCook() {
		return cook;
	}

	public void setCook(CookApi cook) {
		this.cook = cook;
		PrintUtil.three("ChopCommand开始注入具体的厨师实例", cook);
	}
}
