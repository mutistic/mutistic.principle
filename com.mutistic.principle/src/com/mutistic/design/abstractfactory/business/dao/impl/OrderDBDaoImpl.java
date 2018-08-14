package com.mutistic.design.abstractfactory.business.dao.impl;

import com.mutistic.design.abstractfactory.business.dao.IOrderDao;
import com.mutistic.design.utils.PrintUtil;

/**
 * @program Order产品-DB操作
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public class OrderDBDaoImpl implements IOrderDao{

	/**
	 * @description 产品具体业务-DB操作
	 * @author mutisitic
	 * @date 2018年8月14日
	 */
	@Override
	public void insertOrder() {
		PrintUtil.printThree("产品具体业务: OrderDBDaoImpl", "insertOrder()");		
		PrintUtil.println();
	}

}
