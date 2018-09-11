package com.mutistic.structural.filter.structure;

/**
 * @program Subject：
 * @description 具体的目标对象，提供过滤器按照条件匹配数据的对象
 * @author mutisitic
 * @date 2018年9月11日
 */
public class Subject {

	/** 示意：属性A  */
	private String propertyA;
	/** 示意：属性B  */
	private int propertyB;
	
	public String getPropertyA() {
		return propertyA;
	}
	public void setPropertyA(String propertyA) {
		this.propertyA = propertyA;
	}
	public int getPropertyB() {
		return propertyB;
	}
	public void setPropertyB(int propertyB) {
		this.propertyB = propertyB;
	}
	public Subject(String propertyA, int propertyB) {
		super();
		this.propertyA = propertyA;
		this.propertyB = propertyB;
	}
	@Override
	public String toString() {
		return "Subject [propertyA=" + propertyA + ", propertyB=" + propertyB + "]";
	}
}
