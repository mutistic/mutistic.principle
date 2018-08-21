package com.mutistic.structural.facade.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program 外观模式-核心类
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Facade {

	/**
	 * @description Facade模式定义的高层接口 （不一定要声明为static）
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public static void test() {
		PrintUtil.two("Facade-test", "Facade：定义系统的多个模块对外的高层接口，通常是需要调用内部多个模块，从而把客户的请求代理给适当的系统对象");
		
		new ModeA().testA();
		new ModeB().testB();
		new ModeC().testC();
	}
	
}
