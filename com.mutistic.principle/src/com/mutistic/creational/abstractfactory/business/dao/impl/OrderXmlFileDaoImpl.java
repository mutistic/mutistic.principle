package com.mutistic.creational.abstractfactory.business.dao.impl;

import com.mutistic.creational.abstractfactory.business.dao.IOrderDao;
import com.mutistic.utils.PrintUtil;

/**
 * @program Order产品-XML操作
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public class OrderXmlFileDaoImpl implements IOrderDao {

	/**
	 * @description 产品具体业务-XML操作
	 * @author mutisitic
	 * @date 2018年8月14日
	 */
	@Override
	public void insertOrder() {
		PrintUtil.three("产品具体业务:OrderDBDaoImpl", "insertOrder()");
		PrintUtil.println();
	}
}
