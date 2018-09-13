package com.mutistic.j2ee.mvc.structure;

/**
 * @program Model：
 * @description 模型，是应用程序中用于处理应用程序数据逻辑的部分。通常模型对象负责在数据库中存取数据
 * @author mutisitic
 * @date 2018年9月13日
 */
public class Model {

	/** 示意：可能存在的属性  */
	private String name;
	/** 示意：可能存在的属性  */
	private String value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
