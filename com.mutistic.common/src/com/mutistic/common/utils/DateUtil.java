package com.mutistic.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.mutistic.common.enums.CalendarEnum;
import com.mutistic.common.enums.DateFromatEnum;
import com.mutistic.common.enums.SecondEnum;

/**
 * @program 日期工具类 
 * @description 用于日期转换
 * @author yc.yin
 * @date 2018年5月8日
 */
public class DateUtil {
	
	/************** 日期对象加减操作 **************/
	/**
	 * @description 加减日期(时间类型枚举)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param data 当前日期
	 * @param calend 时间类型枚举
	 * @param operand 操作数
	 * @return 运算后的时间
	 */
	public static Date handleDate(Date data, CalendarEnum calend, int operand) {
		if(data == null || calend == null) return null;
		if(operand == 0) return data;
		
		Calendar dateTime = Calendar.getInstance();
		dateTime.setTime(data);
		dateTime.add(calend.getKey(), operand);
		return dateTime.getTime();
	}
	
	/**
	 * @description 加减日期(月份)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param data 当前日期
	 * @param calend 时间类型枚举
	 * @param month 月份操作数
	 * @return 运算后的时间
	 */
	public static Date handleMonth(Date date, int month) {
		if(date == null) return null;
		if(month == 0) return date;
		
		Calendar dateTime = Calendar.getInstance();
		dateTime.setTime(date);
		dateTime.add(Calendar.MONTH, month);
		return dateTime.getTime();
	}

	/**
	 * @description 加减日期(天)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param data 当前日期
	 * @param calend 时间类型枚举
	 * @param day 天操作数
	 * @return 运算后的时间
	 */
	public static Date handleDay(Date date, int day) {
		if(date == null) return null;
		if(day == 0) return date;
		
		Calendar dateTime = Calendar.getInstance();
		dateTime.setTime(date);
		dateTime.add(Calendar.DATE, day);
		return dateTime.getTime();
	}
	
	/**
	 * @description 加减日期(小时)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param data 当前日期
	 * @param calend 时间类型枚举
	 * @param hours 小时操作数
	 * @return 运算后的时间
	 */
	public static Date handleHour(Date date, int hours) {
		if(date == null) return null;
		if(hours == 0) return date;
		
		Calendar dateTime = Calendar.getInstance();
		dateTime.setTime(date);
		dateTime.add(Calendar.HOUR, hours);
		return dateTime.getTime();
	}
	
	
	/************** 字符串对象解析为为日期 **************/
	/**
	 * @description 解析字符串(yyyy-MM-dd HH:mm:ss)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param _dateStr 日期字符串
	 * @return 解析后的日期
	 * @throws Exception
	 */
	public static Date parse(String _dateStr) throws Exception {
		if(ValidateUtil.isEmpty(_dateStr)) return null;
		
		return new SimpleDateFormat(DateFromatEnum.DEFAULT.getKey()).parse(_dateStr);
	}
	
	/**
	 * @description 解析字符串(yyyy-MM-dd HH:mm:ss)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param dateStr 日期字符串
	 * @param format DateFromatEnum枚举
	 * @return 解析后的日期
	 * @throws Exception
	 */
	public static Date parseDate(String dateStr, DateFromatEnum format) throws Exception {
		if(ValidateUtil.isEmpty(dateStr) || ValidateUtil.isEmpty(format)) return null;
		
		return new SimpleDateFormat(format.getKey()).parse(dateStr);
	}
	
	/**
	 * @description 解析字符串(yyyy-MM-dd)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param dateStr 日期字符串
	 * @return 解析后的日期
	 * @throws Exception
	 */
	public static Date parseSimple(String dataStr) throws Exception {
		if(ValidateUtil.isEmpty(dataStr)) return null;
		
		return new SimpleDateFormat(DateFromatEnum.SIMPLE.getKey()).parse(dataStr);
	}
	
	/**
	 * @description 解析字符串(HH:mm:ss)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param dateStr 日期字符串
	 * @return 解析后的日期
	 * @throws Exception
	 */
	public static Date parseTime(String dataStr) throws Exception {
		if(ValidateUtil.isEmpty(dataStr)) return null;
		
		return new SimpleDateFormat(DateFromatEnum.TIME.getKey()).parse(dataStr);
	}
	
	/**
	 * @description java.sql.Date 转 java.util.Date
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param sqlDate java.sql.Date
	 * @return java.util.Date
	 */
	public static Date parseSqlDate(java.sql.Date sqlDate) {
		if(sqlDate == null) return null;
		
		return new Date(sqlDate.getTime()); 
	}
	
	
	/************** 日期对象格式化为字符串 **************/
	/**
	 * @description 格式化日期(yyyy-MM-dd HH:mm:ss)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param date 日期
	 * @return 格式化后的日期字符串
	 */
	public static String format(Date date) {
		if(date == null) return "";
		
		return new SimpleDateFormat(DateFromatEnum.DEFAULT.getKey()).format(date);
	}
	
	/**
	 * @description 格式化日期(format)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param date 日期
	 * @param format DateFromatEnum枚举
	 * @return 格式化后的日期字符串
	 */
	public static String formatDate(Date _date, DateFromatEnum format) {
		if(_date == null || ValidateUtil.isEmpty(format)) return "";
		
		return new SimpleDateFormat(format.getKey()).format(_date);
	}
	
	/**
	 * @description 格式化日期(yyyy-MM-dd)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param date 日期
	 * @return 格式化后的日期字符串
	 */
	public static String formatSimple(Date date) {
		if(date == null) return "";
		
		return new SimpleDateFormat(DateFromatEnum.SIMPLE.getKey()).format(date);
	}
	
	/**
	 * @description 格式化日期(HH:mm:ss)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param date 日期
	 * @return 格式化后的日期字符串
	 */
	public static String formatTime(Date date) throws Exception {
		if(date == null) return "";
		
		return new SimpleDateFormat(DateFromatEnum.TIME.getKey()).format(date);
	}

	/**
	 * @description 格式化日期(HH:mm:ss.SSSS)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param date 日期
	 * @return 格式化后的日期字符串
	 */
	public static String formatMilliSecond(Date date) throws Exception {
		if(date == null) return "";
		
		return new SimpleDateFormat(DateFromatEnum.MILLI_SECOND.getKey()).format(date);
	}
	
	
	/************** 组合日期 **************/
	/**
	 * @description 组合日期/时间 (yyyy-MM-dd HH:mm:ss)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param source 源日期
	 * @param combo 组合日期（Date/sqlDate/String）
	 * @param comboType 组合类型
	 * @return 组合后的日期
	 * @throws Exception
	 */
	public static Date combo(Object source, Object combo, int comboType) throws Exception {
		/** 日期字符串 **/
		String dStr = null; 
		/** 时间字符串 **/
		String tStr = null;
		
		// 原日期+原时间
		if(comboType == 1){
			dStr = dateToString(source, true);
			tStr = dateToString(combo, false);
		} 
		// 新日期+原时间
		else if(comboType == 2){
			dStr = dateToString(combo, true);
			tStr = dateToString(source, false);
		}
		
		if(ValidateUtil.isEmpty(dStr) || ValidateUtil.isEmpty(tStr)){
			return null;
		}
		return parse(dStr + " " + tStr);
	}
	
	/**
	 * @description 组合日期 (yyyy-MM-dd HH:mm:ss)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param source 源日期
	 * @param combo 组合日期（Date/sqlDate/String）
	 * @return 组合后的日期
	 * @throws Exception
	 */
	public static Date commboDate(Date time, Object commob) throws Exception {
		if(time == null) return null;
		
		String newDate =  dateToString(commob, true) +" "+ formatTime(time);
		if(ValidateUtil.isEmpty(newDate)) {
			 return null;
		}
		return parseSimple(newDate);
	}
	
	/**
	 * @description 组合时间 (yyyy-MM-dd HH:mm:ss)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param source 源日期
	 * @param combo 组合日期（Date/sqlDate/String）
	 * @return 组合后的日期
	 * @throws Exception
	 */
	public static Date commobTime(Date date, Object commob) throws Exception {
		if(date == null) return null;
		
		String newDate =  formatSimple(date) + " " + dateToString(commob, false);
		if(ValidateUtil.isEmpty(newDate)) {
			 return null;
		}
		return parseSimple(newDate);
	}
	
	/**
	 * @description 解析日期(yyyy-MM-dd HH:mm:ss)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param dateObj 日期(Date, java.sql.Date, String)
	 * @param isFormatDate true：获得日期(yyyy-MM-dd) false_HH:mm:ss)
	 * @return 解析后的日期字符串
	 * @throws Exception
	 */
	public static String dateToString(Object dateObj, boolean isFormatDate) throws Exception {
		if(dateObj == null) return null;
		
		String dateString = null;
		// 解析Date
		if(dateObj.getClass() == Date.class){
			dateString = isFormatDate ? formatSimple((Date)dateObj) : formatTime((Date)dateObj);
		} 
		// 解析java.sql.Date
		else if(dateObj.getClass() == java.sql.Date.class){
			Date date = parseSqlDate((java.sql.Date)dateObj);
			dateString = isFormatDate ? formatSimple(date) : formatTime(date);
		} 
		// 解析字符串（支持 yyyy-MM-dd 、 HH:mm:ss 、yyyy-MM-dd HH:mm:ss）
		else if(dateObj.getClass() == String.class){
			dateString = (String) dateObj;
			if(dateString.length() != 8 || dateString.length() != 10){
				dateString = null;
			}
			else if(dateString.length() == 19){
				dateString = isFormatDate ? dateString.split(" ")[0] : dateString.split(" ")[1];
			}
		}
		return dateString;
	}
	
	/************** 获取时间差 **************/
	/**
	 * @description 计算时间差
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param first 日期1
	 * @param second 日期2
	 * @param calend (CalendarEnum:支持天、小时、秒、毫秒)
	 * @return second-first的时间差(保留小数位)
	 */
	public static double interval(Date first, Date second, CalendarEnum calend) {
		if (null == first || null == second) return -1d;
		
		long intevalMilli = second.getTime() - first.getTime();
		// 相差天数 
		if(calend == CalendarEnum.DATE){
			return intevalMilli / SecondEnum.M_DAY.getKey();
		} 
		// 相差小时
		else if(calend == CalendarEnum.HOUR){
			return intevalMilli / SecondEnum.M_HOUR.getKey();
		}
		// 相差秒
		else if(calend == CalendarEnum.SECOND){
			return intevalMilli / SecondEnum.M_SECOND.getKey();
		}
		
		// 相差毫秒
		return intevalMilli;
	}

	/**
	 * @description 计算时间差(天)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param first 日期1
	 * @param second 日期2
	 * @return second-first的相差天数(取整)
	 */
	public static int intervalDays(Date first, Date second) {
		if (null == first || null == second) return -1;
		
		return (int) intervalMilliSeconds(first, second) / SecondEnum.M_DAY.getKey();
	}
	
	/**
	 * @description 计算时间差(秒)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param first 日期1
	 * @param second 日期2
	 * @return second-first的相差秒(取整)
	 */
	public static long intervalSeconds(Date first, Date second) {
		if (null == first || null == second) return -1;
		
		return second.getTime() - first.getTime() / SecondEnum.M_SECOND.getKey();
	}
	
	/**
	 * @description 计算时间差(毫秒)
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param first 日期1
	 * @param second 日期2
	 * @return second-first的相差秒(取整)
	 */
	public static long intervalMilliSeconds(Date first, Date second) {
		if (null == first || null == second) return -1;
		
		return second.getTime() - first.getTime();
	}

}
