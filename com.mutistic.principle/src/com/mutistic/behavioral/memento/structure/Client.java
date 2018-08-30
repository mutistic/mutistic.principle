package com.mutistic.behavioral.memento.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端 
 * @description 演示 备忘录模式[Memento Pattern]-结构
 * @author mutisitic
 * @date 2018年8月30日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("备忘录模式[Memento Pattern]-结构");
		// 创建原发器实例，设置原发器状态
		Originator originator = new Originator();
		originator.setState("AAA");
		
		// 创建忘录管理者，保存从原发器创建出来的备忘录
		Caretaker caretaker = new Caretaker();
		caretaker.saveMemento(originator.createMemento());
		
		// 设置原发器其他状态
		originator.setState("BBB");
		
		// 原发器 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
		originator.setMemento(caretaker.retriverMemento());
		originator.getState();
	}
}
