package com.mutistic.behavioral.state.database;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 数据库维护状态
 * @author mutisitic
 * @date 2018年8月29日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("数据库维护状态");
		VoteContext ctx = new VoteContext();
		for (int i = 0; i < 10; i++) {
			ctx.vote("BBB", "2222");
		}
	}
}
