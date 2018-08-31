package com.mutistic.behavioral.command.revocation;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program Invoker
 * @description 计算器类：持有加法、减法、撤销、恢复按钮：可撤销命令：补偿式，又称为反操作式
 * @author mutisitic
 * @date 2018年8月23日
 */
public class Calculator {

	/**
	 * 命令的操作的历史记录，撤销时使用
	 */
	private List<Command> undoCmds = new ArrayList<Command>();
	/**
	 * 命令被撤销的历史记录，恢复时使用
	 */
	private List<Command> redoCmds = new ArrayList<Command>();
	/**
	 * 持有加法命令
	 */
	private Command addCmd;
	/**
	 * 持有减法命令
	 */
	private Command subCmd;

	/**
	 * @description 要求执行加法运算
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	public void addPressed() {
		PrintUtil.two("计算器接收到加法运算请求", "Calculator.addPressed()");
		
		addCmd.execute();
		undoCmds.add(addCmd);
	}

	/**
	 * @description 要求执行减法运算
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	public void subPressed() {
		PrintUtil.two("计算器接收到减法运算请求", "Calculator.addPressed()");
		
		subCmd.execute();
		undoCmds.add(subCmd);
	}
	
	/**
	 * @description 要求执行撤销操作
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	public void undoPressed() {
		PrintUtil.two("计算器接收到撤销操作请求", "Calculator.undoPressed()");
		
		if(undoCmds.isEmpty()) {
			return;
		}
		
		// 执行一次撤销命令，则该次命令从 撤销命令集合中 移至 恢复命令集合
		Command cmd = undoCmds.get(undoCmds.size() -1);
		cmd.undo();
		redoCmds.add(cmd);
		undoCmds.remove(cmd);
		PrintUtil.three("执行一次撤销命令，则该次命令从 撤销命令集合中 移至 恢复命令集合", cmd);
	}
	
	/**
	 * @description 要求执行恢复操作
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	public void redoPressed() {
		PrintUtil.two("计算器接收到恢复操作请求", "Calculator.redoPressed()");
		
		if(redoCmds.isEmpty()) {
			return;
		}
		
		// 执行一次恢复命令，则该次命令从 恢复命令集合中 移至 撤销命令集合
		Command cmd = redoCmds.get(redoCmds.size() - 1);
		cmd.execute();
		undoCmds.add(cmd);
		redoCmds.remove(cmd);
		PrintUtil.three("执行一次恢复命令，则该次命令从 恢复命令集合中 移至 撤销命令集合", cmd);
	}
	
	public Command getAddCmd() {
		return addCmd;
	}

	public void setAddCmd(Command addCmd) {
		this.addCmd = addCmd;
	}

	public Command getSubCmd() {
		return subCmd;
	}

	public void setSubCmd(Command subCmd) {
		this.subCmd = subCmd;
	}
}
