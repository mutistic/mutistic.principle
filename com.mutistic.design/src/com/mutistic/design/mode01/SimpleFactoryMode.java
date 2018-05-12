package com.mutistic.design.mode01;

import com.mutistic.design.mode01.animal.Animal;
import com.mutistic.design.mode01.animal.AnimalFactory;
import com.mutistic.design.mode01.animal.AnimalTypeEnum;
import com.mutistic.design.mode01.animal.Goose;
import com.mutistic.design.mode01.animal.Oxygen;
import com.mutistic.design.mode01.animal.Water;
import com.mutistic.design.mode01.opeartion.OpearterEnum;
import com.mutistic.design.mode01.opeartion.Opeartion;
import com.mutistic.design.mode01.opeartion.OpeartionFactory;

/**
 * @program 简单工厂模式
 * @description 简单实现简单工厂模式
 * @author yc.yin
 * @date 2018年5月8日
 */
public class SimpleFactoryMode {
	public static void main(String[] args) {
//		opeartionFactory();
		System.out.println();
		animalFactory();
	}

	/**
	 * @description 运算简单工厂模式 
	 * @author yc.yin
	 * @date 2018年5月12日
	 */
	private static void opeartionFactory() {
		// Opeartion Factory
		System.out.println("Test-测试运行Operation简单工厂模式：");
		OpeartionFactory ofactory = new OpeartionFactory();
		// add
		Opeartion add = ofactory.createrOpeartion(OpearterEnum.ADDITION.getKey());
		add.setNumberA(2);
		add.setNumberB(5);
		System.out.println("numberA + numberB = " + add.getResult());

		// sub
		Opeartion sub = ofactory.createrOpeartion(OpearterEnum.SUBTRACTION.getKey());
		sub.setNumberA(2);
		sub.setNumberB(5);
		System.out.println("numberA - numberB = " + sub.getResult());

		// mul
		Opeartion mul = ofactory.createrOpeartion(OpearterEnum.MULTIPLICATION.getKey());
		mul.setNumberA(2);
		mul.setNumberB(5);
		System.out.println("numberA * numberB = " + mul.getResult());

		// div
		Opeartion div = ofactory.createrOpeartion(OpearterEnum.DIVISION.getKey());
		div.setNumberA(2);
		div.setNumberB(1);
		System.out.println("numberA / numberB = " + div.getResult());

		// rem
		Opeartion rem = ofactory.createrOpeartion(OpearterEnum.REMAINDER.getKey());
		rem.setNumberA(2);
		rem.setNumberB(5);
		System.out.println("numberA % numberB = " + rem.getResult());

		// opera
		Opeartion opera = ofactory.createrOpeartion("opera");
		opera.setNumberA(2);
		opera.setNumberB(0);
		System.out.println("numberA opera numberB = " + opera.getResult());
	}

	/**
	 * @description 动物简单工厂模式 
	 * @author yc.yin
	 * @date 2018年5月12日
	 */
	private static void animalFactory(){
		AnimalFactory factory = new AnimalFactory();
		
		Oxygen oxygent = new Oxygen();
		Water water = new Water();
		
		// 创建动物基类
		Animal animal = factory.createrAnimal(null);
		System.out.println(animal.life);
		animal.metabolism(oxygent, water);
		animal.bread();
		System.out.println();
		
		Animal bird = factory.createrAnimal(AnimalTypeEnum.BIRD.getKey());
		bird.life = "the bird is watching the world!";
		System.out.println(bird.life);
		bird.metabolism(oxygent, water);
		bird.bread();
		System.out.println();

		
		Animal goose = factory.createrAnimal(AnimalTypeEnum.GOOSE.getKey());
		goose.life = "the goose is fly!";
		System.out.println(goose.life);
		goose.metabolism(oxygent, water);
		goose.bread();
		System.out.println();
		
		Animal duck = factory.createrAnimal(AnimalTypeEnum.DUCK.getKey());
		duck.life = "the dcuk is watching you!";
		System.out.println(duck.life);
		duck.metabolism(oxygent, water);
		duck.bread();
		System.out.println();
		
		Animal donaldDuck = factory.createrAnimal(AnimalTypeEnum.DONALDDUCK.getKey());
		donaldDuck.life = "the donald duck is speak!";
		System.out.println(donaldDuck.life);
		donaldDuck.metabolism(oxygent, water);
		donaldDuck.bread();
		System.out.println();
	}
}
