package com.mutistic.design.factory.structure;

/**
 * @program Client客户端
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public class Client {
	
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		creator.operation();
	}
	
}
