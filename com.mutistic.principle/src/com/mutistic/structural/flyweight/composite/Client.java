package com.mutistic.structural.flyweight.composite;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 复合享元：非共享享元对象，组合多个享元对象
 * @author mutisitic
 * @date 2018年9月3日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("复合享元：非共享享元对象，组合多个享元对象");
		
		SecurityManager mgr = SecurityManager.getInstance();
		mgr.login("张三");
		mgr.login("李四");
		mgr.login("张三1");
		mgr.login("张三2");
		mgr.login("张三3");
		
		PrintUtil.println();
		PrintUtil.three("张三查看薪资数据是否有权限：", mgr.hasPermit("张三", "薪资数据", "查看"));
		PrintUtil.println();
		PrintUtil.three("张三查看人员列表是否有权限：", mgr.hasPermit("张三", "人员列表", "查看"));
		PrintUtil.println();
		PrintUtil.three("李四查看薪资数据是否有权限：", mgr.hasPermit("李四", "薪资数据", "查看"));
		PrintUtil.println();
		PrintUtil.three("李四修改薪资数据是否有权限：", mgr.hasPermit("李四", "薪资数据", "修改"));
		PrintUtil.println();
		PrintUtil.three("张三1查看人员列表是否有权限：", mgr.hasPermit("张三1", "人员列表", "查看"));
		PrintUtil.println();
		PrintUtil.three("张三2查看人员列表是否有权限：", mgr.hasPermit("张三2", "人员列表", "查看"));
		PrintUtil.println();
		PrintUtil.three("张三3查看人员列表是否有权限：", mgr.hasPermit("张三3", "人员列表", "查看"));
	}
}
