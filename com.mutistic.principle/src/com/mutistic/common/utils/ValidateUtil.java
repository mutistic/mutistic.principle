package com.mutistic.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mutistic.common.enums.DataTypeEnum;

/**
 * @program 基本验证工具类
 * @description 包括空验证、非空验证
 * @author mutistic
 * @date 2018年5月16日
 */
public class ValidateUtil {

	/**
	 * @description 验证Object对象是否为空或空值
	 * @author mutistic
	 * @date 2018年5月16日
	 * @param data
	 *            待验证对象
	 * @param dataType
	 *            数据类型枚举
	 * @return true_空或空值, false_非空且非空值
	 */
	public static boolean isEmpty(Object data, DataTypeEnum dataType) {
		if (data == null) {
			return true;
		}

		if (dataType == DataTypeEnum.Character) {
			/** char字节类型包装类Character **/
			return ((Character) data).toString().trim().isEmpty();
		} else if (dataType == DataTypeEnum.String) {
			/** String字符串类型 **/
			return ((String) data).trim().isEmpty();
		} else if (dataType == DataTypeEnum.List || dataType == DataTypeEnum.ArrayList
				|| dataType == DataTypeEnum.LinkedList || dataType == DataTypeEnum.Vector) {
			/** List集合类型 **/
			return ((List) data).isEmpty();
		} else if (dataType == DataTypeEnum.Map || dataType == DataTypeEnum.HashMap
				|| dataType == DataTypeEnum.LinkedHashMap) {
			/** Map集合类型 **/
			return ((Map) data).isEmpty();
		} else if (dataType == DataTypeEnum.Set || dataType == DataTypeEnum.HashSet
				|| dataType == DataTypeEnum.LinkedHashSet) {
			/** Set集合类型 **/
			return ((Set) data).isEmpty();
		} else if (dataType == DataTypeEnum.Array) {
			/** 数组类型 **/
			return ((Object[]) data).length == 0;
		}

		return false;
	}

	/**
	 * @description 验证Object对象是否为空或空值
	 * @author mutistic
	 * @date 2018年5月16日
	 * @param data
	 *            待验证对象
	 * @return true_空或空值, false_非空且非空值
	 */
	public static boolean isEmpty(Object data) {
		if (data == null) {
			return true;
		}

		/**
		 * Clss.isAnnotationPresent(Class<? extends Annotation> annotationClass)
		 * 如果指定类型的注释存在于此元素上，则返回 true，否则返回 false。
		 */
		if (Character.class.isAssignableFrom(data.getClass())) {
			/** char字节类型包装类Character **/
			return ((Character) data).toString().trim().isEmpty();
		} else if (String.class.isAssignableFrom(data.getClass())) {
			/** String字符串类型 **/
			return ((String) data).trim().isEmpty();
		} else if (List.class.isAssignableFrom(data.getClass())) {
			/** List集合类型:ArrayList、LinkedList、AttributeList、Stack, Vector **/
			return ((List) data).isEmpty();
		} else if (Map.class.isAssignableFrom(data.getClass())) {
			/** Map集合类型: HashMap, Hashtable, LinkedHashMap, EnumMap, TreeMap **/
			return ((Map) data).isEmpty();
		} else if (Set.class.isAssignableFrom(data.getClass())) {
			/** Set集合类型: EnumSet, HashSet, LinkedHashSet, TreeSet **/
			return ((Set) data).isEmpty();
		}

		return false;
	}

	/**
	 * @description 验证字符串是否是空或空串
	 * @author mutistic
	 * @date 2018年5月16日
	 * @param value
	 *            待验证字符串
	 * @return true_空或空串,false_非空且非空串
	 */
	public static boolean isBlank(String value) {
		return value == null || value.trim().isEmpty();
	}

	/**
	 * @description 验证字符串是否是非空且非空串
	 * @author mutistic
	 * @date 2018年5月16日
	 * @param value
	 *            待验证字符串
	 * @return true_空或空串,false_非空且非空串
	 */
	public static boolean isNotBlank(String value) {
		return !(value == null || value.trim().isEmpty());
	}

	/**
	 * @description 验证List集合是否是空或空值
	 * @author mutistic
	 * @date 2018年5月16日
	 * @param list
	 *            待验证集合
	 * @return true_空或空值,false_非空且非空值
	 */
	public static boolean isEmpty(List list) {
		return list == null || list.isEmpty();
	}

	/**
	 * @description 验证Map集合是否是空或空值
	 * @author mutistic
	 * @date 2018年5月16日
	 * @param map 待验证集合
	 * @return  true_空或空值,false_非空且非空值
	 */
	public static boolean isEmpty(Map map) {
		return map == null || map.isEmpty();
	}

	/**
	 * @description 验证数组是否是空或空值
	 * @author mutistic
	 * @date 2018年5月16日
	 * @param array 待验证数组
	 * @return true_空或空值,false_非空且非空值
	 */
	public static <T> boolean isEmpty(T[] array) {
		return array == null || array.length == 0;
	}

}
