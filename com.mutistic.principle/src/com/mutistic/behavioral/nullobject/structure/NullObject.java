package com.mutistic.behavioral.nullobject.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program NullObject：
 * @description 提供与AbstractObject相同的接口，以便可以用空对象替换真实对象，实现其界面，什么也不处理。
 * 究竟什么也不处理取决于客户期望的行为，当有多种方法什么也不做的行为，可能需要多个NullObject类
 * @author mutisitic
 * @date 2018年9月12日
 */
public class NullObject extends AbstractObject {

	/** 声明 单例对象 成员变量 */
	private static NullObject intance = new NullObject();
	/**
	 * 私有构造函数
	 */
	private NullObject() {
		super();
	}
	/**
	 * @description 获取单例对象 
	 * @author mutisitic
	 * @date 2018年9月12日
	 * @return
	 */
	public static NullObject getIntance() {
		return intance;
	}

	/**
	 * @description 是否为NullObject对象具体方法
	 * @author mutisitic
	 * @date 2018年9月12日
	 * @return true：NullObject对象，false：真实对象
	 */
	@Override
	public boolean isNull() {
		return true;
	}

	/**
	 * @description 获取属性具体方法
	 * @author mutisitic
	 * @date 2018年9月12日
	 * @return
	 */
	@Override
	public String getName() {
		return "Object为空，不能调用getName()方法";
	}

	/**
	 * @description 设置属性具体方法
	 * @author mutisitic
	 * @date 2018年9月12日
	 * @param name
	 */
	@Override
	public void setName(String name) {
		PrintUtil.three("Object为空，不能调用getName()方法", name);
	}

}
