package com.mutistic.creational.signleton.structure;

/**
 * @program 单例模式：懒汉式（通过双重检查枷锁的方式实现线程安全）
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public class SignletonByVolatile {

	/**
	 * 1、声明 Signleton 成员变量
	 */
	private static volatile SignletonByVolatile uniqueIntance = null;
	
	/**
	 * 2、私有化 默认构造函数，不提供其他构造函数
	 */
	private SignletonByVolatile () { }
	
	/**
	 * @description 3、提供单例对象全局访问点- 通过双重检查枷锁的方式实现线程安全
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @return
	 */
	public static SignletonByVolatile getIntance() {
		if(uniqueIntance == null) {
			synchronized (SignletonByVolatile.class) {
				if(uniqueIntance == null) {
					uniqueIntance = new SignletonByVolatile();
				}
			}
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
