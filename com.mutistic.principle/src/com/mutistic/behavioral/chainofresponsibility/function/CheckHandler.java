package com.mutistic.behavioral.chainofresponsibility.function;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteHandler：实现职责的类
 * @description 实现权限控制的职责
 * @author mutisitic
 * @date 2018年9月7日
 */
public class CheckHandler extends SaleHandler {

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
		PrintUtil.three("CheckHandler.sale()", "接收到请求，开始执行权限控制的职责");
		if("AAA".equals(user)) {
			return this.successor.sale(user, customer, model);
		}
		
		PrintUtil.three("没有保存销售信息的权限", user);
		return false;
	}
}
