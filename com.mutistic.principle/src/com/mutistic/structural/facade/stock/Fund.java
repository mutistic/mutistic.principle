package com.mutistic.structural.facade.stock;

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
		PrintUtil.three("Fund", "buy");
	}
	
	/**
	 * @description 卖 
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public void seller() {
		PrintUtil.three("Fund", "seller");
	}
}
