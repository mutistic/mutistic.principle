package com.mutistic.design.simplefactory.opeartion;

public class OpeartionAdd extends Opeartion {

	@Override
	public double getResult() {
		System.out.println("\nOpeartionAdd");
		return super.getNumberA() + super.getNumberB();
	}
}