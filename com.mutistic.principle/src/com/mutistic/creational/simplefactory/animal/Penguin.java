package com.mutistic.creational.simplefactory.animal;

/**
 * @program 企鹅 
 * @description 继承Bird，依赖气候
 * @author mutistic
 * @date 2018年5月12日
 */
public class Penguin extends Bird {

	/**
	 * 气候
	 */
	public Climate climate;
	
	@Override
	public void metabolism(Oxygen oxygen, Water water) {
		// TODO Auto-generated method stub
		System.out.println("Goose正在下蛋");
	}

	@Override
	public void bread() {
		// TODO Auto-generated method stub
		System.out.println("Goose正在下蛋");
	}
	
	@Override
	public void leyEggs() {
		// TODO Auto-generated method stub
		System.out.println("Goose正在下蛋");
	}

}
