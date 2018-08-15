package com.mutistic.principle.facade.stock;

import com.mutistic.utils.PrintUtil;

/**
 * @program 客户 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Customer {
	
	public static void main(String[] args) {
		PrintUtil.printOne("花光所有的money买股票......");
		StockFacade facade = new StockFacade();
		facade.buy();
		
		PrintUtil.printOne("药丸了，赶紧卖股票......");
		facade.seller();
	}
	
}
