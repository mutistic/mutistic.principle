package com.mutistic.creational.simplefactory.animal;

/**
 * @program 动物基类 
 * @description 存在生命，支持新陈代谢、繁殖方法
 * @author mutistic
 * @date 2018年5月12日
 */
public class Animal {

	public String life = "一个新生命";

	public void metabolism(Oxygen oxygen, Water water) {
		System.out.println("Animal正在新陈代谢......");
	}
	public void bread(){
		System.out.println("Animal正在进行繁殖！！！！！");
	}

}
