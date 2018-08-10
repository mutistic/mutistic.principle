package com.mutistic.design.facade.stock;

import com.mutistic.common.utils.PrintUtil;

/**
 * @program 股票A 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class StockB {
	
	/**
	 * @description 买 
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public void buy() {
		PrintUtil.printThree("StockA", "buy");
	}
	
	/**
	 * @description 卖 
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public void seller() {
		PrintUtil.printThree("StockA", "seller");
	}
}
