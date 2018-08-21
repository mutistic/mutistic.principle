package com.mutistic.utils;

/**
 * @program 打印工具类 
 * @description 
 * @author mutisitic
 * @date 2018年8月9日
 */
public class PrintUtil {
	private final static String T_LEFT = "【";
	private final static String T_RIGTH = "】";
	private final static String LINE_LONG = "------------------------";
	private final static String LINE_LONG_LN = "\n" + LINE_LONG;
	private final static String LINE_SHORT = "----------------";
	private final static String LINE_SHORT_LN = "\n" + LINE_SHORT;

	public static void println() {
		System.out.println();
	}
	
	public static void ln(Object str) {
		System.out.println(str);
	}
	
	public static String err(Object str) {
		String val = LINE_LONG_LN + (str == null ? "" : str);
		System.err.println(val);
		return val;
	}

	public static String one(Object str) {
		String val = LINE_LONG_LN + (str == null ? "" : str);
		System.out.println(val);
		return val;
	}

	public static String two(Object str, Object obj) {
		String val = LINE_SHORT_LN + (str == null ? "" : str) + (obj == null ? "" : T_LEFT + obj + T_RIGTH);
		System.out.println(val);
		return val;
	}

	public static String three(Object str, Object obj) {
		String val = LINE_SHORT + (str == null ? "" : str) + (obj == null ? "" : T_LEFT + obj + T_RIGTH);
		System.out.println(val);
		return val;
	}
}
