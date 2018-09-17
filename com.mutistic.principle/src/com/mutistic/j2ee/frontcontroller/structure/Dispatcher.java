package com.mutistic.j2ee.frontcontroller.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Dispatcher：
 * @description 调度器、前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序。
 * @author mutisitic
 * @date 2018年9月17日
 */
public class Dispatcher {
	/** 持有：视图对象 */
	private ViewA viewA = new ViewA();
	/** 持有：视图对象 */
	private ViewB viewB = new ViewB();

	/**
	 * @description 统一分发到具体的处理程序
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param request 请求
	 */
	public void dispatch(String request) {
		PrintUtil.three("Dispatcher.dispatch()", "统一分发到具体的处理程序"+ request);
		if ("A".equals(request)) {
			viewA.show();
		} 
		else if ("B".equals(request)) {
			viewB.show();
		} else {
			PrintUtil.three("Dispatcher.dispatch()", "没有匹配到对应的处理程序，程序结束");
		}
	}
}
