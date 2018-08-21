package com.mutistic.behavioral.observer.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client 客户端
 * @description 
 * @author mutisitic
 * @date 2018年8月21日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("观察者模式[Observer Pattern]");
		// 创建观察者实例
		ConcreteObserver ob1 = new ConcreteObserver();
		ConcreteObserver ob2 = new ConcreteObserver();
		// 注册观察者
		ConcreteSubject sb1 = new ConcreteSubject();
		sb1.attach(ob1);
		sb1.attach(ob2);
		// 具体的目标改变状态
		sb1.setSubjectStatus("AAA");
		// 删除观察者
		sb1.detach(ob2);
		// 具体的目标改变状态
		sb1.setSubjectStatus("BBB");
	}
}
