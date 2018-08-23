package com.mutistic.behavioral.iterator.structrue;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端 
 * @description 演示：迭代器者模式[Iterator Pattern]
 * @author mutisitic
 * @date 2018年8月23日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("迭代器者模式[Iterator Pattern]（外部迭代器）");
		
		String[] ss = new String[] {"111", "222", "333"};
		// 创建聚合对象
		Aggregate aggregate = new ConcreteAggregate(ss);
		PrintUtil.two("创建聚合对象，注入聚合数据", aggregate);
		
		// 创建迭代器
		Iterator it = aggregate.createrIterator();
		PrintUtil.two("创建迭代器，注入聚合数据", it);

		// 从迭代器获取元素
		while(!it.isDone()) {
			PrintUtil.three("从迭代器中获取元素", it.currentItem());
			it.next();
		}
		
	}
}
