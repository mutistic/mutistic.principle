package com.mutistic.design.mode02.structure;

/**
 * @program 策略模式+简单工厂模式：上下文类
 * @description 负责实现创建所有实例的内部逻辑
 * @author yc.yin
 * @date 2018年5月14日
 */
public class ContextAndFactory {

	/**
	 * 定义Strategy对象引用
	 */
	private Strategy strategy;

	/**
	 * @description 根据具体的策略对象，调用其算法或行为的方法
	 * @author yc.yin
	 * @date 2018年5月14日
	 */
	public void contextInterface() {
		if (null != strategy) {
			this.strategy.algorithmInterface();
		}
	}

	/**
	 * Context构造器
	 * 
	 * @param strategyType
	 *            初始化时，传入策略类型，调用工厂方法创建具体策略实例
	 */
	public ContextAndFactory(String strategyType) {
		super();
		createrStrategy(strategyType);
	}

	/**
	 * @description 根据传入策略类型，创建具体策略实例
	 * @author yc.yin
	 * @date 2018年5月14日
	 * @param strategyType
	 *            策略类型
	 */
	public void createrStrategy(String strategyType) {
		switch (strategyType) {
		case "A":
			this.strategy = new ConcreteStrategyA();
			break;
		case "B":
			this.strategy = new ConcreteStrategyB();
			break;
		case "C":
			this.strategy = new ConcreteStrategyC();
			break;
		default:
			break;
		}
	}

}
