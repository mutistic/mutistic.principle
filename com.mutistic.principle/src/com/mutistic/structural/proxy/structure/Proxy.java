package com.mutistic.structural.proxy.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Proxy：代理对象，通常有一下功能
 * @description 
 * 1、实现与具体的目标对象一样的接口，可以使用代理来替代具体的目标对象
 * 2、保存一个指向具体目标对象的引用，可以在需要的时候调用具体的目标对象
 * 3、可以控制对具体目标对象的访问，并可能负责创建和删除它
 * @author mutisitic
 * @date 2018年8月17日
 */
public class Proxy implements Subject {
	/** 持有具体目标对象RealSubject */
	private RealSubject realSubject;
	/**
	 * 构造函数：传入具体目标对象RealSubject（可以通过set方法）
	 * @param realSubject 具体目标对象
	 */
	public Proxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	
	/**
	 * @description 转调真正的业务功能：realSubject.request()
	 * @author mutisitic
	 * @date 2018年8月17日
	 * @see com.mutistic.structural.proxy.structure.Subject#request()
	 */
	@Override
	public void request() {
		PrintUtil.printTwo("Proxy代理对象开始转调：", "realSubject.request()");
		realSubject.request();
		PrintUtil.printThree("Proxy代理对象转调结束：", "realSubject.request()");
	}
}
