package com.mutistic.design.strategy.cash;

/**
 * @program 收银算法-策略抽象基类 
 * @description 定义收银算法
 * @author mutistic
 * @date 2018年5月15日
 */
public abstract class CashSuper {

	/**
	 * @description 定义收银算法
	 * @author mutistic
	 * @date 2018年5月15日
	 * @param money 收银金额
	 * @return 实际收银金额
	 */
	public abstract double accetpCash(double money);
	
}
