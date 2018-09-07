package com.mutistic.behavioral.chainofresponsibility.function;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteHandler：实现职责的类
 * @description 真正实现具体业务的职责
 * @author mutisitic
 * @date 2018年9月7日
 */
public class ConcreteHandler extends SaleHandler {

	/**
	 * @description 具体权限控制的职责
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
		PrintUtil.three("ConcreteHandler.sale()", user +"用户成功销售客户"+ customer +"需要的商品"+ model.getGoods() +"，数量"+model.getSaleNum());
		return true;
	}
}
