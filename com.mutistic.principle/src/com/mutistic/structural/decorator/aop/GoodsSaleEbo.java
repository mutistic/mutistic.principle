package com.mutistic.structural.decorator.aop;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteComponent：具体的组件对象
 * @description 商品销售管理的业务结构的具体实现 
 * @author mutisitic
 * @date 2018年9月7日
 */
public class GoodsSaleEbo implements GoodsSaleEbi {

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
	@Override
	public boolean sale(String user, String customer, SaleModel model) {
		PrintUtil.three("GoodsSaleEbo.sale()", user +"用户成功销售客户"+ customer +"需要的商品"+ model.getGoods() +"，数量"+model.getSaleNum());
		return true;
	}

}
