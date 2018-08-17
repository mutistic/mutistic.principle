package com.mutistic.behavioral.mediator.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteColleague
 * @description 具体的同事类，实现自己的业务，在需要与其他同事通讯的时候，就与自由的中介者通信，中介者会负责与其他的同事交互
 * @author mutisitic
 * @date 2018年8月16日
 */
public class ConcreteColleagueA extends Colleague {

	/**
	 * 构造函数：传入中介者对象（也可以使用set方法）
	 * @param mediator 中介者对象实例
	 */
	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 业务逻辑
	 */
	public void operation() {
		PrintUtil.printTwo("执行ConcreteColleagueA.operation()", "业务逻辑");
		this.getMediator().changed(this);
	}
	
	/**
	 * 业务逻辑
	 */
	public void operationA() {
		PrintUtil.printTwo("执行ConcreteColleagueA.operationA()", "业务逻辑");
	}
}
