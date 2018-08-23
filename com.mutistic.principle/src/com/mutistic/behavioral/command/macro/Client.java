package com.mutistic.behavioral.command.macro;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 宏命令
 * @author mutisitic
 * @date 2018年8月23日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("宏命令");
		
		// 创建服务员实例 Invoker
		Waiter waiter = new Waiter();
		
		// 创建菜品实例 Command
		Command chop = new ChopCommand();
		Command duck = new DuckCommand();
		Command pork = new PorkCommand();
		
		// 点菜
		waiter.orderDish(chop);
		waiter.orderDish(duck);
		waiter.orderDish(pork);
		
		// 点菜完毕
		waiter.orderOver();
	}
}
