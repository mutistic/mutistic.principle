package com.mutistic.common.enums;

/**
 * @program 进制枚举 
 * @description 用于定义常用进制枚举：二进制、八进制、十进制、十六进制、三十二进制、六十四进制
 * @author yc.yin
 * @date 2018年5月8日
 */
public enum ScaleEnum {
	Binary(2, "Binary"), // 二进制
	Octal(8, "Octal"), // 八进制
	Decimal(10, "Decimal"),  // 十进制
	Hex(16, "Hex"), // 十六进制
	Base32(32, "Base32"), // 三十二进制
	Base64(64, "Base64") // 六十四进制
	; 
	
	/** 枚举常量绑定值 **/
	private Integer key;
	/** 枚举常量对象 **/
	private String value;
	
	private ScaleEnum(Integer key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public Integer getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
}
