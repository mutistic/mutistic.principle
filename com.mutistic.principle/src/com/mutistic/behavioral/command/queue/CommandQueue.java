package com.mutistic.behavioral.command.queue;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program 队列请求类
 * @description 
 * @author mutisitic
 * @date 2018年8月23日
 */
public class CommandQueue {
	/**
	 * 用来存储菜品命令对象的队列集合
	 * 队列集合可以使用：java.util.Queue
	 */
	private static List<Command> queueCmds = new ArrayList<Command>();
	
	/**
	 * @description 服务员传递的菜单，将菜单的命令添加至队列中
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param menu
	 */
	public synchronized static void addMenu(MenuCommand menu) {
		for (Command cmd : menu.getMenuCmds()) {
			queueCmds.add(cmd);
			PrintUtil.three("已成功向队列请求中添加一个做菜命令", cmd);
		}
	}
	
	/**
	 * @description 从队列中获取一个命令
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return
	 */
	public synchronized static Command getOneCommand() {
		Command cmd = null;
		if(queueCmds.isEmpty()) {
			return cmd;
		}
		
		// 从队列中获取一条命令
		cmd = queueCmds.get(0);
		// 然后从队列中删除该命令
		queueCmds.remove(cmd);
		return cmd;
	}
	
	/**
	 * @description 获取菜品命令集合size
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return
	 */
	public synchronized static int size() {
		return queueCmds.size();
	}
}
