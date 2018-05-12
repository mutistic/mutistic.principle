package com.mutistic.design.mode01;

import com.mutistic.design.mode01.animal.AnimalFactory;
import com.mutistic.design.mode01.animal.BirdFactory;
import com.mutistic.design.mode01.opeartion.OpeartionFactory;

/**
 * @program 简单工厂模式
 * @description 简单实现简单工厂模式
 * @author yc.yin
 * @date 2018年5月8日
 */
public class SimpleFactoryMode {
	public static void main(String[] args) {
		OpeartionFactory.opeartionFactory();
		System.out.println();
		
		AnimalFactory.animalFactory();
		System.out.println();
		
		BirdFactory.birdFactory();
		System.out.println();
	}

}
