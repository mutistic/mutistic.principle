package com.mutistic.design.mode01.animal;

import com.mutistic.common.utils.CommonUtil;

/**
 * @program 鸟类-工厂类
 * @description 创建具体鸟类实例对象
 * @author yc.yin
 * @date 2018年5月12日
 */
public class BirdFactory {

	/**
	 * @description 根据动物类型创建具体鸟类实例对象 
	 * @author yc.yin
	 * @date 2018年5月12日
	 * @param BirdType 动物类型
	 * @return 鸟类实例对象
	 */
	public Bird createrBird(String BirdType) {
		if (AnimalTypeEnum.DUCK.getKey().equals(BirdType)) {
			return new Duck();
		} else if (AnimalTypeEnum.GOOSE.getKey().equals(BirdType)) {
			return new Goose();
		} else if (AnimalTypeEnum.PENGUIN.getKey().equals(BirdType)) {
			return new Penguin();
		} else if (AnimalTypeEnum.DONALDDUCK.getKey().equals(BirdType)) {
			return new DonaldDuck();
		}
		
		return new Bird();
	}
	
	public static void main(String[] args) {
		birdFactory();
	}
	/**
	 * @description 鸟类简单工厂模式 
	 * @author yc.yin
	 * @date 2018年5月12日
	 */
	private static void birdFactory(){
		BirdFactory factory = new BirdFactory();
		
		Oxygen oxygent = new Oxygen();
		Water water = new Water();
		Wing[] wings = new Wing[2];
		wings[0] = new Wing();
		wings[1] = new Wing();
		
		// 创建动物基类
		Bird bird = factory.createrBird(null);
		bird.wigns = wings;
		bird.life = "the bird is watching the world!";
		System.out.println(bird.life);
		System.out.println("bird的翅膀: "+ bird.wigns.length);
		bird.metabolism(oxygent, water);
		bird.bread();
		bird.leyEggs();
		System.out.println();

		
		Goose goose = (Goose) factory.createrBird(AnimalTypeEnum.GOOSE.getKey());
		goose.wigns = wings;
		goose.life = "the goose is fly!";
		System.out.println(goose.life);
		System.out.println("goose的翅膀: "+ goose.wigns.length);
		goose.metabolism(oxygent, water);
		goose.bread();
		goose.leyEggs();
		goose.flight();
		System.out.println();
		
		Bird duck = factory.createrBird(AnimalTypeEnum.DUCK.getKey());
		duck.wigns = wings;
		duck.life = "the dcuk is watching you!";
		System.out.println(duck.life);
		System.out.println("duck的翅膀: "+ duck.wigns.length);
		duck.metabolism(oxygent, water);
		duck.bread();
		duck.leyEggs();
		System.out.println();
		
		DonaldDuck donaldDuck = (DonaldDuck) factory.createrBird(AnimalTypeEnum.DONALDDUCK.getKey());
		donaldDuck.wigns = wings;
		donaldDuck.life = "the donald duck is speak!";
		System.out.println(donaldDuck.life);
		System.out.println("donaldDuck的翅膀: "+ donaldDuck.wigns.length);
		donaldDuck.metabolism(oxygent, water);
		donaldDuck.bread();
		donaldDuck.leyEggs();
		donaldDuck.speak();
		System.out.println();
		
		
		Goose[] gooses = new Goose[3];
		gooses[0] = goose;
		gooses[1] = (Goose) factory.createrBird(AnimalTypeEnum.GOOSE.getKey());
		gooses[2] = (Goose) factory.createrBird(AnimalTypeEnum.GOOSE.getKey());
		GooseGroup gg = new GooseGroup();
		gg.gooses = gooses;
		System.out.println("雁群数量: "+ gg.gooses.length);
		gg.lineFlight();
		gg.vFlight();
		
		
	}
}
