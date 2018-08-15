package com.mutistic.principle.abstractfactory.business.factory;

/**
 * @program 抽象工厂模式
 * @description 
 * @author mutisitic
 * @date 2018年8月14日
 */
public interface IAbstractFactory {

	/**
	 * @description 抽象工厂创建产品统一接口(合理应该创建 IMapper 用于操作数据)(通过参数实现可扩展性)
	 * @author mutisitic
	 * @date 2018年8月14日
	 * @param businessType
	 * @return
	 */
	Object createrMethod(String businessType);
	
}
