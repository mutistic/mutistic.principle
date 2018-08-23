package com.mutistic.behavioral.command.revocation;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteCommand
 * @description 减法命令具体实现
 * @author mutisitic
 * @date 2018年8月23日
 */
public class SubstractCommand implements Command {

	/**
	 * 持有具体执行计算的对象
	 */
	private OpeartionApi opeartion;
	private int number;
	
	/**
	 * @description 执行减法命令
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @see com.mutistic.behavioral.command.revocation.Command#execute()
	 */
	@Override
	public void execute() {
		PrintUtil.three("减法命令接收到减法命令，通知运算类进行减法运算", "SubstractCommand.execute()");
		this.opeartion.substract(number);
	}
	
	/**
	 * @description 执行撤销命令
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @see com.mutistic.behavioral.command.revocation.Command#undo()
	 */
	@Override
	public void undo() {
		PrintUtil.three("减法命令接收到减法命令，通知运算类进行加法运算", "SubstractCommand.undo()");
		this.opeartion.add(number);
	}


	/**
	 * 构造函数：注入具体执行计算对象的实例
	 * @param opeartion 具体执行计算对象的实例
	 * @param numberA 操作数
	 */
	public SubstractCommand(OpeartionApi opeartion, int number) {
		super();
		this.opeartion = opeartion;
		this.number = number;
	}

}
