package com.mutistic.design.utils;

/**
 * @program 打印工具类 
 * @description 
 * @author mutisitic
 * @date 2018年8月9日
 */
public class PrintUtil {
	public final static String UTF8 = "UTF-8";

	public final static String T_LEFT = "【";
	public final static String T_RIGTH = "】";
	public final static String LINE_LONG = "------------------------";
	public final static String LINE_LONG_LN = "\n" + LINE_LONG;
	public final static String LINE_SHORT = "----------------";
	public final static String LINE_SHORT_LN = "\n" + LINE_SHORT;

	public static void println() {
		System.out.println();
	}

	public static void println(Object str) {
		System.out.println(str);
	}
	
	public static String printErr(Object str) {
		String val = LINE_LONG_LN + (str == null ? "" : str);
		System.err.println(val);
		return val;
	}

	public static String printOne(Object str) {
		String val = LINE_LONG_LN + (str == null ? "" : str);
		System.out.println(val);
		return val;
	}

	public static String printTwo(Object str, Object obj) {
		String val = LINE_SHORT_LN + (str == null ? "" : str) + (obj == null ? "" : T_LEFT + obj + T_RIGTH);
		System.out.println(val);
		return val;
	}

	public static String printThree(Object str, Object obj) {
		String val = LINE_SHORT + (str == null ? "" : str) + (obj == null ? "" : T_LEFT + obj + T_RIGTH);
		System.out.println(val);
		return val;
	}
}
