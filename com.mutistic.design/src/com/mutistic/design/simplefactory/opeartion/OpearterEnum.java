package com.mutistic.design.simplefactory.opeartion;

/**
 * @program 操作运算符枚举类 
 * @description 
 * @author mutistic
 * @date 2018年5月8日
 */
public enum OpearterEnum {
	
	ADDITION("+"),
	SUBTRACTION("-"),
	MULTIPLICATION("*"),
	DIVISION("/"),
	REMAINDER("%")
	;

	/** 枚举常量绑定值 **/
	private String key;
	
	private OpearterEnum(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
	
}
