package com.mutistic.creational.abstractfactory.business;

import com.mutistic.creational.abstractfactory.business.dao.IOrderDao;
import com.mutistic.creational.abstractfactory.business.dao.IOrderDetailDao;
import com.mutistic.creational.abstractfactory.business.factory.SimpleFactory;
import com.mutistic.utils.PrintUtil;

/**
 * @program Client客户端 
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public class Client {

	public static void main(String[] args) {
		PrintUtil.one("使用抽象工厂的具体工厂：DBDaoFactory 创建接口实例：");
		IOrderDao orderDB = (IOrderDao) SimpleFactory.factoryMethod("DB", "order");
		if (null != orderDB) {
			orderDB.insertOrder();
		}
		IOrderDetailDao detailDB = (IOrderDetailDao) SimpleFactory.factoryMethod("DB", "orderDetail");
		if (null != detailDB) {
			detailDB.insertOrderDetail();
		}
		
		PrintUtil.one("使用抽象工厂的具体工厂：XmlFileDaoFactory 创建接口实例：");
		IOrderDao orderXml = (IOrderDao) SimpleFactory.factoryMethod("XML", "order");
		if (null != orderXml) {
			orderXml.insertOrder();
		}
		IOrderDetailDao detailXml = (IOrderDetailDao) SimpleFactory.factoryMethod("XML", "orderDetail");
		if (null != detailXml) {
			detailXml.insertOrderDetail();
		}
	}

}
