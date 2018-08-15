package com.mutistic.behavioral.strategy.structure;

/**
 * @program 策略模式上下文类
 * @description 负责实现创建所有实例的内部逻辑
 * @author mutistic
 * @date 2018年5月14日
 */
public class Context {

	/**
	 * 定义Strategy对象引用
	 */
	private Strategy strategy;

	/**
	 * Context构造器:
	 * 
	 * @param strategy
	 *            初始化时，传入具体的策略对象
	 */
	public Context(Strategy strategy) {
		super();
		if (null != strategy) {
			this.strategy = strategy;
		}
	}

	/**
	 * @description 根据具体的策略对象，调用其算法或行为的方法
	 * @author mutistic
	 * @date 2018年5月14日
	 */
	public void contextInterface() {
		this.strategy.algorithmInterface();
	}

	/**
	 * @description 运行策略模式
	 * @author mutistic
	 * @date 2018年5月15日
	 */
	public static void strategyMain() {
		System.out.println("运行Strategy策略模式");

		Context context = new Context(new ConcreteStrategyA());
		context.contextInterface();

		Context context2 = new Context(new ConcreteStrategyB());
		context2.contextInterface();

		Context context3 = new Context(new ConcreteStrategyC());
		context3.contextInterface();

	}

	public static void main(String[] args) {
		strategyMain();
	}

}
