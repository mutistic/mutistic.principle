package com.mutistic.structural.facade.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client客户端 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Client {
	
	public static void main(String[] args) {
		PrintUtil.printOne("外观模式：Facade Pattern：本质：封装交互、简化调用");
		PrintUtil.printTwo("定义", "为系统中的一组接口提供一个一致的界面。Facade模式定义高层接口，这个接口使得客户端容易使用这一系统");
		
		PrintUtil.printOne("Client：客户端调用信息");
		Facade.test();
	}
}
