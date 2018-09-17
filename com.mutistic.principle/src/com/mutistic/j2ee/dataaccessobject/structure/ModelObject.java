package com.mutistic.j2ee.dataaccessobject.structure;

/**
 * @program ModelObject/ValueObject：
 * @description 模型对象/数值对象，该对象是简单的POJO，包含了get/set方法来存储通过使用DAO类检索到的数据
 * @author mutisitic
 * @date 2018年9月17日
 */
public class ModelObject {
	/** 示意：可能存在的属性ID */
	private long id;
	/** 示意：可能存在的属性value */
	private String value;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public ModelObject(long id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	@Override
	public String toString() {
		return "ModelObject [id=" + id + ", value=" + value + "]";
	}
}
