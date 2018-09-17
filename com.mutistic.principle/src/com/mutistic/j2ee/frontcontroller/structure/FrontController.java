package com.mutistic.j2ee.frontcontroller.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program FrontController：
 * @description 前端控制器、处理应用程序所有类型请求的单个处理程序，应用程序可以是基于
 * @author mutisitic
 * @date 2018年9月17日
 */
public class FrontController {
	/** 持有：调度器对象 */
	private Dispatcher dispatcher = new Dispatcher();

	/**
	 * @description 示意：可能存在的功能：用户验证
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @return
	 */
	private boolean isAuthenticUser() {
		PrintUtil.three("FrontController.isAuthenticUser()", "可能存在的功能：用户验证");
		return true;
	}

	/**
	 * @description 示意：可能存在的功能：记录请求
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param request
	 */
	private void trackRequest(String request) {
		PrintUtil.three("FrontController.trackRequest()", "可能存在的功能：记录请求：request = " + request);
	}

	/**
	 * @description 客户端请求，转调调度器
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param request
	 */
	public void dispatchRequest(String request) {
		PrintUtil.two("FrontController.dispatchRequest()", "客户端请求，转调调度器request = " + request);
		trackRequest(request);

		if (isAuthenticUser()) {
			dispatcher.dispatch(request);
		}
	}
}
