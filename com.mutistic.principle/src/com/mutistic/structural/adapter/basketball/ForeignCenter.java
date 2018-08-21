package com.mutistic.structural.adapter.basketball;

import com.mutistic.utils.PrintUtil;

/**
 * @program 外籍中锋 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class ForeignCenter {
	
	public String name;

	public void attack() {
		PrintUtil.three("外籍中锋 ："+ name, "进攻");
	}

	public void defense() {
		PrintUtil.three("外籍中锋 ："+ name, "防守");
	}

}
