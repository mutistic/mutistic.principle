package com.mutistic.design.mode01.opeartion;

/**
 * @program 操作运算符枚举类 
 * @description 
 * @author yc.yin
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
