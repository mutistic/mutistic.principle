package com.mutistic.design.factory.opeartion;

/**
 * @program 运算工厂类
 * @description 通过运算符，创建具体运算方法实例对象
 * @author mutistic
 * @date 2018年5月8日
 */
public class OpeartionDivFactory extends OpeartionFactory {

	@Override
	public Opeartion factoryMethod(double numberA, double numberB) {
		Opeartion ope = new OpeartionDiv();
		ope.setNumberA(numberA);
		ope.setNumberB(numberB);
		return ope;
	}
}
