package com.mutistic.behavioral.command.macro;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteCommand
 * @description 宏命令：菜单命令对象
 * @author mutisitic
 * @date 2018年8月23日
 */
public class MenuCommand implements Command {

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
	 * @see com.mutistic.behavioral.command.macro.Command#execute()
	 */
	@Override
	public void execute() {
		for (Command cmd : menuCmds) {
			PrintUtil.two("菜单命令接收到开始做菜命令，正在发送命令给菜品命令", cmd);
			cmd.execute();
		}
	}
}
