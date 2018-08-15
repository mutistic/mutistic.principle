package com.mutistic.structural.adapter.basketball;

import com.mutistic.utils.PrintUtil;

/**
 * @program 中锋 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Center extends Player {

	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		PrintUtil.printThree("中锋："+ super.name, "attack");
	}

	@Override
	public void defense() {
		PrintUtil.printThree("中锋："+ super.name, "defense");
	}

}
