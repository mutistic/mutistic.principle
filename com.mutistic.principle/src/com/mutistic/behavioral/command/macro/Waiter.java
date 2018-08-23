package com.mutistic.behavioral.command.macro;

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
		PrintUtil.two("客户点菜，将菜品命令添加到菜单宏命令中", "Waiter.orderDish()");
		// 创建厨师实例 Receiver
		CookApi hot = new HotCook();
		CookApi cool = new CoolCook();

		// 菜品命令注入具体的厨师实例 Command
		if (cmd instanceof DuckCommand) {
			((DuckCommand) cmd).setCook(hot);
		} 
		else if (cmd instanceof PorkCommand) {
			((PorkCommand) cmd).setCook(hot);
		} 
		else if (cmd instanceof ChopCommand) {
			((ChopCommand) cmd).setCook(cool);
		}
		
		// 添加到菜单宏命令中
		menu.addCommand(cmd);
	}

	/**
	 * @description 客户点菜完毕，执行宏命令
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	public void orderOver() {
		PrintUtil.two("客户点菜完毕，要求执行宏命令", "Waiter.orderOver()");
		menu.execute();
	}
}
