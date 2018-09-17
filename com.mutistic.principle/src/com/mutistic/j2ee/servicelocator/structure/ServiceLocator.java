package com.mutistic.j2ee.servicelocator.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ServiceLocator：
 * @description 服务定位器，是通过JNDI查找和缓存服务来获取服务的单点接触
 * @author mutisitic
 * @date 2018年9月17日
 */
public class ServiceLocator {
	/** 持有：缓存对象  */
	private static Cache cache = new Cache();

	/**
	 * @description 从缓存中获取服务对象
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param jndiName 服务名称
	 * @return 具体的服务对象
	 */
	public static Service getService(String jndiName) {
		PrintUtil.two("ServiceLocator.getService()：开始从缓存中获取服务对象", jndiName);
		
		Service service = cache.getService(jndiName);
		if (service != null) {
			PrintUtil.three("ServiceLocator.getService()：成功从缓存中获取到服务镀锡", service);
			return service;
		}

		Context context = new Context();
		service = context.lookup(jndiName);
		if(service != null) {
			PrintUtil.three("ServiceLocator.getService()：缓存中不存在"+jndiName+"服务，开始创建服务", service);
			cache.addService(service);
		} else {
			PrintUtil.three("ServiceLocator.getService()：没有符合服务名称为"+jndiName+"的服务", service);
		}
		
		return service;
	}
}
