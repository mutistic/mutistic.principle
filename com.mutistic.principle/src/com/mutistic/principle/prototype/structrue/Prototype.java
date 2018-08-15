package com.mutistic.principle.prototype.structrue;

/**
 * @program Prototype
 * @description 声明一个克隆自身的接口，用来约束想要克隆自己的类，要求他们都要实现这里定义的克隆方法
 * @author mutisitic
 * @date 2018年8月15日
 */
public interface Prototype {

	/**
	 * @description 克隆自身的接口
	 * @author mutisitic
	 * @date 2018年8月15日
	 * @return
	 */
	Prototype clone();
	
}
