package com.mutistic.behavioral.command.parameter;

import com.mutistic.utils.PrintUtil;

/**
 * @program 微星主板类-命令的真正实现者Receiver
 * @description 
 * @author mutisitic
 * @date 2018年8月22日
 */
public class MsiMainBoard implements MainBoardApi {

	/**
	 * @description 开机命令的具体实现 
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @see com.mutistic.behavioral.command.parameter.MainBoardApi#open()
	 */
	@Override
	public void open() {
		PrintUtil.three("微星主板接收到开机命令，执行开机", "MsiMainBoard.open()");
	}

	/**
	 * @description 重启命令的具体实现
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @see com.mutistic.behavioral.command.parameter.MainBoardApi#reset()
	 */
	@Override
	public void reset() {
		PrintUtil.three("微星主板接收到重启命令，执行重启", "MsiMainBoard.reset()");
	}
}