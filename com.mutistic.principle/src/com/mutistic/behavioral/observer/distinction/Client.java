package com.mutistic.behavioral.observer.distinction;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client 客户端
 * @description 
 * @author mutisitic
 * @date 2018年8月22日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("区别对待观察者");
		
		// 创建水质具体目标
		WaterQuality subject = new WaterQuality();
		// 创建观察者
		Watcher w1 = new Watcher();
		w1.setPosition("监测人员");
		Watcher w2 = new Watcher();
		w2.setPosition("预警人员");
		Watcher w3 = new Watcher();
		w3.setPosition("监测部门领导");
		// 注册观察者
		subject.attach(w1);
		subject.attach(w2);
		subject.attach(w3);
		
		// 水质报告，通知观察者
		PrintUtil.two("水质级别为正常", 0);
		subject.setLevel(0);
		PrintUtil.two("水质级别为轻度污染", 1);
		subject.setLevel(1);
		PrintUtil.two("水质级别为中度污染", 2);
		subject.setLevel(2);
	}
}
