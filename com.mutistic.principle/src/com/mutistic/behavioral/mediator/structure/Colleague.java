package com.mutistic.behavioral.mediator.structure;

/**
 * @program Colleague: 
 * @description 同事类的定义，通常实现为抽象类，主要负责约束同事对象的类型，并实现一些具体同事内类之间的公共功能，
	比如: 每个具体同事类都应该知道中介者对象，也及时具体同事类都会持有中介者对象，就可以定义到这个类中
 * @author mutisitic
 * @date 2018年8月16日
 */
public abstract class Colleague {

	/**
	 * 持有中介者对象，每一个同事类都应该知道它的中介者对象
	 */
	private Mediator mediator;

	/**
	 * 构造函数：传入中介者对象（也可以使用set方法）
	 * @param mediator 中介者对象实例
	 */
	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	/**
	 * @description get方法获得中介者对象 
	 * @author mutisitic
	 * @date 2018年8月16日
	 * @return
	 */
	public Mediator getMediator() {
		return mediator;
	}
	
}
