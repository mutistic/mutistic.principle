package com.mutistic.creational.simplefactory.animal;

/**
 * @program 动物工厂类
 * @description 创建具体动物实例对象
 * @author mutistic
 * @date 2018年5月12日
 */
public class AnimalFactory {

	/**
	 * @description 根据动物类型创建具体动物实例对象 
	 * @author mutistic
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
}
