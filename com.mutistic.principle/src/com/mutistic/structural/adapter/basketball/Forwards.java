package com.mutistic.structural.adapter.basketball;

import com.mutistic.utils.PrintUtil;

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
		PrintUtil.three("前锋："+ super.name, "attack");
	}

	@Override
	public void defense() {
		PrintUtil.three("前锋："+ super.name, "defense");
	}

}
