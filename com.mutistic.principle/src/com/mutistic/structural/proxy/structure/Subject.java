package com.mutistic.structural.proxy.structure;

/**
 * @program Subject
 * @description 目标接口，定义代理额具体目标对象的接口，可在任何使用具体目标对象的地方使用代理对象 
 * @author mutisitic
 * @date 2018年8月17日
 */
public interface Subject {

	/**
	 * @description 声明业务功能接口
	 * @author mutisitic
	 * @date 2018年8月17日
	 */
	void request();
}
