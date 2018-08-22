package com.mutistic.behavioral.observer.java;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client 客户端：Java中的观察者模式
 * @description
 * @author mutisitic
 * @date 2018年8月22日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("Java中的观察者模式");

		// 创建报纸，作为被观察者
		NewsPaper paper = new NewsPaper();

		// 创建读者，作为观察者
		Reader r1 = new Reader();
		r1.setName("AAA");
		Reader r2 = new Reader();
		r2.setName("BBB");
		Reader r3 = new Reader();
		r3.setName("CCC");

		// 注册观察者
		paper.addObserver(r1);
		paper.addObserver(r2);
		paper.addObserver(r3);

		// 新报纸，通知观察者
		paper.setContent("1111111111111111111111");

	}
}
