package com.mutistic.behavioral.memento.storage;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端 
 * @description 演示 离线存储  和 结合原型模式
 * @author mutisitic
 * @date 2018年8月31日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("离线存储  和 结合原型模式：");
		
		// 创建流程：Originator
		FlowMock flow = new FlowMock("AAA");
		flow.first();
		
		// 创建流程备忘录管理者：CareTaker
		CareTaker taker = new CareTaker();
		taker.saveMemento(flow.createrMemento());
		
		// 运行流程模式一
		flow.schemaOne();
		
		// 恢复状态
		flow.setMemento(taker.retriverMemento());
		flow.schemaTwo();
	}
}
