package com.mutistic.creational.simplefactory.opeartion;

public class OpeartionMul extends Opeartion {

	@Override
	public double getResult() {
		System.out.println("\nOpeartionMul");
		return super.getNumberA() * super.getNumberB();
	}
	
}
