package com.mutistic.behavioral.command.logger;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteCommand
 * @description 宏命令：菜单命令对象
 * @author mutisitic
 * @date 2018年8月23日
 */
public class MenuCommand {
	/**
	 * 持有多个命令
	 */
	private List<Command> menuCmds = new ArrayList<Command>();
	/**
	 * @description 添加命令到 命令集合中
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param cmd
	 */
	public void addCommand(Command cmd) {
		menuCmds.add(cmd);
		PrintUtil.three("宏命令：菜单命令成功添加一个命令", cmd);
	}
	
	/**
	 * @description 要求厨师按照菜单做菜
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	public void execute() {
		PrintUtil.three("菜单命令接收到开始做菜命令，将菜单发送给队列", "MenuCommand.execute()");
		CommandQueue.addMenu(this);
	}

	public List<Command> getMenuCmds() {
		return menuCmds;
	}
}