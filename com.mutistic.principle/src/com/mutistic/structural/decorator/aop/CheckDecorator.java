package com.mutistic.structural.decorator.aop;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteDecorator：实际的装饰器对象
 * @description 模拟AOP：实现权限控制
 * @author mutisitic
 * @date 2018年9月7日
 */
public class CheckDecorator extends Decorator {

	/**
	 * 构造函数：注入被装饰的组件对象
	 * @param ebi
	 */
	public CheckDecorator(GoodsSaleEbi ebi) {
		super(ebi);
		PrintUtil.two("CheckDecorator：构造函数：注入被装饰的组件对象", ebi);
	}

	/**
	 * @description 实现权限控制，转调具体的业务接口  
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
		PrintUtil.two("CheckDecorator.sale()", "实现权限控制，转调具体的业务接口");
		if(!"AAA".equals(user)) {
			PrintUtil.three("操作用户没有权限操作", user);
			return false;
		}
		PrintUtil.three("权限验证通过，开始转调具体的业务接口", "this.ebi.sale()");
		return this.ebi.sale(user, customer, model);
	}

}
