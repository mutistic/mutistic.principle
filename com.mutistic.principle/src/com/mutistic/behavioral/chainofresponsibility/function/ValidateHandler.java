package com.mutistic.behavioral.chainofresponsibility.function;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteHandler：实现职责的类
 * @description 实现数据校验的职责
 * @author mutisitic
 * @date 2018年9月7日
 */
public class ValidateHandler extends SaleHandler {

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
		PrintUtil.three("ValidateHandler.sale()", "接收到请求，开始执行数据校验的职责");
		
		if(user == null) {
			PrintUtil.three("操作员工不能为空", "不能向下执行");
			return false;
		}
		if(customer == null) {
			PrintUtil.three("购买客户不能为空", "不能向下执行");
			return false;
		}
		if(model == null || model.getGoods() == null) {
			PrintUtil.three("销售商品不能为空", "不能向下执行");
			return false;
		}
		if(model == null || model.getSaleNum() <= 0) {
			PrintUtil.three("销售数量不能小于0", "不能向下执行");
			return false;
		}
		
		return this.successor.sale(user, customer, model);
	}
}
