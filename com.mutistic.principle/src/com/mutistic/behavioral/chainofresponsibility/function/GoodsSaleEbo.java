package com.mutistic.behavioral.chainofresponsibility.function;

import com.mutistic.utils.PrintUtil;

/**
 * @program 商品销售管理的业务处理
 * @description 
 * @author mutisitic
 * @date 2018年9月7日
 */
public class GoodsSaleEbo {

	/**
	 * @description 保存销售信息具体实现 
	 * @author mutisitic
	 * @date 2018年9月7日
	 * @param user
	 * @param customer
	 * @param model
	 * @return
	 * @see com.mutistic.structural.decorator.aop.GoodsSaleEbi#sale(java.lang.String, java.lang.String, com.mutistic.structural.decorator.aop.SaleModel)
	 */
	public boolean sale(String user, String customer, SaleModel model) {
		PrintUtil.two("GoodsSaleEbo.sale()", "商品销售管理的业务处理");
		
		LogHandler log = new LogHandler();
		CheckHandler check = new CheckHandler();
		ValidateHandler validate = new ValidateHandler();
		ConcreteHandler concrete = new ConcreteHandler();
		
		log.setSuccessor(validate);
		validate.setSuccessor(check);
		check.setSuccessor(concrete);
		
		return log.sale(user, customer, model);
	}

}
