package com.mutistic.behavioral.state.concrete;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 在状态的处理类里面实现状态维护和状态转换的控制
 * @author mutisitic
 * @date 2018年8月29日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("在状态的处理类里面实现状态维护和状态转换的控制");
		VoteContext ctx = new VoteContext();
		for (int i = 0; i < 10; i++) {
			ctx.vote("AAA", "1111");
		}
	}
}
