package com.mutistic.creational.simplefactory.animal;

public class Client {
	public static void main(String[] args) {
		System.out.println("运行Animal简单工厂模式：");
		// Animal 简单工厂对象
		AnimalFactory factory = new AnimalFactory();

		// 氧气
		Oxygen oxygent = new Oxygen();
		// 水
		Water water = new Water();

		// 动物
		Animal animal = factory.createrAnimal(null);
		System.out.println(animal.life);
		animal.metabolism(oxygent, water);
		animal.bread();
		System.out.println();

		// 鸟
		Animal bird = factory.createrAnimal(AnimalTypeEnum.BIRD.getKey());
		bird.life = "the bird is watching the world!";
		System.out.println(bird.life);
		bird.metabolism(oxygent, water);
		bird.bread();
		System.out.println();

		// 大雁
		Animal goose = factory.createrAnimal(AnimalTypeEnum.GOOSE.getKey());
		goose.life = "the goose is fly!";
		System.out.println(goose.life);
		goose.metabolism(oxygent, water);
		goose.bread();
		System.out.println();

		// 企鹅
		Animal penguin = factory.createrAnimal(AnimalTypeEnum.PENGUIN.getKey());
		penguin.life = "the penguin is in a daze!";
		System.out.println(penguin.life);
		penguin.metabolism(oxygent, water);
		penguin.bread();
		System.out.println();

		// 鸭子
		Animal duck = factory.createrAnimal(AnimalTypeEnum.DUCK.getKey());
		duck.life = "the dcuk is watching you!";
		System.out.println(duck.life);
		duck.metabolism(oxygent, water);
		duck.bread();
		System.out.println();

		// 唐老鸭
		Animal donaldDuck = factory.createrAnimal(AnimalTypeEnum.DONALDDUCK.getKey());
		donaldDuck.life = "the donald duck is speak!";
		System.out.println(donaldDuck.life);
		donaldDuck.metabolism(oxygent, water);
		donaldDuck.bread();
		System.out.println();
	}
}
