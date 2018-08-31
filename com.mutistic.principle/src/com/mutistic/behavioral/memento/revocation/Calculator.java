package com.mutistic.behavioral.memento.revocation;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program Invoker
 * @description 计算器类：持有加法、减法、撤销、恢复按钮：实现 可撤销命令：存储恢复式
 * @author mutisitic
 * @date 2018年8月31日
 */
public class Calculator {

	/**
	 * 命令操作对应的备忘录对象的历史记录，撤销时使用
	 */
	private List<Command> undoCmds = new ArrayList<Command>();
	/**
	 * 命令被撤销对应的备忘录对象的历史记录，恢复时使用
	 */
	private List<Command> redoCmds = new ArrayList<Command>();
	/**
	 * 命令操作对应的备忘录对象的历史记录，撤销时使用
	 */
	private List<Memento[]> undoMemento = new ArrayList<Memento[]>();
	/**
	 * 命令被撤销对应的备忘录对象的历史记录，恢复时使用
	 */
	private List<Memento[]> redoMemento = new ArrayList<Memento[]>();
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
	 * @date 2018年8月31日
	 */
	public void addPressed() {
		PrintUtil.two("计算器接收到加法运算请求", "Calculator.addPressed()");
		
		Memento m1 = addCmd.createrMemento();
		addCmd.execute();
		undoCmds.add(addCmd);
		
		Memento m2 = addCmd.createrMemento();
		undoMemento.add(new Memento[] {m1, m2});
	}

	/**
	 * @description 要求执行减法运算
	 * @author mutisitic
	 * @date 2018年8月31日
	 */
	public void subPressed() {
		PrintUtil.two("计算器接收到减法运算请求", "Calculator.addPressed()");
		
		Memento m1 = addCmd.createrMemento();
		subCmd.execute();
		undoCmds.add(subCmd);
		
		Memento m2 = addCmd.createrMemento();
		undoMemento.add(new Memento[] {m1, m2});
	}
	
	/**
	 * @description 要求执行撤销操作
	 * @author mutisitic
	 * @date 2018年8月31日
	 */
	public void undoPressed() {
		PrintUtil.two("计算器接收到撤销操作请求", "Calculator.undoPressed()");
		
		if(undoCmds.isEmpty()) {
			return;
		}
		
		// 执行一次撤销命令，则该次命令从 撤销命令集合中 移至 恢复命令集合
		Command cmd = undoCmds.get(undoCmds.size() -1);
		// 获取对应的备忘录对象
		Memento[] menmento = undoMemento.get(undoCmds.size() - 1);
		
		cmd.undo(menmento[0]);
		redoCmds.add(cmd);
		undoCmds.remove(cmd);
		
		redoMemento.add(menmento);
		undoMemento.remove(menmento);

		PrintUtil.three("执行一次撤销命令，则该次命令从 撤销命令集合中 移至 恢复命令集合", cmd);
		PrintUtil.three("执行一次撤销命令，则该次备忘录对象从  撤销备忘录集合 移至 恢复备忘录集合中", menmento);
	}
	
	/**
	 * @description 要求执行恢复操作
	 * @author mutisitic
	 * @date 2018年8月31日
	 */
	public void redoPressed() {
		PrintUtil.two("计算器接收到恢复操作请求", "Calculator.redoPressed()");
		
		if(redoCmds.isEmpty()) {
			return;
		}
		
		// 执行一次恢复命令，则该次命令从 恢复命令集合中 移至 撤销命令集合
		Command cmd = redoCmds.get(redoCmds.size() - 1);
		// 获取对应的备忘录对象
		Memento[] menmento = redoMemento.get(redoCmds.size() - 1);
				
		cmd.redo(menmento[1]);
		undoCmds.add(cmd);
		redoCmds.remove(cmd);
		
		undoMemento.add(menmento);
		redoMemento.remove(menmento);
		PrintUtil.three("执行一次恢复命令，则该次命令从 恢复命令集合中 移至 撤销命令集合", cmd);
		PrintUtil.three("执行一次恢复命令，则该次备忘录对象从 恢复备忘录集合中 移至 撤销备忘录集合", menmento);
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
