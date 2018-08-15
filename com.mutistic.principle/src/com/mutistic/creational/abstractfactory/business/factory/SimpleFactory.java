package com.mutistic.creational.abstractfactory.business.factory;

import com.mutistic.creational.abstractfactory.business.factory.impl.DBFactory;
import com.mutistic.creational.abstractfactory.business.factory.impl.XmlFileFactory;
import com.mutistic.utils.PrintUtil;

/**
 * @program 简单工厂模式
 * @description
 * @author mutisitic
 * @date 2018年8月14日
 */
public class SimpleFactory {

	/**
	 * @description 简单工厂方法创建：DaoImpl
	 * @author mutisitic
	 * @date 2018年8月14日
	 * @param facotryType 创建类型
	 * @param businessType 业务类型
	 * @return
	 */
	public static Object factoryMethod(String facotryType, String businessType) {
		if (null == facotryType || null == businessType) {
			return null;
		}
		
		if ("DB".equals(facotryType)) {
			PrintUtil.printThree("简单工厂模式:factoryMethod", "创建DBFactory");
			return new DBFactory().createrMethod(businessType);
		} else if ("XML".equals(facotryType)) {
			PrintUtil.printThree("简单工厂模式:factoryMethod", "创建XmlFileFactory");
			return new XmlFileFactory().createrMethod(businessType);
		}

		return null;
	}

}
