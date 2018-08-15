package com.mutistic.principle.strategy;

import com.mutistic.principle.strategy.cash.CashContext;
import com.mutistic.principle.strategy.cash.CashContextAndFacory;
import com.mutistic.principle.strategy.structure.Context;

/**
 * @program 策略模式
 * @description 策略模式是指对一系列的算法定义，并将每一个算法封装起来，而且使它们还可以相互替换。策略模式让算法独立于使用它的客户而独立变化
 * @author mutistic
 * @date 2018年5月14日
 */
public class StrategyPattern {

	public static void main(String[] args) {
		Context.strategyMain();
		System.out.println();
		
		CashContext.strategyCashMain();
		System.out.println();
		
		CashContextAndFacory.strategyCashMain();
		System.out.println();
	}
}
