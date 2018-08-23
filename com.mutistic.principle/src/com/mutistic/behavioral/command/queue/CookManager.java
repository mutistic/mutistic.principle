package com.mutistic.behavioral.command.queue;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program 厨师管理类，让厨师开始真正做菜
 * @description 
 * @author mutisitic
 * @date 2018年8月23日
 */
public class CookManager {
	
	/**
	 * 创建热菜厨师集合
	 */
	private static List<HotCook> hotCook = new ArrayList<HotCook>();
	/**
	 * 创建线程集合
	 */
	private static List<Thread> threadList = new ArrayList<Thread>();
	
	/**
	 * @description 运行厨师管理，创建厨师对象并启动对应的线程
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	public static void run() {
		PrintUtil.two("运行厨师管理，创建厨师对象并启动对应的线程", "CookManager.runHotCook()");
		// 创建厨师
		if(hotCook.isEmpty()) {
			hotCook.add(new HotCook("111"));
			hotCook.add(new HotCook("222"));
			hotCook.add(new HotCook("333"));
			PrintUtil.three("创建三位热菜师傅", "111，222，333");
		}
		
		// 启动厨师的线程 run方法
		if(threadList.isEmpty()) {
			Thread t1 = new Thread(hotCook.get(0));
			threadList.add(t1);
			PrintUtil.three("启动热菜师傅111的线程", "Thread.start()");
			
			Thread t2 = new Thread(hotCook.get(1));
			threadList.add(t2);
			PrintUtil.three("启动热菜师傅222的线程", "Thread.start()");
	
			Thread t3 = new Thread(hotCook.get(2));
			threadList.add(t3);
			PrintUtil.three("启动热菜师傅333的线程", "Thread.start()");
			
			t1.start();
			t2.start();
			t3.start();
		}
	}
	
	/**
	 * @description 停止厨师管理
	 * @author mutisitic
	 * @date 2018年8月23日
	 */
	@SuppressWarnings("deprecation")
	public static void stop() {
		for (Thread t : threadList) {
			t.stop();
		}
	}
	
}
