package com.mutistic.design.signleton.structure;

/**
 * @program 单例模式：懒汉式（线程不安全）
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public class Signleton {

	/**
	 * 1、声明 Signleton 成员变量
	 */
	private static Signleton uniqueIntance = null;
	
	/**
	 * 2、私有化 默认构造函数，不提供其他构造函数
	 */
	private Signleton () { }
	
	/**
	 * @description 3、提供单例对象全局访问点-线程不安全 
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @return
	 */
	public static Signleton getIntance() {
		if(uniqueIntance == null) {
			uniqueIntance = new Signleton();
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
