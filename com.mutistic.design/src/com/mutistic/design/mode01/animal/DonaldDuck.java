package com.mutistic.design.mode01.animal;

/**
 * @program 唐老鸭
 * @description 继承 Duck类
 * @author yc.yin
 * @date 2018年5月12日
 */
public class DonaldDuck extends Duck {

	@Override
	public void metabolism(Oxygen oxygen, Water water) {
		// TODO Auto-generated method stub
		System.out.println("唐老鸭正在新陈代谢......");
	}

	@Override
	public void bread() {
		// TODO Auto-generated method stub
		System.out.println("唐老鸭正在繁殖!!!!!!");
	}

	@Override
	public void leyEggs() {
		// TODO Auto-generated method stub
		System.out.println("唐老鸭正在下蛋");
	}
	
	/**
	 * @description 说话 
	 * @author yc.yin
	 * @date 2018年5月12日
	 */
	public void speak(){
		System.out.println("唐老鸭正在说：hello word!");
	}

}