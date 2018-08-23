package com.mutistic.behavioral.command.logger;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 执行错误日志
 * @author mutisitic
 * @date 2018年8月23日
 */
public class ClientByLog {
	public static void main(String[] args) {
		PrintUtil.one("执行错误日志");
		// 运行厨师管理
		CookManager.run();
	}
}
