package com.mutistic.design.mode02.structure;

/**
 * @program 策略模式上下文类
 * @description 负责实现创建所有实例的内部逻辑
 * @author yc.yin
 * @date 2018年5月14日
 */
public class Context {

	/**
	 * 定义Strategy对象引用
	 */
	private Strategy strategy;

	/**
	 * Context构造器:
	 * @param strategy 初始化时，传入具体的策略对象
	 */
	public Context(Strategy strategy) {
		super();
		if(null != strategy){
			this.strategy = strategy;
		}
	}
	
	/**
	 * @description 根据具体的策略对象，调用其算法或行为的方法
	 * @author yc.yin
	 * @date 2018年5月14日
	 */
	public void contextInterface(){
		this.strategy.algorithmInterface();
	}
	
}
