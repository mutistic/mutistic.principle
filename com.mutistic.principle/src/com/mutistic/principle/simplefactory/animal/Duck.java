package com.mutistic.principle.simplefactory.animal;

/**
 * @program 鸭子
 * @description 继承 Bird类
 * @author mutistic
 * @date 2018年5月12日
 */
public class Duck extends Bird {

	@Override
	public void metabolism(Oxygen oxygen, Water water) {
		// TODO Auto-generated method stub
		System.out.println("Duck正在新陈代谢......");
	}

	@Override
	public void bread() {
		// TODO Auto-generated method stub
		System.out.println("Duck正在繁殖!!!!!!");
	}
	
	@Override
	public void leyEggs() {
		// TODO Auto-generated method stub
		System.out.println("Duck正在下蛋");
	}
}
