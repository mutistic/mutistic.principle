package com.mutistic.behavioral.iterator.page;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端 
 * @description 演示：翻页迭代器
 * @author mutisitic
 * @date 2018年8月24日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("翻页迭代器");
		
		String[] ss = new String[] {"111", "222", "333", "444", "555", "666", "777", "888", "999", "000"};
		// 创建聚合对象
		Aggregate aggregate = new ConcreteAggregate(ss);
		PrintUtil.two("创建聚合对象，注入聚合数据", aggregate);
		
		// 创建迭代器
		Iterator it = aggregate.createrIterator();
		PrintUtil.two("创建迭代器，注入聚合数据", it);
		
		int pageSize = 3;
		PrintUtil.three("获取第一页" + pageSize + "条数据", it.next(pageSize));
		PrintUtil.three("获取第二页" + pageSize + "条数据", it.next(pageSize));
		PrintUtil.three("获取第三页" + pageSize + "条数据", it.next(pageSize));
		PrintUtil.three("获取第四页" + pageSize + "条数据", it.next(pageSize));
		PrintUtil.three("获取上一页" + pageSize + "条数据", it.previous(pageSize));
		PrintUtil.three("获取上一页" + pageSize + "条数据", it.previous(pageSize));
		PrintUtil.three("获取上一页" + pageSize + "条数据", it.previous(pageSize));
		PrintUtil.three("获取上一页" + pageSize + "条数据", it.previous(pageSize));
	}
}
