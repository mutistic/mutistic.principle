package com.mutistic.design.abstractfactory.business.dao.impl;

import com.mutistic.design.abstractfactory.business.dao.IOrderDetailDao;
import com.mutistic.design.utils.PrintUtil;

/**
 * @program OrderDetail产品-XML操作
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public class OrderDetailXmlFileDaoImpl implements IOrderDetailDao {

	/**
	 * @description 产品具体业务-XML操作
	 * @author mutisitic
	 * @date 2018年8月14日
	 */
	@Override
	public void insertOrderDetail() {
		PrintUtil.printThree("产品具体业务:OrderDetailXmlFileDaoImpl", "insertOrderDetail()");
		PrintUtil.println();
	}

}
