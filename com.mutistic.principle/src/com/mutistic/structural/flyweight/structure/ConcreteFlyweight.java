package com.mutistic.structural.flyweight.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteFlyweight：
 * @description 具体的享元实现对象，必须是可共享的，需要封装flweight的内部状态
 * @author mutisitic
 * @date 2018年8月31日
 */
public class ConcreteFlyweight implements Flyweight {

	/** 描述：享元对象的内部状态的数据 */
	private String state;
	/**
	 * 构造函数：传入享元对象的内部状态的数据
	 * @param state 享元对象的内部状态的数据
	 */ 
	public ConcreteFlyweight(String state) {
		this.state = state;
		PrintUtil.two("ConcreteFlyweight()：构造函数：传入享元对象的内部状态的数据: ", this.state);
	}

	/**
	 * @description 示例具体的操作方法，传入外部状态 
	 * @author mutisitic 
	 * @date 2018年8月31日
	 * @param extrinsicState 外部状态 
	 * @see com.mutistic.structural.flyweight.structure.Flyweight#opeartion(java.lang.String)
	 */
	@Override
	public void opeartion(String extrinsicState) {
		PrintUtil.three("ConcreteFlyweight.opeartion()：示例具体的操作方法，传入外部状态: ", extrinsicState);
	}

}
