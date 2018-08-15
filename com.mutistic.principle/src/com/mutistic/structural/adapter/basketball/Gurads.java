package com.mutistic.structural.adapter.basketball;

import com.mutistic.utils.PrintUtil;

/**
 * @program 后卫 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Gurads extends Player {

	public Gurads(String name) {
		super(name);
	}

	@Override
	public void attack() {
		PrintUtil.printThree("后卫："+ super.name, "attack");
	}

	@Override
	public void defense() {
		PrintUtil.printThree("后卫："+ super.name, "defense");
	}

}
