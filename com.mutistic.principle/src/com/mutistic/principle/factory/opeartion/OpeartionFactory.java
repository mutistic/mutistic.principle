package com.mutistic.principle.factory.opeartion;

/**
 * @program 运算工厂类
 * @description 通过运算符，创建具体运算方法实例对象
 * @author mutistic
 * @date 2018年8月13日
 */
public abstract class OpeartionFactory {

	abstract Opeartion factoryMethod(double numberA, double numberB);
	
	public void operation(double numberA, double numberB) {
		Opeartion ope = factoryMethod(numberA, numberB);
		ope.getResult();
	}
}
