package com.mutistic.principle.factory.opeartion;

public class OpeartionRem extends Opeartion {

	@Override
	public double getResult() {
		System.out.println("\nOpeartionRem");
		if(super.getNumberB() == 0){
			System.out.println("ERROR:=======================余数不能为0！=================");
			return 0;
		}
		
		return super.getNumberA() % super.getNumberB();
	}
}
