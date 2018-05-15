package com.mutistic.design.mode02;

import com.mutistic.design.mode02.cash.CashContext;
import com.mutistic.design.mode02.cash.CashContextAndFacory;
import com.mutistic.design.mode02.structure.Context;

/**
 * @program 策略模式
 * @description 策略模式是指对一系列的算法定义，并将每一个算法封装起来，而且使它们还可以相互替换。策略模式让算法独立于使用它的客户而独立变化
 * @author yc.yin
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
