package com.mutistic.behavioral.command.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Receiver：
 * @description 接收者。真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能
 * @author mutisitic
 * @date 2018年8月22日
 */
public class Receiver {

	/**
	 * @description 真正执行命令的方法
	 * @author mutisitic
	 * @date 2018年8月22日
	 */
	public void action() {
		PrintUtil.two("接收者开始真正执行命令", "Receiver.action()");
	}
}
