package com.mutistic.behavioral.nullobject.structure;

/**
 * @program RealObject：
 * @description 定义AbstractObject的具体子类，其实例提供客户期望的有用行为
 * @author mutisitic
 * @date 2018年9月12日
 */
public class RealObject extends AbstractObject {

	/**
	 * @description 是否为NullObject对象具体方法
	 * @author mutisitic
	 * @date 2018年9月12日
	 * @return true：NullObject对象，false：真实对象
	 */
	@Override
	public boolean isNull() {
		return false;
	}

	/**
	 * @description 获取属性具体方法
	 * @author mutisitic
	 * @date 2018年9月12日
	 * @return
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * @description 设置属性具体方法
	 * @author mutisitic
	 * @date 2018年9月12日
	 * @param name
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}
}
