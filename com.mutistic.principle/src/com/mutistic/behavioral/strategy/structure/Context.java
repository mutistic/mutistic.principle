package com.mutistic.behavioral.strategy.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Context：
 * @description 上下文。负责和具体的策略类交互，通常上下文会持有一个真正的策略实现，上下文可以让具体的策略类来获取上下文数据，
甚至让具体的策略类来回调上下文的方法
 * @author mutistic
 * @date 2018年8月27日
 */
public class Context {

	/**
	 * 持有一个具体的策略对象
	 */
	private Strategy strategy;

	/**
	 * 构造函数：传入具体的策略对象
	 * @param strategy 具体的策略对象
	 */
	public Context(Strategy strategy) {
		super();
		if (null != strategy) {
			this.strategy = strategy;
		}
	}

	/**
	 * @description 上下文对客户端提供的操作接口，转调策略算法接口
	 * @author mutistic
	 * @date 2018年8月27日
	 */
	public void contextInterface() {
		PrintUtil.three("Context.contextInterface()", "上下文对客户端提供的操作接口，转调策略算法接口");
		this.strategy.algorithmInterface();
	}
}
