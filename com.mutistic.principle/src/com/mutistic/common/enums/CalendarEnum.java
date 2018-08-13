package com.mutistic.common.enums;

import java.util.Calendar;

/**
 * @program 日期枚举类
 * @description 将java.util.Calendar的日期常量类 换成 日期枚举类枚举
 * @author yc.yin
 * @date 2018年5月8日
 */
public enum CalendarEnum {
	/** 0: Calendar.ERA(纪元) **/
	ERA(Calendar.ERA, "ERA"),
	/** 1: Calendar.YEAR(年) **/
	YEAR(Calendar.YEAR, "YEAR"),
	/** 2: Calendar.MONTH(月份) **/
	MONTH(Calendar.MONTH, "MONTH"),
	/** 5: Calendar.DATE(天数) **/
	DATE(Calendar.DATE, "DATE"),
	/** 6: Calendar.DAY_OF_YEAR(每年第一天) **/
	DAY_OF_YEAR(Calendar.DAY_OF_YEAR, "DAY_OF_YEAR"),
	/** 7: Calendar.DAY_OF_WEEK(每周第一天) **/
	DAY_OF_WEEK(Calendar.DAY_OF_WEEK, "DAY_OF_WEEK"),
	/** 10: Calendar.HOUR(小时) **/
	HOUR(Calendar.HOUR, "HOUR"),
	/** 12: Calendar.MINUTE(分钟)  **/
	MINUTE(Calendar.MINUTE, "MINUTE"),
	/** 13: Calendar.SECOND(秒) **/
	SECOND(Calendar.SECOND, "SECOND"),
	/** 14: Calendar.MILLISECOND(毫秒) **/
	MILLISECOND(Calendar.MILLISECOND, "MILLISECOND")
	;
	
	/** 枚举常量绑定值 **/
	private Integer key;
	/** 枚举常量对象 **/
	private String value;
	
	private CalendarEnum(Integer key, String value) {
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
