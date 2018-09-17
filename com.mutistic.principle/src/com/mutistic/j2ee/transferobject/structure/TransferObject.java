package com.mutistic.j2ee.transferobject.structure;

/**
 * @program TransferObject：
 * @description 传输对象，简单的 POJO，只有设置/获取属性的方法
 * @author mutisitic
 * @date 2018年9月17日
 */
public class TransferObject {
	/** 示意：可能存在的属性ID */
	private long id;
	/** 示意：可能存在的属性value */
	private String value;
	public TransferObject(Long id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	@Override
	public String toString() {
		return "TransferObject [id=" + id + ", value=" + value + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
