package com.mutistic.creational.simplefactory.animal;

/**
 * @program 大雁 
 * @description 继承Bird类，实现IFly接口 
 * @author mutistic
 * @date 2018年5月12日
 */
public class Goose extends Bird implements IFly{

	@Override
	public void flight() {
		// TODO Auto-generated method stub
		System.out.println("Goose正在天空中飞行~~~~~~");
	}

	@Override
	public void metabolism(Oxygen oxygen, Water water) {
		// TODO Auto-generated method stub
		System.out.println("Goose正在新陈代谢......");
	}

	@Override
	public void bread() {
		// TODO Auto-generated method stub
		System.out.println("Goose正在繁殖！！！！！！");
	}

	@Override
	public void leyEggs() {
		// TODO Auto-generated method stub
		System.out.println("Goose正在下蛋");
	}

}
