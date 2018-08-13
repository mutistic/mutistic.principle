package com.mutistic.common.enums;

/**
 * @program 日期格式化枚举
 * @description 用于定义日期格式化类型枚举
 * @author yc.yin
 * @date 2018年5月8日
 */
public enum DateFromatEnum {
	//默认格式、带毫秒默认(-)格式
	DEFAULT("yyyy-MM-dd HH:mm:ss"), 
	DEFAULT_MILL("yyyy-MM-dd HH:mm:ss.SSSS"), 
	//简单格式、时间格式、日期格式、毫秒格式
	SIMPLE("yyyy-MM-dd"), 
	DATE("yyyy/MM/dd"), 
	TIME("HH:mm:ss"), 
	MILLI_SECOND("HH:mm:ss.SSSS"),
	//日期格式、带毫秒日期(/)格式
	SLASH("yyyy/MM/dd HH:mm:ss"), 
	SLASH_MILL("yyyy/MM/dd HH:mm:ss.SSSS"),
	//无符号格式、带毫秒无符号格式
	UNSIGNED("yyyyMMddHHmmss"), 
	UNSIGNED_MILL("yyyyMMddHHmmssSSSS")
	;
	
	/** 枚举常量绑定值 **/
	private String key;
	
	private DateFromatEnum(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
}
