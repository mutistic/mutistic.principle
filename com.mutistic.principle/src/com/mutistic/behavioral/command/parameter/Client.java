package com.mutistic.behavioral.command.parameter;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client客户端
 * @description 演示 命令模式-参数化配置
 * @author mutisitic
 * @date 2018年8月22日
 */
public class Client {
	public static void main(String[] args) {
		// 创建嘉技主板实例
		cmd(new GigaMainBoard());
		// 创建微星主板实例
		cmd(new MsiMainBoard());
	}
	private static void cmd(MainBoardApi bord) {
		PrintUtil.one("命令模式-参数化配置");
		// 创建开机命令实例
		OpenCommand open = new OpenCommand(bord);
		// 创建重启命令实例
		ResetCommand reset = new ResetCommand(bord);

		// 创建机箱
		Box box = new Box();
		box.setOpenCommand(open);
		box.setResetCommand(reset);

		// 执行命令
		PrintUtil.two("开机", "openButtonPressed");
		box.openButtonPressed();
		PrintUtil.two("重启", "resetButtonPressed");
		box.resetButtonPressed();
	}
}
