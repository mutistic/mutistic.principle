package com.mutistic.behavioral.state.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 状态模式[State Pattern]
 * @author mutisitic
 * @date 2018年8月29日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("状态模式[State Pattern]");
		
		Context ctx = new Context();
		ctx.setState(new ConcreteStateA());
		ctx.request("ConcreteStateA");
		
		ctx.setState(new ConcreteStateB());
		ctx.request("ConcreteStateB");
	}
}
