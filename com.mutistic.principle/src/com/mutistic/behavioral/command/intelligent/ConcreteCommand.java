package com.mutistic.behavioral.command.intelligent;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteCommand：
 * @description 智能命令
 * @author mutisitic
 * @date 2018年8月23日
 */
public class ConcreteCommand implements Command {

	/**
	 * @description 命令接口的具体实现
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @see com.mutistic.behavioral.command.intelligent.Command#execute()
	 */
	@Override
	public void execute() {
		PrintUtil.two("智能命令直接执行具体的业务，不需要Receiver", "ConcreteCommand.execute()");
	}

}
