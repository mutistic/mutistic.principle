package com.mutistic.j2ee.frontcontroller;

import com.mutistic.utils.PrintUtil;

/**
 * @program 前端控制器模式[Front Controller Pattern]
 * @description
 * @author mutisitic
 * @date 2018年9月17日
 */
public class FrontControllerPattern {
	public static void main(String[] args) {
		PrintUtil.ln("前端控制器模式[Front Controller Pattern]");
		PrintUtil.ln("一、定义、本质:\r\n" + 
				"\r\n" + 
				"定义: 提供一个集中的请求处理机制，所有的请求都将由一个单一的处理程序处理。该处理程序可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序\r\n" + 
				"本质: 集中请求，统一分发\r\n" + 
				"\r\n" + 
				"二、结构和说明:\r\n" + 
				"\r\n" + 
				"FrontController：前端控制器、处理应用程序所有类型请求的单个处理程序，应用程序可以是基于web的应用程序，也可以是基于桌面的应用程序。\r\n" + 
				"\r\n" + 
				"Dispatcher：调度器、前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序。\r\n" + 
				"\r\n" + 
				"View：视图是为请求而创建的对象\r\n" + 
				"一、定义、本质:\r\n" + 
				"\r\n" + 
				"定义: 提供一个集中的请求处理机制，所有的请求都将由一个单一的处理程序处理。该处理程序可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序\r\n" + 
				"本质: 集中请求，统一分发\r\n" + 
				"\r\n" + 
				"二、结构和说明:\r\n" + 
				"\r\n" + 
				"FrontController：前端控制器、处理应用程序所有类型请求的单个处理程序，应用程序可以是基于web的应用程序，也可以是基于桌面的应用程序。\r\n" + 
				"\r\n" + 
				"Dispatcher：调度器、前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序。\r\n" + 
				"\r\n" + 
				"View：视图是为请求而创建的对象\r\n" + 
				"");
	}
}
