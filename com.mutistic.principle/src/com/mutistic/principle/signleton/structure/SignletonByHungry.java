package com.mutistic.principle.signleton.structure;

/**
 * @program 单例模式：饿汉式
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public class SignletonByHungry {

	/**
	 * 1、声明 Signleton 成员变量- 直接创建好实例完成初始化
	 */
	private final static SignletonByHungry uniqueIntance = new SignletonByHungry();
	
	/**
	 * 2、私有化 默认构造函数，不提供其他构造函数
	 */
	private SignletonByHungry () { }
	
	/**
	 * @description 3、提供单例对象全局访问点-线程安全 
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @return
	 */
	public static SignletonByHungry getIntance() {
		return uniqueIntance;
	}
	
	/**
	 * @description 其他业务功能 
	 * @author mutisitic
	 * @date 2018年8月13日
	 */
	public void signletonOpeartion() {
		
	}
	
}
