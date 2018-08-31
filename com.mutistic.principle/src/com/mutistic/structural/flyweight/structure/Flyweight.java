package com.mutistic.structural.flyweight.structure;

/**
 * @program Flyweight：
 * @description 享元接口，通这个接口flyweight可以接受并作用于外部状态。通过这个接口传入外部的状态，在享元对象的方法处理中可能会使用这些外部的数据
 * @author mutisitic
 * @date 2018年8月31日
 */
public interface Flyweight {

	/**
	 * @description 定义：示例操作方法，传入外部状态 
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param extrinsicState 示例参数：外部状态 
	 */
	void opeartion(String extrinsicState);
}
