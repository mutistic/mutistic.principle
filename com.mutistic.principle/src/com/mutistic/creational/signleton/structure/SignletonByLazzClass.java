package com.mutistic.creational.signleton.structure;

/**
 * @program 单例模式：懒汉式（通过 Lazy initialization holder class模式）
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public class SignletonByLazzClass {

	/**
	 * 1、在私有内部类中SignletonHead 声明 Signleton 静态成员变量，且在调用时，完成初始化
	 */
	private static class SignletonHolder {
		public final static SignletonByLazzClass uniqueIntance = new SignletonByLazzClass();
	}
	
	/**
	 * 2、私有化 默认构造函数，不提供其他构造函数
	 */
	private SignletonByLazzClass () { }
	
	/**
	 * @description 3、提供单例对象全局访问点
	 * @author mutisitic
	 * @date 2018年8月13日
	 * @return
	 */
	public static SignletonByLazzClass getIntance() {
		return SignletonHolder.uniqueIntance;
	}
	
	/**
	 * @description 其他业务功能 
	 * @author mutisitic
	 * @date 2018年8月13日
	 */
	public void signletonOpeartion() {
		
	}
	
}
