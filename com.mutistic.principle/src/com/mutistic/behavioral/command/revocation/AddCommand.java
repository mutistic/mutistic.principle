package com.mutistic.behavioral.command.revocation;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteCommand
 * @description 加法命令具体实现
 * @author mutisitic
 * @date 2018年8月23日
 */
public class AddCommand implements Command {

	/**
	 * 持有具体执行计算的对象
	 */
	private OpeartionApi opeartion;
	private int number;
	
	/**
	 * @description 执行加法命令
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @see com.mutistic.behavioral.command.revocation.Command#execute()
	 */
	@Override
	public void execute() {
		PrintUtil.three("加法命令接收到加法命令，通知运算类进行加法运算", "AddCommand.execute()");
		opeartion.add(number);
	}
	
	/**
	 * @description 执行撤销命令
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @see com.mutistic.behavioral.command.revocation.Command#undo()
	 */
	@Override
	public void undo() {
		PrintUtil.three("加法命令接收到撤销命令，通知运算类进行减法运算", "AddCommand.undo()");
		opeartion.substract(number);
	}


	/**
	 * 构造函数：注入具体执行计算对象的实例
	 * @param opeartion 具体执行计算对象的实例
	 * @param numberA 操作数
	 */
	public AddCommand(OpeartionApi opeartion, int number) {
		super();
		this.opeartion = opeartion;
		this.number = number;
	}

}
