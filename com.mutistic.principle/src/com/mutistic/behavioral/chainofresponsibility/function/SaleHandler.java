package com.mutistic.behavioral.chainofresponsibility.function;

import com.mutistic.utils.PrintUtil;

/**
 * @program Handler：定义职责的接口
 * @description 处理多种请求的方式的通用的请求对象
 * @author mutisitic
 * @date 2018年9月7日
 */
public abstract class SaleHandler {
	/**
	 * 持有：后继的职责对象
	 */
	protected SaleHandler successor;
	/**
	 * @description 设置后继的职责对象 
	 * @author mutisitic
	 * @date 2018年9月7日
	 * @param successor 后继的职责对象
	 */
	public void setSuccessor(SaleHandler successor) {
		this.successor = successor;
		PrintUtil.three(this.getClass().getSimpleName()+".setSuccessor()：设置后继的职责对象 ", successor);
	}
	

	/**
	 * @description 定义：保存销售信息 
	 * @author mutisitic
	 * @date 2018年9月7日
	 * @param user 操作用户
	 * @param customer 客服
	 * @param model 销售数据
	 * @return
	 */
	public abstract boolean sale(String user, String customer, SaleModel model);
}
