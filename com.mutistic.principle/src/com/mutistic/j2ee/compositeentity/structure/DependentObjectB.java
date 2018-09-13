package com.mutistic.j2ee.compositeentity.structure;

/**
 * @program DependentObject：
 * @description 依赖对象，是一个持续生命周期依赖于粗粒度对象的对象。
 * @author mutisitic
 * @date 2018年9月13日
 */
public class DependentObjectB {
	/** 定义：可能存在的属性 */
	private String data;

	/**
	 * @description 设置属性值
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @param data 需要设置的属性值
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @description 获取属性值
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @return 属性值
	 */
	public String getData() {
		return data;
	}
}
