package com.mutistic.design.abstractfactory.business.factory.impl;

import com.mutistic.design.abstractfactory.business.dao.impl.OrderDetailXmlFileDaoImpl;
import com.mutistic.design.abstractfactory.business.dao.impl.OrderXmlFileDaoImpl;
import com.mutistic.design.abstractfactory.business.factory.IAbstractFactory;
import com.mutistic.design.utils.PrintUtil;

/**
 * @program 抽象工厂模式具体实现工厂
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public class XmlFileFactory implements IAbstractFactory {

	/**
	 * @description XML工厂方法创建：XmlFilDaoImpl
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
			PrintUtil.printThree("抽象工厂模式:XmlFileFactory", "创建OrderXmlFileDaoImpl");
			return new OrderXmlFileDaoImpl();
		} else if ("orderDetail".equals(businessType)) {
			PrintUtil.printThree("抽象工厂模式:XmlFileFactory", "创建OrderDetailXmlFileDaoImpl");
			return new OrderDetailXmlFileDaoImpl();
		}

		return null;
	}

}
