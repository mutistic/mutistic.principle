package com.mutistic.behavioral.chainofresponsibility.function;

import java.util.Date;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteHandler：实现职责的类
 * @description 实现用户登录的职责，职责链入口
 * @author mutisitic
 * @date 2018年9月7日
 */
public class LoginHandler extends SaleHandler {

	/**
	 * @description 具体日志记录的职责
	 * @author mutisitic
	 * @date 2018年9月7日
	 * @param user
	 * @param customer
	 * @param model
	 * @return
	 * @see com.mutistic.behavioral.chainofresponsibility.function.SaleHandler#sale(java.lang.String, java.lang.String, com.mutistic.structural.decorator.aop.SaleModel)
	 */
	@Override
	public boolean sale(String user, String customer, SaleModel model) {
		PrintUtil.two("LoginHandler.sale()", new Date() +"："+ user +"用户开始记录销售客户"+ customer +"需要的商品"+ 
				(model == null ? "" : model.getGoods()) +"，数量"+ (model == null ? "" : model.getSaleNum()));
		return this.successor.sale(user, customer, model);
	}
}
