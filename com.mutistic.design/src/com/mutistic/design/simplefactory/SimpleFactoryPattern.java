package com.mutistic.design.simplefactory;

import com.mutistic.design.simplefactory.animal.AnimalFactory;
import com.mutistic.design.simplefactory.animal.BirdFactory;
import com.mutistic.design.simplefactory.opeartion.OpeartionFactory;

/**
 * @program 简单工厂模式
 * @description 简单工厂模式的实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个子类（这些子类继承自一个父类或接口）的实例。
 * @author mutistic
 * @date 2018年5月8日
 */
public class SimpleFactoryPattern {
	
	public static void main(String[] args) {
		
		OpeartionFactory.opeartionFactory();
		System.out.println();
		
		AnimalFactory.animalFactory();
		System.out.println();
		
		BirdFactory.birdFactory();
		System.out.println();
	}

}
