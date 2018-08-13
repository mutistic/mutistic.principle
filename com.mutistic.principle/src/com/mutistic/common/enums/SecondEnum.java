package com.mutistic.common.enums;

/**
 * @program 秒、毫秒转换枚举 
 * @description 用于定义秒、毫秒转换枚举 
 * @author yc.yin
 * @date 2018年5月8日
 */
public enum SecondEnum {
	// 转换成秒
	DAY(86400), // 24 * 60 * 60
	HOUR(3600), // 60 * 60
	MINUTE(60), // 60
	
	// 转换成毫秒
	M_DAY(86400000), // 24 * 60 * 60 * 1000
	M_HOUR(3600000), // 60 * 60 * 1000
	M_MINUTE(60000), // 60 * 1000
	M_SECOND(1000) // 1000
	;  
	
	/** 枚举常量绑定值 **/
	private Integer key;
	
	private SecondEnum(Integer key) {
		this.key = key;
	}
	
	public Integer getKey() {
		return key;
	}
}
