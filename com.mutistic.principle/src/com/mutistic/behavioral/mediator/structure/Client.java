package com.mutistic.behavioral.mediator.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program 客户端-演示中介者模式 
 * @description 
 * @author mutisitic
 * @date 2018年8月16日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("中介者模式：");
		
		ConcreteMediator mediator = new ConcreteMediator();
		PrintUtil.three("创建中介者实例：", mediator);
		
		ConcreteColleagueA ca = new ConcreteColleagueA(mediator);
		PrintUtil.two("创建同事A实例：", ca);
		mediator.setColleagueA(ca);
		
		ConcreteColleagueB cb = new ConcreteColleagueB(mediator);
		PrintUtil.two("创建同事B实例：", cb);
		mediator.setColleagueB(cb);
		
		ca.operation();
		cb.operationB();
	}
}
