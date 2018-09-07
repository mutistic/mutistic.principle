package com.mutistic.structural.bridge.structure;

/**
 * @program Implementor：
 * @description 定义实现部分的接口，这个接口不用和Abstraction里面的方法一致，
 * 通常是由Implementor接口提供基本的操作，而Abstraction而定义的是基于这些基本操作的务方法，
 * 也就是说Abstraction定义了基于这些基本操作的较高层次的操作
 * @author mutisitic
 * @date 2018年9月7日
 */
public interface Implementor {

	/**
	 * @description 定义：示意实现抽象部分需要的某些功能
	 * @author mutisitic
	 * @date 2018年9月7日
	 */
	void operationImpl();
}
