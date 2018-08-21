package com.mutistic.creational.simplefactory.opeartion;

public class Client {
	public static void main(String[] args) {
		System.out.println("运行Operation简单工厂模式：");

		// Opeartion 简单工厂对象
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
