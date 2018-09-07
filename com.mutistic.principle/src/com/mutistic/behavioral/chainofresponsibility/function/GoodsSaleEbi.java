package com.mutistic.behavioral.chainofresponsibility.function;

/**
 * @program  Component：组件对象的接口
 * @description 商品销售管理的业务结构 
 * @author mutisitic
 * @date 2018年9月7日
 */
public interface GoodsSaleEbi {

	/**
	 * @description 定义：保存销售信息 
	 * @author mutisitic
	 * @date 2018年9月7日
	 * @param user 操作用户
	 * @param customer 客服
	 * @param model 销售数据
	 * @return
	 */
	boolean sale(String user, String customer, SaleModel model);
}
