package com.mutistic.j2ee.servicelocator.structure;

/**
 * @program Service：
 * @description 服务接口，定义处理请求的服务。对这种服务的引用可以在JNDI服务器中查找到
 * @author mutisitic
 * @date 2018年9月17日
 */
public interface Service {
	/**
	 * @description 定义：获取服务名称接口
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @return 服务名称
	 */
	String getName();

	/**
	 * @description 定义：执行请求接口 
	 * @author mutisitic
	 * @date 2018年9月17日
	 */
	void execute();
}
