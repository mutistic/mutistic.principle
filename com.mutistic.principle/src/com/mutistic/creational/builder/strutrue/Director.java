package com.mutistic.creational.builder.strutrue;

/**
 * @program Director
 * @description 指导者，也称为导向者，主要用来使用Builder接口，以一个统一的过程来构建所需要的Product对象
 * @author mutisitic
 * @date 2018年8月14日
 */
public class Director {

	/**
	 * 建造者接口是有成员变量
	 */
	private Builder builder;

	/**
	 * 构造函数，传入Builder建造者的具体实例
	 * 
	 * @param builder
	 */
	public Director(Builder builder) {
		super();
		this.builder = builder;
	}

	/**
	 * @description 指导建造者构建最终的产品对象的方法
	 * @author mutisitic
	 * @date 2018年8月14日
	 */
	public void construct() {
		this.builder.builderPart();
	}

}
