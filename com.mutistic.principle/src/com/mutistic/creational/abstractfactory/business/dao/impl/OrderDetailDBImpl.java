package com.mutistic.creational.abstractfactory.business.dao.impl;

import com.mutistic.creational.abstractfactory.business.dao.IOrderDetailDao;
import com.mutistic.utils.PrintUtil;

/**
 * @program OrderDetail产品-DB操作
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public class OrderDetailDBImpl implements IOrderDetailDao {

	/**
	 * @description 产品具体业务-DB操作
	 * @author mutisitic
	 * @date 2018年8月14日
	 */
	@Override
	public void insertOrderDetail() {
		PrintUtil.printThree("产品具体业务:OrderDetailDBImpl", "insertOrderDetail()");
		PrintUtil.println();
	}

}
