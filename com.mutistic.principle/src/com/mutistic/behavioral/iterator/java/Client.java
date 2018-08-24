package com.mutistic.behavioral.iterator.java;

import java.util.Iterator;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端 
 * @description 演示：Java中的Iterator（内部迭代器）
 * @author mutisitic
 * @date 2018年8月24日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("Java中的Iterator（内部迭代器）");
		
		String[] ss = {"111", "222", "333"};
		ConcreteAggregate aggregate = new ConcreteAggregate();
		aggregate.setData(ss);
		
		Iterator it =  aggregate.createrIterator();
		while(it.hasNext()) {
			PrintUtil.three("Iterator.next()", it.next());
		}
	}
}
