package com.mutistic.structural.facade.stock;

import com.mutistic.utils.PrintUtil;

/**
 * @program 股票A 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class StockC {
	
	/**
	 * @description 买 
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public void buy() {
		PrintUtil.three("StockA", "buy");
	}
	
	/**
	 * @description 卖 
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public void seller() {
		PrintUtil.three("StockA", "seller");
	}
}
