package com.mutistic.behavioral.strategy.recover;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 容错恢复机制
 * @author mutisitic
 * @date 2018年8月29日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("容错恢复机制");
		LogContext ctx = new LogContext();
		ctx.log("test");
	}
}
