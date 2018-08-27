package com.mutistic.behavioral.template.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 
 * @author mutisitic
 * @date 2018年8月27日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("模板模式[Template Pattern]");
		AbstractClass abs = new ConcreteClass();
		abs.templateMethod();
	}
}
