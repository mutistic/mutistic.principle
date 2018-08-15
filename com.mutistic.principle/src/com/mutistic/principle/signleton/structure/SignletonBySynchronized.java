package com.mutistic.principle.signleton.structure;

/**
 * @program 单例模式：懒汉式（使用synchronized保证线程安全）
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public class SignletonBySynchronized {

	/**
	 * 1、声明 Signleton 成员变量
	 */
	private static SignletonBySynchronized uniqueIntance = null;
	
	/**
	 * 2、私有化 默认构造函数，不提供其他构造函数
	 */
	private SignletonBySynchronized () { }
	
	/**
	 * @description 3、提供单例对象全局访问点- 通过 synchronized对getIntance()方法添加同步锁保证线程安全
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @return
	 */
	public static synchronized SignletonBySynchronized getIntance() {
		if(uniqueIntance == null) {
			uniqueIntance = new SignletonBySynchronized();
		}
		
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
