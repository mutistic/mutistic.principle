package com.mutistic.design.mode01.opeartion;

public class OpeartionDiv extends Opeartion {

	@Override
	public double getResult() {
		System.out.println("\nOpeartionDiv");
		if(super.getNumberB() == 0){
			System.out.println("ERROR:==================除数不能为0！=============");
			return 0;
		}
		
		return super.getNumberA() / super.getNumberB();
	}
}
