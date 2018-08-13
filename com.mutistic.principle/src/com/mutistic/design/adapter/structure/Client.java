package com.mutistic.design.adapter.structure;

import com.mutistic.common.utils.PrintUtil;

/**
 * @program Client：客户端，调用自己需要的领域接口Target 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.printOne("适配器模式 Adapter Pattern：本质：");
		PrintUtil.printTwo("定义", "将一个类的接口转换客户端希望的另外一个接口。适配器模式使得原本由于接口不兼容而能一起工作的那些类可以一起工作。");
		
		Existing existing = new Existing();
		PrintUtil.printOne("Client：客户端，调用Target接口信息");
		Target target = new Adapter(existing);
		target.test();
		
		PrintUtil.printOne("Client：客户端，调用适配类接口信息");
		Adapter adapter = new Adapter(existing);
		adapter.test();
		adapter.testExisting();
	}
}
