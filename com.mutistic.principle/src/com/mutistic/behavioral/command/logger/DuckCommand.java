package com.mutistic.behavioral.command.logger;

import java.io.Serializable;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteCommand
 * @description 具体菜品的命令对象
 * @author mutisitic
 * @date 2018年8月23日
 */
public class DuckCommand implements Command, Serializable {
	private static final long serialVersionUID = 1L;

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
		PrintUtil.two("DuckCommand接收到命令，开始通知厨师做菜", "DuckCommand.execute()");
		cook.cook("DuckCommand", tableNum);
	}

	@Override
	public void setCook(CookApi cook) {
		this.cook = cook;
		PrintUtil.two("DuckCommand开始注入具体的厨师实例", cook);
	}

	@Override
	public int getTableNum() {
		return tableNum;
	}

	public DuckCommand(int tableNum) {
		super();
		this.tableNum = tableNum;
	}
	
}
