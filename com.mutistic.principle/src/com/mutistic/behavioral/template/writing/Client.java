package com.mutistic.behavioral.template.writing;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 模板里面包含如下操作类型
 * @author mutisitic
 * @date 2018年8月27日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("通常在模板里面包含如下操作类型：");
		AbstractClass abs = new ConcreteClass();
		abs.templateMethod();
	}
}
