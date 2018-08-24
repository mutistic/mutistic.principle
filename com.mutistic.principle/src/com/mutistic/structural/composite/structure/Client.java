package com.mutistic.structural.composite.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：
 * @description 客户端，通过组件接口来操作组合结果里面的组件对象
 * @author mutisitic
 * @date 2018年8月24日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("组合模式[Composite Pattern]");
		
		// 定义多个Composite对象
		Component root = new Composite();
		Component c1 = new Composite();
		Component c2 = new Composite();
		PrintUtil.two("定义多个Composite对象", "root，c1，c2");

		// 创建多个叶子对象
		Component l1 = new Leaf();
		Component l2 = new Leaf();
		Component l3 = new Leaf();
		PrintUtil.two("创建多个叶子对象", "l1，l2，l3");

		// 组合成树形结构
		root.addChild(c1);
		root.addChild(c2);
		root.addChild(l1);
		
		c1.addChild(l2);
		c2.addChild(l3);
		PrintUtil.two("组合成树形结构", "root包含c1,c2,l1。c1包含l2，c2包含l3");
		
		// 操作Component对象
		PrintUtil.two("操作Root Component对象", root);
		root.opeartion();
		
		Component comp = root.getChildrend(1);
		PrintUtil.two("操作root.getChildrend(1)", comp);
		comp.opeartion();
	}
}
