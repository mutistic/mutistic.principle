package com.mutistic.structural.decorator.aop;

import java.util.Date;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteDecorator：实际的装饰器对象
 * @description 模拟AOP：实现日志记录
 * @author mutisitic
 * @date 2018年9月7日
 */
public class LogDecorator extends Decorator {

	/**
	 * 构造函数：注入被装饰的组件对象
	 * @param ebi
	 */
	public LogDecorator(GoodsSaleEbi ebi) {
		super(ebi);
		PrintUtil.two("LogDecorator：构造函数：注入被装饰的组件对象", ebi);
	}

	/**
	 * @description 实现日志记录，转调具体的业务接口  
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
		PrintUtil.two("LogDecorator.sale()", new Date() +"："+ user +"用户记录销售客户"+ customer +"需要的商品"+ model.getGoods() +"，数量"+model.getSaleNum());
		return this.ebi.sale(user, customer, model);
	}

}
