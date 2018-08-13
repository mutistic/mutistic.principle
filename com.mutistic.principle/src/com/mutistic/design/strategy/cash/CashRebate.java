package com.mutistic.design.strategy.cash;

/**
 * @program 打折收银-策略类 
 * @description 
 * @author mutistic
 * @date 2018年5月15日
 */
public class CashRebate extends CashSuper{

	
	/**
	 * 折扣比例
	 */
	public double rebate = 1d;
	
	/**
	 * 构造器
	 * @param rebate 折扣比例
	 */
	public CashRebate(double rebate) {
		super();
		this.rebate = rebate;
		if(this.rebate < 0){
			this.rebate = 1d;
		}
	}



	/**
	 * @description 打折收银
	 * @author mutistic
	 * @date 2018年5月15日
	 * @param money 收银金额
	 * @return 实际收银金额
	 */
	@Override
	public double accetpCash(double money) {
		// TODO Auto-generated method stub
		return money * this.rebate;
	}

}
