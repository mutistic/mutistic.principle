package com.mutistic.design.mode02.cash;

/**
 * @program 超市收银-策略模式+简单工厂模式上下文类
 * @description 负责实现创建所有收银算法实例的内部逻辑
 * @author yc.yin
 * @date 2018年5月15日
 */
public class CashContextAndFacory {

	/**
	 * 超市收银-策略基类
	 */
	private CashSuper cashSuper;

	/**
	 * @description 获取实际收银金额
	 * @author yc.yin
	 * @date 2018年5月15日
	 * @param money
	 *            收银金额
	 * @return 实际收银金额
	 */
	public double getCash(double money) {
		if (cashSuper == null) {
			System.out.println("收银算法策略类为空，无法获取实际收银金额");
			return 0d;
		}
		return cashSuper.accetpCash(money);
	}

	/**
	 * 构造器
	 * 
	 * @param cashSuper
	 *            超市收银策略类
	 */
	public CashContextAndFacory(String cashType) {
		super();
		this.cashSuper = createrCash(cashType);
	}

	public final static String CASH_NORMAL = "normal";
	public final static String CASH_REBATE = "rebate";
	public final static String CASH_RETURN = "return";

	/**
	 * @description 创建收银算法策略类-简单工厂模式
	 * @author yc.yin
	 * @date 2018年5月15日
	 * @param cashType
	 * @return
	 */
	public static CashSuper createrCash(String cashType) {
		switch (cashType) {
		case CASH_NORMAL:
			return new CashNoraml();
		case CASH_REBATE:
			return new CashRebate(0.8);
		case CASH_RETURN:
			return new CashReturn(300, 50);
		default:
			return null;
		}
	}

	public static void main(String[] args) {
		strategyCashMain();
	}

	/**
	 * @description 运行cash策略模式+简单工厂模式
	 * @author yc.yin
	 * @date 2018年5月15日
	 */
	public static void strategyCashMain() {
		System.out.println("运行cash策略模式+简单工厂模式");

		// 收银金额
		double money = 500;
		// 正常收银
		CashContextAndFacory context = new CashContextAndFacory(CASH_NORMAL);
		System.out.println("【CashNoraml】收银金额：" + money + "。实际收银金额：" + context.getCash(money));

		// 打折收银-五折
		CashContextAndFacory context2 = new CashContextAndFacory(CASH_REBATE);
		CashRebate rebate = (CashRebate) context2.cashSuper;
		rebate.rebate = 0.5d;
		System.out.println("【CashRebate】收银金额：" + money + "。实际收银金额：" + context2.getCash(money));

		// 满减收银-满500返200
		CashContextAndFacory context3 = new CashContextAndFacory(CASH_RETURN);
		CashReturn cashReturn = (CashReturn) context3.cashSuper;
		cashReturn.minxMoney = 500d;
		cashReturn.returnMoney = 200d;
		System.out.println("【CashReturn】收银金额：" + money + "。实际收银金额：" + context3.getCash(money));

	}

}
