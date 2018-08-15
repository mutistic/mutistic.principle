package com.mutistic.behavioral.strategy.structure;

/**
 * @program 策略模式+简单工厂模式：上下文类
 * @description 负责实现创建所有实例的内部逻辑
 * @author mutistic
 * @date 2018年5月14日
 */
public class ContextAndFactory {

	/**
	 * 定义Strategy对象引用
	 */
	private Strategy strategy;

	/**
	 * @description 根据具体的策略对象，调用其算法或行为的方法
	 * @author mutistic
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
	 * @author mutistic
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

	public final static String STRATEGY_A = "A";
	public final static String STRATEGY_B = "B";
	public final static String STRATEGY_C = "C";

	/**
	 * @description 运行策略模式
	 * @author mutistic
	 * @date 2018年5月15日
	 */
	public static void strategyMain() {
		System.out.println("运行Strategy+Factory策略模式");

		ContextAndFactory context = new ContextAndFactory(STRATEGY_A);
		context.contextInterface();

		ContextAndFactory context2 = new ContextAndFactory(STRATEGY_B);
		context2.contextInterface();

		ContextAndFactory context3 = new ContextAndFactory(STRATEGY_C);
		context3.contextInterface();

	}

	public static void main(String[] args) {
		strategyMain();
	}

}
