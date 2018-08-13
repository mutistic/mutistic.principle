package com.mutistic.design.adapter.basketball;

import com.mutistic.design.utils.PrintUtil;

/**
 * @program 前锋 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		PrintUtil.printThree("前锋："+ super.name, "attack");
	}

	@Override
	public void defense() {
		PrintUtil.printThree("前锋："+ super.name, "defense");
	}

}
