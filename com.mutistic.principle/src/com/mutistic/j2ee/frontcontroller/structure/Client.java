package com.mutistic.j2ee.frontcontroller.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 前端控制器模式[Front Controller Pattern]-结构
 * @author mutisitic
 * @date 2018年9月17日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("前端控制器模式[Front Controller Pattern]");
		
		// 创建前端控制器对象
		FrontController controller = new FrontController();
		// 客户端请求，转调调度器
		controller.dispatchRequest("A");
		controller.dispatchRequest("B");
		controller.dispatchRequest("C");
	}
}
