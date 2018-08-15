package com.mutistic.principle.simplefactory.opeartion;

/**
 * @program 运算基类 
 * @description 提供简单工厂模式运算基类
 * @author mutistic
 * @date 2018年5月8日
 */
public class Opeartion {

	private double numberA = 0;
	private double numberB = 0;
	
	
	/**
	 * @description 返回运算结果 
	 * @author mutistic
	 * @date 2018年5月8日
	 * @return
	 */
	public double getResult(){
		System.out.println("\nOpeartion");
		return 0;
	}
	
	public double getNumberA() {
		return numberA;
	}
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	public double getNumberB() {
		return numberB;
	}
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
	
	
}
