package com.mutistic.design.mode01.opeartion;

/**
 * @program 运算工厂类
 * @description 通过运算符 创建实例化具体运算子类
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
	
}
