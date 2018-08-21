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
		
		PrintUtil.three("OpeartionAddFactory", new OpeartionAddFactory().factoryMethod(numberA, numberB).getResult());
		PrintUtil.three("OpeartionDivFactory", new OpeartionDivFactory().factoryMethod(numberA, numberB).getResult());
		PrintUtil.three("OpeartionMulFactory", new OpeartionMulFactory().factoryMethod(numberA, numberB).getResult());
		PrintUtil.three("OpeartionRemFactory", new OpeartionRemFactory().factoryMethod(numberA, numberB).getResult());
		PrintUtil.three("OpeartionSubFactory", new OpeartionSubFactory().factoryMethod(numberA, numberB).getResult());
	}
}
