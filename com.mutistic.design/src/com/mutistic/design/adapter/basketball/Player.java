package com.mutistic.design.adapter.basketball;

/**
 * @program 球员 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public abstract class Player {
	
	/**
	 * 姓名
	 */
	public String name;
	
	
	public Player(String name) {
		super();
		this.name = name;
	}


	/**
	 * @description 进攻
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public abstract void attack();
	
	/**
	 * @description 防守 
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public abstract void defense();
}
