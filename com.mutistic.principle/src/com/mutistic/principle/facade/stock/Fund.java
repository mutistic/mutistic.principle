package com.mutistic.principle.facade.stock;

import com.mutistic.utils.PrintUtil;

/**
 * @program 基金 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Fund {
	
	/**
	 * @description 买 
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public void buy() {
		PrintUtil.printThree("Fund", "buy");
	}
	
	/**
	 * @description 卖 
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public void seller() {
		PrintUtil.printThree("Fund", "seller");
	}
}
