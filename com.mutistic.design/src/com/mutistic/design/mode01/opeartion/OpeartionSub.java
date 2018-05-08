package com.mutistic.design.mode01.opeartion;

public class OpeartionSub extends Opeartion {

	@Override
	public double getResult() {
		System.out.println("\nOpeartionSub");
		return super.getNumberA() - super.getNumberB();
	}
	
}