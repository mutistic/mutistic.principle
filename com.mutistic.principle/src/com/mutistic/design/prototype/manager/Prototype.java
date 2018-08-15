package com.mutistic.design.prototype.manager;

/**
 * @program 原型抽象类：提供抽象clone方法 
 * @description 
 * @author mutisitic
 * @date 2018年8月15日
 */
public abstract class Prototype {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Prototype clone();
	
}
