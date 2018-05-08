package com.mutistic.design.mode01;

import com.mutistic.design.mode01.opeartion.OpearterEnum;
import com.mutistic.design.mode01.opeartion.Opeartion;
import com.mutistic.design.mode01.opeartion.OpeartionFactory;

/**
 * @program 简单工厂模式
 * @description 简单实现简单工厂模式
 * @author yc.yin
 * @date 2018年5月8日
 */
public class SimpleFactoryMode {
	public static void main(String[] args) {
		//Opeartion - test
		System.out.println("Test-测试运行Operation简单工厂模式：");
		OpeartionFactory ofactory = new OpeartionFactory();
		// add
		Opeartion add = ofactory.createrOpeartion(OpearterEnum.ADDITION.getKey());
		add.setNumberA(2);
		add.setNumberB(5);
		System.out.println("numberA + numberB = "+ add.getResult());
		
		// sub
		Opeartion sub = ofactory.createrOpeartion(OpearterEnum.SUBTRACTION.getKey());
		sub.setNumberA(2);
		sub.setNumberB(5);
		System.out.println("numberA - numberB = "+ sub.getResult());
		
		// mul
		Opeartion mul = ofactory.createrOpeartion(OpearterEnum.MULTIPLICATION.getKey());
		mul.setNumberA(2);
		mul.setNumberB(5);
		System.out.println("numberA * numberB = "+ mul.getResult());
		
		// div
		Opeartion div = ofactory.createrOpeartion(OpearterEnum.DIVISION.getKey());
		div.setNumberA(2);
		div.setNumberB(1);
		System.out.println("numberA / numberB = "+ div.getResult());
		
		// rem
		Opeartion rem = ofactory.createrOpeartion(OpearterEnum.REMAINDER.getKey());
		rem.setNumberA(2);
		rem.setNumberB(5);
		System.out.println("numberA % numberB = "+ rem.getResult());
		
		// opera
		Opeartion opera = ofactory.createrOpeartion("opera");
		opera.setNumberA(2);
		opera.setNumberB(0);
		System.out.println("numberA opera numberB = "+ opera.getResult());
		
	}
}
