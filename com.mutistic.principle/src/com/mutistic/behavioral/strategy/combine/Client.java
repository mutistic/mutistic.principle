package com.mutistic.behavioral.strategy.combine;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 策略模式结合模板模式
 * @author mutisitic
 * @date 2018年8月29日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("策略模式结合模板模式");
		LogContext ctx = new LogContext();
		ctx.log("test");
	}
}
