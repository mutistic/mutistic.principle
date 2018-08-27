package com.mutistic.behavioral.strategy.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示：策略模式[Strategy Pattern]结构图
 * @author mutisitic
 * @date 2018年8月27日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("策略模式[Strategy Pattern]");
		
		PrintUtil.two("通过context转调具体策略算法", "ConcreteStrategyA");
		Context context = new Context(new ConcreteStrategyA());
		context.contextInterface();

		PrintUtil.two("通过context转调具体策略算法", "ConcreteStrategyB");
		Context context2 = new Context(new ConcreteStrategyB());
		context2.contextInterface();

		PrintUtil.two("通过context转调具体策略算法", "ConcreteStrategyC");
		Context context3 = new Context(new ConcreteStrategyC());
		context3.contextInterface();
	}
}
