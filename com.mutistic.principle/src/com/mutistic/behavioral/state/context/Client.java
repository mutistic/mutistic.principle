package com.mutistic.behavioral.state.context;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 在上下文当中实现状态维护和状态转换的控制
 * @author mutisitic
 * @date 2018年8月29日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("在上下文当中实现状态维护和状态转换的控制");
		
		Context ctx = new Context();
		ctx.request("ConcreteStateA");
		ctx.request("ConcreteStateB");
	}
}
