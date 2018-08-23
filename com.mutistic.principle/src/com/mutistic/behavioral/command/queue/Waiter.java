package com.mutistic.behavioral.command.queue;

import com.mutistic.utils.PrintUtil;

/**
 * @program Invoker
 * @description 服务员，负责组装Command和Receiver
 * @author mutisitic
 * @date 2018年8月23日
 */
public class Waiter {
	/**
	 * 持有宏命令-菜单命令
	 */
	private MenuCommand menu = new MenuCommand();

	/**
	 * @description 客户点菜
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param cmd 具体点菜命令
	 */
	public void orderDish(Command cmd) {
		PrintUtil.two(cmd.getTableNum() + "号餐桌客户点菜，将菜品命令添加到菜单宏命令中", "Waiter.orderDish()");
		menu.addCommand(cmd);
	}

	/**
	 * @description 客户点菜完毕，执行宏命令
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	public void orderOver() {
		PrintUtil.two(menu.getMenuCmds().get(0).getTableNum() + "号餐桌客户点菜完毕，要求执行宏命令", "Waiter.orderOver()");
		menu.execute();
	}
}