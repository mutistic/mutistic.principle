package com.mutistic.creational.factory.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteProduce: 具体的Product接口的实现对象
 * @description
 * @author mutisitic
 * @date 2018年8月13日
 */
public class ConcreteProduce implements Product {

	/**
	 * @description Product具体业务实现
	 * @author mutisitic
	 * @date 2018年8月13日
	 */
	@Override
	public void operation() {
		PrintUtil.two("ConcreteProduce-operation", "Product具体业务实现");
	}
}
