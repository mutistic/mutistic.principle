package com.mutistic.behavioral.chainofresponsibility.function;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端 
 * @description 演示：功能链
 * @author mutisitic
 * @date 2018年9月7日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("功能链");
		GoodsSaleEbo ebo = new GoodsSaleEbo();
		SaleModel model = new SaleModel("商品1", 100);
		
		ebo.sale("AAA", "客户1", model);
		ebo.sale("BBB", "客户1", model);
		ebo.sale(null, "客户1", model);
		ebo.sale("AAA", null, model);
		ebo.sale("AAA", "客户1", null);
	}
}
