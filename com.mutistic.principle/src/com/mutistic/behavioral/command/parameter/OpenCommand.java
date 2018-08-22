package com.mutistic.behavioral.command.parameter;

import com.mutistic.utils.PrintUtil;

/**
 * @program 开机命令
 * @description 持有开机命令的真正实现，通过调用接收者的方法来实现命令
 * @author mutisitic
 * @date 2018年8月22日
 */
public class OpenCommand implements Command {
	/** 持有命令的接收者对象 - 主板 */
	private MainBoardApi mainBoardApi;
	
	/**
	 * @description 开机命令
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @see com.mutistic.behavioral.command.parameter.Command#execute()
	 */
	@Override
	public void execute() {
		PrintUtil.three("接收到开机命令，开始要求主板执行开机操作", "OpenCommand.execute()");
		mainBoardApi.open();
		PrintUtil.three("开机命令执行完毕", "成功开机");
	}

	/**
	 * 构造函数：注入主板-接收者对象
	 * @param mainBoardApi 主板-接收者对象
	 */
	public OpenCommand(MainBoardApi mainBoardApi) {
		super();
		this.mainBoardApi = mainBoardApi;
		PrintUtil.three("开机命令注入主板-接收者对象", mainBoardApi);
	}
}
