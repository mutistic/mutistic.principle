package com.mutistic.j2ee.compositeentity.structure;

import java.util.Arrays;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 组合实体模式[Composite Entity Pattern]-结构 
 * @author mutisitic
 * @date 2018年9月13日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("组合实体模式[Composite Entity Pattern]-结构");
		
		// 创建组合实体
		CompositeEntity composite = new CompositeEntity();
		// 调用组合实体业务setData功能
		composite.setData("AAA", "BBB");
		// 调用组合实体业务getData功能
		PrintUtil.three("调用组合实体业务getData功能：", Arrays.asList(composite.getData()));
	}
}
