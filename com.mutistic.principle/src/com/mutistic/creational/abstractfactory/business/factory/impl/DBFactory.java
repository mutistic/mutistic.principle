package com.mutistic.creational.abstractfactory.business.factory.impl;

import com.mutistic.creational.abstractfactory.business.dao.impl.OrderDBDaoImpl;
import com.mutistic.creational.abstractfactory.business.dao.impl.OrderDetailDBImpl;
import com.mutistic.creational.abstractfactory.business.factory.IAbstractFactory;
import com.mutistic.utils.PrintUtil;

/**
 * @program 抽象工厂模式具体实现工厂
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public class DBFactory implements IAbstractFactory {

	/**
	 * @description DB工厂方法创建：DBDaoImpl
	 * @author mutisitic
	 * @date 2018年8月14日
	 * @param businessType
	 * @return
	 * @see com.mutistic.design.abstractfactory.business.factory.IAbstractFactory#createrMethod(java.lang.String)
	 */
	@Override
	public Object createrMethod(String businessType) {
		if (null == businessType) {
			return null;
		}

		if ("order".equals(businessType)) {
			PrintUtil.printThree("抽象工厂模式:DBFactory", "创建OrderDBDaoImpl");
			return new OrderDBDaoImpl();
		} else if ("orderDetail".equals(businessType)) {
			PrintUtil.printThree("抽象工厂模式:DBFactory", "创建OrderDetailDBImpl");
			return new OrderDetailDBImpl();
		}

		return null;
	}

}
