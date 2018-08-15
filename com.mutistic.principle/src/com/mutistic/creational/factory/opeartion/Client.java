package com.mutistic.creational.factory.opeartion;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client客户端 
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public class Client {
	
	public static void main(String[] args) {
		double numberA = 2d;
		double numberB = 5d;
		
		PrintUtil.printThree("OpeartionAddFactory", new OpeartionAddFactory().factoryMethod(numberA, numberB).getResult());
		PrintUtil.printThree("OpeartionDivFactory", new OpeartionDivFactory().factoryMethod(numberA, numberB).getResult());
		PrintUtil.printThree("OpeartionMulFactory", new OpeartionMulFactory().factoryMethod(numberA, numberB).getResult());
		PrintUtil.printThree("OpeartionRemFactory", new OpeartionRemFactory().factoryMethod(numberA, numberB).getResult());
		PrintUtil.printThree("OpeartionSubFactory", new OpeartionSubFactory().factoryMethod(numberA, numberB).getResult());
	}
}
