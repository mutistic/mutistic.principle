package com.mutistic.common.enums;

/**
 * @program 数据类型枚举
 * @description 用于定义数据类型枚举
 * @author yc.yin
 * @date 2018年5月8日
 */
public enum DataTypeEnum {
	Object(-1, "Object"), 
	Boolean(0, "Boolean"), 
	Character(1, "Character"), 
	Byte(2, "Byte"), 
	Short(3, "Short"), 
	Integer(4, "Integer"), 
	Long(5, "Long"), 
	Double(6, "Double"), 
	Float(7, "Float"), 
	String(8, "String"), 
	Date(9, "Date"), 
	BigInteger(10, "BigInteger"), 
	BigDecimal(11, "BigDecimal"), 
	List(12, "List"), 
	ArrayList(13, "ArrayList"), 
	LinkedList(14, "LinkedList"), 
	Vector(15, "Vector"), 
	Map(16, "Map"), 
	HashMap(17, "HashMap"), 
	LinkedHashMap(18, "LinkedHashMap"), 
	Set(19, "Set"), 
	HashSet(20, "HashSet"), 
	LinkedHashSet(21, "LinkedHashSet"), 
	Date_SQL(22, "Date_SQL"), // 22：java.sql.Date(数据库日期数据类型)
	Array(23, "Array")
	;
	
	/** 枚举常量绑定值 **/
	private Integer key;
	/** 枚举常量对象 **/
	private String value;
	
	private DataTypeEnum(Integer key, String value) {
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
