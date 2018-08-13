package com.mutistic.design.simplefactory.structure;

import com.mutistic.common.utils.PrintUtil;

/**
 * @program Client客户端 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Client {
	
	public static void main(String[] args) {
		PrintUtil.printOne("简单工厂模式-Simple Facotry Pattern：本质：选择实现。");
		PrintUtil.printTwo("定义", "提供一个创建对象实例的功能，无需关心其具体的实现。被创建时间的类型可以是接口、抽象类，也可以是具体的类。");
		
		Factory.createrAPI(1);
		Factory.createrAPI(2);
	}
}
