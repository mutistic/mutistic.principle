package com.mutistic.design.mode02.cash;

/**
 * @program 超市收银-策略模式上下文类
 * @description 负责实现创建所有收银算法实例的内部逻辑
 * @author yc.yin
 * @date 2018年5月15日
 */
public class CashContext {

	/**
	 * 超市收银-策略基类
	 */
	private CashSuper cashSuper;

	/**
	 * 构造器
	 * 
	 * @param cashSuper
	 *            超市收银策略类
	 */
	public CashContext(CashSuper cashSuper) {
		super();
		this.cashSuper = cashSuper;
	}

	/**
	 * @description 获取实际收银金额
	 * @author yc.yin
	 * @date 2018年5月15日
	 * @param money
	 *            收银金额
	 * @return 实际收银金额
	 */
	public double getCash(double money) {
		return cashSuper.accetpCash(money);
	}

	public static void main(String[] args) {
		strategyCashMain();
	}

	/**
	 * @description 运行cash策略模式
	 * @author yc.yin
	 * @date 2018年5月15日
	 */
	public static void strategyCashMain() {
		System.out.println("运行cash策略模式");

		// 收银金额
		double money = 500;
		// 正常收银
		CashContext context = new CashContext(new CashNoraml());
		System.out.println("【CashNoraml】收银金额：" + money + "。实际收银金额：" + context.getCash(money));

		// 打折收银-八折
		CashContext context2 = new CashContext(new CashRebate(0.8));
		System.out.println("【CashRebate】收银金额：" + money + "。实际收银金额：" + context2.getCash(money));

		// 满减收银-满300返100
		CashContext context3 = new CashContext(new CashReturn(300, 50));
		System.out.println("【CashReturn】收银金额：" + money + "。实际收银金额：" + context3.getCash(money));

	}

}
