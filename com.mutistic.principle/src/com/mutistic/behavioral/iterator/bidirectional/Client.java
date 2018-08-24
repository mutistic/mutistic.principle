package com.mutistic.behavioral.iterator.bidirectional;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端 
 * @description 演示：双向迭代器
 * @author mutisitic
 * @date 2018年8月24日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("双向迭代器");
		
		String[] ss = new String[] {"111", "222", "333"};
		// 创建聚合对象
		Aggregate aggregate = new ConcreteAggregate(ss);
		PrintUtil.two("创建聚合对象，注入聚合数据", aggregate);
		
		// 创建迭代器
		Iterator it = aggregate.createrIterator();
		PrintUtil.two("创建迭代器，注入聚合数据", it);

		if(!it.isDone()) {
			PrintUtil.three("从迭代器中获取第一个元素", it.currentItem());
			it.next();
		}
		if(!it.isDone()) {
			PrintUtil.three("从迭代器中获取第二个元素", it.currentItem());
			it.next();
		}
		if(!it.isFirst()) {
			it.previous();
			PrintUtil.three("从迭代器中向前移动一个元素后在获取", it.currentItem());
			it.next();
		}
		if(!it.isDone()) {
			PrintUtil.three("从迭代器中获取一个元素", it.currentItem());
			it.next();
		}
	}
}
