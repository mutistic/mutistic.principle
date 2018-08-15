package com.mutistic.principle.strategy.cash;

/**
 * @program 正常收银-策略类 
 * @description 
 * @author mutistic
 * @date 2018年5月15日
 */
public class CashNoraml extends CashSuper{

	/**
	 * @description 正常收银
	 * @author mutistic
	 * @date 2018年5月15日
	 * @param money 收银金额
	 * @return 实际收银金额
	 */
	@Override
	public double accetpCash(double money) {
		return money;
	}

}
