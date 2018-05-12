package com.mutistic.design.mode01.opeartion;

/**
 * @program 运算工厂类
 * @description 通过运算符，创建具体运算方法实例对象
 * @author yc.yin
 * @date 2018年5月8日
 */
public class OpeartionFactory {

	/**
	 * @description 创建实例化后的运算子类 
	 * @author yc.yin
	 * @date 2018年5月8日
	 * @param opearter 运算类型
	 * @return 实例化后的运算子类 
	 */
	public Opeartion createrOpeartion(String opearter){
		if(OpearterEnum.ADDITION.getKey().equals(opearter)){
			return new OpeartionAdd();
		}
		else if(OpearterEnum.SUBTRACTION.getKey().equals(opearter)){
			return new OpeartionSub();
		} 
		else if(OpearterEnum.MULTIPLICATION.getKey().equals(opearter)){
			return new OpeartionMul();
		} 
		else if(OpearterEnum.DIVISION.getKey().equals(opearter)){
			return new OpeartionDiv();
		} 
		else if(OpearterEnum.REMAINDER.getKey().equals(opearter)){
			return new OpeartionRem();
		}
		return new Opeartion();
	}
	
	
	public static void main(String[] args) {
		opeartionFactory();
	}

	/**
	 * @description 运算简单工厂模式 
	 * @author yc.yin
	 * @date 2018年5月12日
	 */
	private static void opeartionFactory() {
		// Opeartion Factory
		System.out.println("Test-测试运行Operation简单工厂模式：");
		OpeartionFactory ofactory = new OpeartionFactory();
		// add
		Opeartion add = ofactory.createrOpeartion(OpearterEnum.ADDITION.getKey());
		add.setNumberA(2);
		add.setNumberB(5);
		System.out.println("numberA + numberB = " + add.getResult());

		// sub
		Opeartion sub = ofactory.createrOpeartion(OpearterEnum.SUBTRACTION.getKey());
		sub.setNumberA(2);
		sub.setNumberB(5);
		System.out.println("numberA - numberB = " + sub.getResult());

		// mul
		Opeartion mul = ofactory.createrOpeartion(OpearterEnum.MULTIPLICATION.getKey());
		mul.setNumberA(2);
		mul.setNumberB(5);
		System.out.println("numberA * numberB = " + mul.getResult());

		// div
		Opeartion div = ofactory.createrOpeartion(OpearterEnum.DIVISION.getKey());
		div.setNumberA(2);
		div.setNumberB(1);
		System.out.println("numberA / numberB = " + div.getResult());

		// rem
		Opeartion rem = ofactory.createrOpeartion(OpearterEnum.REMAINDER.getKey());
		rem.setNumberA(2);
		rem.setNumberB(5);
		System.out.println("numberA % numberB = " + rem.getResult());

		// opera
		Opeartion opera = ofactory.createrOpeartion("opera");
		opera.setNumberA(2);
		opera.setNumberB(0);
		System.out.println("numberA opera numberB = " + opera.getResult());
	}
}
