package com.mutistic.behavioral.memento.revocation;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteCommand
 * @description 减法命令具体实现
 * @author mutisitic
 * @date 2018年8月31日
 */
public class SubstractCommand extends AbstractCommand {

	private int number;
	
	/**
	 * @description 执行减法命令
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @see com.mutistic.behavioral.command.revocation.Command#execute()
	 */
	@Override
	public void execute() {
		PrintUtil.three("减法命令接收到减法命令，通知运算类进行减法运算", "SubstractCommand.execute()");
		this.opeartion.substract(number);
	}

	/**
	 * 构造函数：注入具体执行计算对象的实例
	 * @param opeartion 具体执行计算对象的实例
	 * @param numberA 操作数
	 */
	public SubstractCommand(int number) {
		super();
		this.number = number;
	}

}
