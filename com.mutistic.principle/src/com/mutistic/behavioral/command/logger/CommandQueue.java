package com.mutistic.behavioral.command.logger;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program 队列请求类
 * @description 
 * @author mutisitic
 * @date 2018年8月23日
 */
@SuppressWarnings("unchecked")
public class CommandQueue {
	/**
	 * 队列日志文件名称
	 * 默认：com.mutistic.principle项目根目录下
	 */
	private static String QUEUE_FILE = "src/com/mutistic/behavioral/command/logger/CmdQueue.log";
	/**
	 * 用来存储菜品命令对象的队列集合
	 * 队列集合可以使用：java.util.Queue
	 */
	private static List<Command> queueCmds;
	/**
	 * 测试：定义异常
	 */
	public static boolean isException = false;
	
	/**
	 * 静态代码块：用来初始化 菜品命令对象的队列集合
	 */
	static {
		queueCmds = LogFileUtil.readFile(QUEUE_FILE);
		if(null == queueCmds) {
			queueCmds = new ArrayList<Command>();
		}
	}
	/**
	 * @description 服务员传递的菜单，将菜单的命令添加至队列中
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param menu
	 */
	public synchronized static void addMenu(MenuCommand menu) {
		// 向队列中添加菜品命令
		for (Command cmd : menu.getMenuCmds()) {
			queueCmds.add(cmd);
			PrintUtil.three("已成功向队列请求中添加一个做菜命令", cmd);
		}
		
		// 向日志文件中添加队列日志
		LogFileUtil.writeile(QUEUE_FILE, queueCmds);
	}
	
	/**
	 * @description 从队列中获取一个命令
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return
	 * @throws Exception 
	 */
	public synchronized static Command getOneCommand() throws Exception {
		Command cmd = null;
		if(queueCmds.isEmpty()) {
			return cmd;
		}
		
		// 从队列中获取一条命令
		cmd = queueCmds.get(0);
		
		if(isException) {
			throw new Exception("自定义中止异常，测试日志文件记录队列信息");
		}
		
		// 然后从队列中删除该命令
		queueCmds.remove(cmd);
		
		// 向日志文件中重新添加
		LogFileUtil.writeile(QUEUE_FILE, queueCmds);
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
