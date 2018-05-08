package com.mutistic.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mutistic.common.enums.DataTypeEnum;


/**
 * <p>功能描述：基本验证工具类</p> 
 * YC.Yin-2016-4-26 下午9:01:51
 */
public class ValidateUtil {

	/**
	 * <p>方法描述：验证Object对象是否为空或空值 </p>
	 * YC.Yin-2016-4-26 下午11:26:14 
	 * @param _data 待验证对象
	 * @param _dataType 数据类型枚举
	 * @return true_空或空值, false_非空且非空值
	 * @throws Exception
	 */
	public static boolean isEmpty(Object _data, DataTypeEnum _dataType)
	{
		if(_data == null){
			return true;
		}

		if(_dataType == DataTypeEnum.Character)
		{
			/** char字节类型包装类Character **/
			return ((Character)_data).toString().trim().isEmpty();
		} 
		else if(_dataType == DataTypeEnum.String)
		{
			/** String字符串类型  **/
			return ((String)_data).trim().isEmpty();
		} 
		else if(_dataType == DataTypeEnum.List || _dataType == DataTypeEnum.ArrayList || _dataType == DataTypeEnum.LinkedList ||  _dataType == DataTypeEnum.Vector)
		{
			/** List集合类型  **/
			return ((List)_data).isEmpty();
		}
		else if(_dataType == DataTypeEnum.Map || _dataType == DataTypeEnum.HashMap || _dataType == DataTypeEnum.LinkedHashMap)
		{
			/** Map集合类型  **/
			return ((Map)_data).isEmpty();
		}
		else if(_dataType == DataTypeEnum.Set || _dataType == DataTypeEnum.HashSet || _dataType == DataTypeEnum.LinkedHashSet)
		{
			/** Set集合类型  **/
			return ((Set)_data).isEmpty();
		}
		else if(_dataType == DataTypeEnum.Array)
		{
			/** 数组类型 **/
			return ((Object[])_data).length == 0;
		}

		return false;
	}

	/**
	 * <p>方法描述：验证Object对象是否为空或空值 </p>
	 * YC.Yin-2016-4-26 下午11:26:14 
	 * @param _data 待验证对象
	 * @param _dataType 数据类型枚举
	 * @return true_空或空值, false_非空且非空值
	 * @throws Exception
	 */
	public static boolean isEmpty(Object _data)
	{ 
		if(_data == null){
			return true;
		}

		/**
		 *  Clss.isAnnotationPresent(Class<? extends Annotation> annotationClass)  
		 *  如果指定类型的注释存在于此元素上，则返回 true，否则返回 false。
		 */
		if(Character.class.isAssignableFrom(_data.getClass()))
		{
			/** char字节类型包装类Character **/
			return ((Character)_data).toString().trim().isEmpty();
		} 
		else if(String.class.isAssignableFrom(_data.getClass()))
		{
			/** String字符串类型  **/
			return ((String)_data).trim().isEmpty();
		} 
		else if(List.class.isAssignableFrom(_data.getClass()))
		{
			/** List集合类型:ArrayList、LinkedList、AttributeList、Stack, Vector  **/
			return ((List)_data).isEmpty();
		} 
		else if(Map.class.isAssignableFrom(_data.getClass()))
		{
			/** Map集合类型: HashMap, Hashtable, LinkedHashMap, EnumMap, TreeMap **/
			return ((Map)_data).isEmpty();
		} 
		else if(Set.class.isAssignableFrom(_data.getClass()))
		{
			/** Set集合类型: EnumSet, HashSet, LinkedHashSet, TreeSet  **/
			return ((Set)_data).isEmpty();
		} 

		return false;
	}

	/**
	 * <p>方法描述：验证字符串是否是空或空串 </p>
	 * YC.Yin-2016-4-26 下午8:56:48 
	 * @param _value 待验证字符串
	 * @return true_空或空串,false_非空且非空串
	 * @throws Exception
	 */
	public static boolean isEmpty(String _value)
	{
		return _value == null || _value.trim().isEmpty();
	}

	/**
	 * <p>方法描述：验证字符串是否是空或空串 </p>
	 * YC.Yin-2016-4-26 下午8:56:48 
	 * @param _value 待验证字符串
	 * @return true_空或空串,false_非空且非空串
	 * @throws Exception
	 */
	public static boolean isNotEmpty(String _value) 
	{
		return !(_value == null || _value.trim().isEmpty());
	}

	/**
	 * <p>方法描述：验证List集合是否是空或空值 </p>
	 * YC.Yin-2016-4-26 下午8:56:48 
	 * @param _list 待验证List集合
	 * @return true_空或空值,false_非空且非空值
	 * @throws Exception
	 */
	public static boolean isEmpty(List _list) 
	{
		return _list == null || _list.isEmpty();
	}

	/**
	 * <p>方法描述：验证Map集合是否是空或空值 </p>
	 * YC.Yin-2016-4-26 下午8:56:48 
	 * @param _map 待验证List集合
	 * @return true_空或空值,false_非空且非空值
	 * @throws Exception
	 */
	public static boolean isEmpty(Map _map) 
	{
		return _map == null || _map.isEmpty();
	}

	/**
	 * <p>方法描述：验证数组是否是空或空值 </p>
	 * YC.Yin-2016-4-26 下午8:56:48 
	 * @param <T>
	 * @param _map 待验证List集合
	 * @return true_空或空值,false_非空且非空值
	 * @throws Exception
	 */
	public static <T> boolean isEmpty(T[] _array) 
	{
		return _array == null || _array.length == 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Object a = new ArrayList();
			System.out.println(isEmpty(a));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
