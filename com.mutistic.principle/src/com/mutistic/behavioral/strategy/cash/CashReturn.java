package com.mutistic.behavioral.strategy.cash;

/**
 * @program 满减收银-策略类
 * @description
 * @author mutistic
 * @date 2018年5月15日
 */
public class CashReturn extends CashSuper {

	/**
	 * 满减最低金额
	 */
	public double minxMoney = 0d;
	/**
	 * 返现金额
	 */
	public double returnMoney = 0d;

	public CashReturn(double minxMoney, double returnMoney) {
		super();
		this.minxMoney = minxMoney;
		if (this.minxMoney < 0) {
			this.minxMoney = 0d;
		}
		
		this.returnMoney = returnMoney;
		if (this.returnMoney < 0) {
			this.returnMoney = 0;
		}
	}

	/**
	 * @description 满减收银
	 * @author mutistic
	 * @date 2018年5月15日
	 * @param money
	 *            收银金额
	 * @return 实际收银金额
	 */
	@Override
	public double accetpCash(double money) {
		// TODO Auto-generated method stub

		if(money >= minxMoney){
			return money - this.returnMoney;
		}
		
		return money;
	}

}
