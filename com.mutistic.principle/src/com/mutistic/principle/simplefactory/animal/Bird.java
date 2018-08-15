package com.mutistic.principle.simplefactory.animal;

/**
 * @program 鸟
 * @description 继承 Animal类
 * @author mutistic
 * @date 2018年5月12日
 */
public class Bird extends Animal {

	/**
	 * 翅膀
	 */
	public Wing[] wigns;
	
	@Override
	public void metabolism(Oxygen oxygen, Water water) {
		System.out.println("Bird正在进行新陈代谢......");
	}

	@Override
	public void bread() {
		System.out.println("Bird正在进行繁殖！！！！！");
	}

	/**
	 * @description 下蛋 
	 * @author mutistic
	 * @date 2018年5月12日
	 */
	public void leyEggs(){
		System.out.println("Bird正在下蛋");
	}
	
}
