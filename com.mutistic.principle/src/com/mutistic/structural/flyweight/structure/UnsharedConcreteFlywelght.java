package com.mutistic.structural.flyweight.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program UnsharedConcreteFlywelght：
 * @description 非共享的享元实现对象，并不是所有的Flyweight实现对象都需要共享。非共享的享元实现对象通常是对共享享元对象的组合对象。
 * @author mutisitic
 * @date 2018年8月31日
 */
public class UnsharedConcreteFlywelght implements Flyweight {

	/** 描述：非享元对象的内部状态的数据 */
	private String allState;
	/**
	 * @description 设置 非享元对象的内部状态的数据
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param allState 非享元对象的内部状态的数据
	 */
	public void setAllState(String allState) {
		this.allState = allState;
		PrintUtil.two("UnsharedConcreteFlywelght.setAllState()：设置 传入非享元对象的内部状态的数据: ", this.allState);
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
		PrintUtil.three("UnsharedConcreteFlywelght.opeartion()：示例具体的操作方法，传入外部状态: ", extrinsicState);
	}

}
