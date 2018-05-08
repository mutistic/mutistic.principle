package com.mutistic.common.utils;

import java.util.Arrays;
import java.util.List;

import com.mutistic.common.enums.ScaleEnum;

/**
 * @program 公共工具类
 * @description 提供常用方法的工具类
 * @author yc.yin
 * @date 2018年5月8日
 */
public class CommonUtil {

	/************** 集合数组转换方法 **************/
	/**
	 * @description 集合转成字符串
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param source 源集合
	 * @param tager 目标字符串(默认值：,)
	 * @return
	 */
	public static String listToString(List source, String tager)
	{
		if(source == null) {
			return null;
		}

		if(ValidateUtil.isEmpty(tager)){
			tager = ",";
		}

		StringBuffer sb = new StringBuffer();
		for(Object temp : source){
			sb.append(temp + tager);
		}
		sb.deleteCharAt(sb.length() - 1);

		return sb.toString();
	}
	
	/**
	 * @description 集合转数组
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param sourceList 源数组
	 * @return (ArrayList)目标集合
	 */
	public static Object[] listToArrays(List sourceList)
	{
		if(sourceList == null) {
			return null;
		}

		return sourceList.toArray();
	}

	/**
	 * @description 数组转(ArrayList)集合
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param sources 源数组
	 * @return 目标集合(Arrays.asList)
	 */
	public static List ArraysToList(Object[] sources) 
	{
		if(sources == null) {
			return null;
		}

		return Arrays.asList(sources);
	}

	/**
	 * @description 数组转字符串
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param sources 源数组
	 * @return 目标字符串(逗号, 隔开)
	 */
	public static String ArraysToString(Object[] sources)
	{
		if(sources == null) {
			return null;
		}

		return Arrays.toString(sources);
	}

	/**
	 * @description 数组转字符串
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param sources 源数组
	 * @param isClear 是否清除[和]为替换空字符串
	 * @return 目标字符串(逗号, 隔开)
	 */
	public static String ArraysToString(Object[] sources, boolean isClear)
	{
		if(sources == null) {
			return null;
		}

		String strObject = Arrays.toString(sources);
		// 将[或]为替换空字符串
		if(isClear){
			strObject = strObject.replace("[", "");
			strObject = strObject.replace("]", "");
		}
		return Arrays.toString(sources);
	}

	/************** 进制转换方法 **************/
	/**
	 * @description 输出常用进制转换后的字符串
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param source 源数值(支持int(short\byte)、long、double、float)
	 * @param scale 转换进制位枚举(最多支持二进制_Scale.Binary、八进制_Scale.Octal、十进制_Scale.Decimal、十六进制_Scale.Hex)
	 * @return 目标字符串
	 * @throws Exception
	 */
	public static String toScaleStr(Object source, ScaleEnum scale) {
		if(source == null || scale == null) return null;

		// int(short\byte 会先转换成int型)型数据 - 进制转换
		if(source.getClass() == Integer.class || source.getClass() == Short.class || source.getClass() == Byte.class){
			int number = 0;

			if(source.getClass() == Integer.class) 
				number = (int)source;
			else if(source.getClass() == Short.class) 
				number = (short)source;
			else if(source.getClass() == Byte.class) 
				number = (byte)source;
			else if(source.getClass() == Character.class) 
				number = (char)source;

			if(scale == ScaleEnum.Binary) 
				return Integer.toBinaryString(number);
			if(scale == ScaleEnum.Octal)  
				return Integer.toOctalString(number);
			if(scale == ScaleEnum.Decimal) 
				return Integer.toString(number);
			if(scale == ScaleEnum.Hex) 
				return Integer.toHexString(number);
		} 
		// long型数据 - 进制转换
		else if(source.getClass() == Long.class){
			long number = (long)source;

			if(scale == ScaleEnum.Binary) 
				return Long.toBinaryString(number);
			else if(scale == ScaleEnum.Octal)  
				return Long.toOctalString(number);
			else if(scale == ScaleEnum.Decimal) 
				return Long.toString(number);
			else if(scale == ScaleEnum.Hex) 
				return Long.toHexString(number);
		} 
		// double型数据 - 进制转换
		else if(source.getClass() == Double.class){
			double number = (double)source;

			if(scale == ScaleEnum.Decimal) 
				return Double.toString(number);
			else if(scale == ScaleEnum.Hex) 
				return Double.toHexString(number);
		} 
		// float型数据 - 进制转换
		else if(source.getClass() == Float.class){
			float number = (float)source;

			if(scale == ScaleEnum.Decimal) 
				return Float.toString(number);
			else if(scale == ScaleEnum.Hex) 
				return Float.toHexString(number);
		}
		return null;
	}

	/**
	 * @description 集合分页
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param sourceList 源数组
	 * @param index 分页数
	 * @param size 分页大小
	 * @return 分页后的集合（集合类型-子类SubList）
	 */
	public static List subList(List sourceList, int index, int size) {
		if(ValidateUtil.isEmpty(sourceList)) return null;

		int fromIndex = (index - 1) * size;  
		int toIndex = (index * size >= sourceList.size()) ? sourceList.size() : (index * size);

		/** subList: [fromIndex, toIndex)返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。（如果 fromIndex 和 toIndex 相等，则返回的列表为空） **/
		return sourceList.subList(fromIndex, toIndex); //范围[fromIndex, toIndex);
	}

	public static void main(String[] args) {
	}

}
