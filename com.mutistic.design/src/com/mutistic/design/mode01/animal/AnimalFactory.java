package com.mutistic.design.mode01.animal;

/**
 * @program 动物工厂类
 * @description 创建具体动物实例对象
 * @author yc.yin
 * @date 2018年5月12日
 */
public class AnimalFactory {

	/**
	 * @description 根据动物类型创建具体动物实例对象 
	 * @author yc.yin
	 * @date 2018年5月12日
	 * @param animalType 动物类型
	 * @return 动物实例对象
	 */
	public Animal createrAnimal(String animalType) {
		if (AnimalTypeEnum.BIRD.getKey().equals(animalType)) {
			return new Bird();
		} else if (AnimalTypeEnum.DUCK.getKey().equals(animalType)) {
			return new Duck();
		} else if (AnimalTypeEnum.GOOSE.getKey().equals(animalType)) {
			return new Goose();
		} else if (AnimalTypeEnum.PENGUIN.getKey().equals(animalType)) {
			return new Penguin();
		} else if (AnimalTypeEnum.DONALDDUCK.getKey().equals(animalType)) {
			return new DonaldDuck();
		}
		
		return new Animal();
	}
	
	
	public static void main(String[] args) {
		animalFactory();
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
