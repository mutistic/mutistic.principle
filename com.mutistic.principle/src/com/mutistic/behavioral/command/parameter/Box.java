package com.mutistic.behavioral.command.parameter;

import com.mutistic.utils.PrintUtil;

/**
 * @program 机箱
 * @description
 * @author mutisitic
 * @date 2018年8月22日
 */
public class Box {

	/** 开机命令 */
	private Command openCommand;
	/** 重启命令 */
	private Command resetCommand;
	
	/**
	 * @description 开机按钮-执行开机命令 
	 * @author mutisitic
	 * @date 2018年8月22日
	 */
	public void openButtonPressed() {
		openCommand.execute();
	}
	/**
	 * @description 重启按钮-执行重启命令 
	 * @author mutisitic
	 * @date 2018年8月22日
	 */
	public void resetButtonPressed() {
		resetCommand.execute();
	}

	public Command getOpenCommand() {
		return openCommand;
	}

	public void setOpenCommand(Command openCommand) {
		this.openCommand = openCommand;
		PrintUtil.three("机箱注入开机命令实例", openCommand);
	}

	public Command getResetCommand() {
		return resetCommand;
	}

	public void setResetCommand(Command resetCommand) {
		this.resetCommand = resetCommand;
		PrintUtil.three("机箱注入重启命令实例", resetCommand);

	}
	
}
