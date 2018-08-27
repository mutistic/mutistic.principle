package com.mutistic.structural.composite.quote;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 父对象引用
 * @author mutisitic
 * @date 2018年8月27日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("父对象引用");

		// 定义多个Composite对象
		Component root = new Composite("root");
		Component c1 = new Composite("11");
		Component c2 = new Composite("22");

		// 创建多个叶子对象
		Component l1 = new Leaf("AAA");
		Component l2 = new Leaf("BBB");
		Component l3 = new Leaf("CCC");
		Component l4 = new Leaf("DDD");

		// 组合成树形结构
		root.addChild(c1);
		root.addChild(c2);

		c1.addChild(l1);
		c1.addChild(l2);
		c2.addChild(l3);
		c2.addChild(l4);

		// 操作Component对象
		PrintUtil.one("输出原树形结构");
		root.opeartion(" ");
		
		PrintUtil.one("从树形结构中删除"+ c1);
		root.removeChild(c1);
		root.opeartion("");
	}
}
