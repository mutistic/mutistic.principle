package com.mutistic.behavioral.nullobject.structure;

/**
 * @program AbstractObject：
 * @description 声明协作者的接口，根据需要，为所有类共有的接口实现默认行为
 * @author mutisitic
 * @date 2018年9月12日
 */
public abstract class AbstractObject {
	/** 示意：可能存在的属性 */
	protected String name;

	/**
	 * @description 定义：是否为NullObject对象
	 * @author mutisitic
	 * @date 2018年9月12日
	 * @return true：NullObject对象，false：真实对象
	 */
	public abstract boolean isNull();
	
	/**
	 * @description 定义：获取属性
	 * @author mutisitic
	 * @date 2018年9月12日
	 * @return
	 */
	public abstract String getName();
	
	/**
	 * @description 定义：设置属性
	 * @author mutisitic
	 * @date 2018年9月12日
	 * @param name
	 */
	public abstract void setName(String name);
}
