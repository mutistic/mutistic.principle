package com.mutistic.behavioral.memento.revocation;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteCommand
 * @description 加法命令具体实现
 * @author mutisitic
 * @date 2018年8月31日
 */
public class AddCommand extends AbstractCommand {

	private int number;
	
	/**
	 * @description 执行加法命令
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @see com.mutistic.behavioral.command.revocation.Command#execute()
	 */
	@Override
	public void execute() {
		PrintUtil.three("加法命令接收到加法命令，通知运算类进行加法运算", "AddCommand.execute()");
		opeartion.add(number);
	}
	
	/**
	 * 构造函数：注入具体执行计算对象的实例
	 * @param opeartion 具体执行计算对象的实例
	 * @param number 操作数
	 */
	public AddCommand(int number) {
		super();
		this.number = number;
	}

}
