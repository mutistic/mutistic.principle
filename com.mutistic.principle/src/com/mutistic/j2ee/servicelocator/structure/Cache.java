package com.mutistic.j2ee.servicelocator.structure;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program Cache：
 * @description 缓存，存储服务的引用，以便复用它们
 * @author mutisitic
 * @date 2018年9月17日
 */
public class Cache {
	/** 持有：服务集合，作为服务缓存对象 */
	private List<Service> serviceList = new ArrayList<Service>();

	/**
	 * @description 从缓存中获取服务
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param jndiName 服务名称
	 * @return 具体的服务
	 */
	public Service getService(String jndiName) {
		for (Service service : serviceList) {
			if (service.getName().equals(jndiName)) {
				PrintUtil.three("Cache.getService()：缓存中存在"+ jndiName +"服务", service);
				return service;
			}
		}
		return null;
	}

	/**
	 * @description 添加服务到缓存中
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param service 具体的服务
	 */
	public void addService(Service service) {
		boolean exists = false;
		
		for (Service temp : serviceList) {
			if (temp.getName().equals(temp.getName())) {
				exists = true;
			}
		}
		
		if (!exists) {
			serviceList.add(service);
			PrintUtil.three("Cache.addService()：成功添加服务到缓存中：", service);
		} else {
			PrintUtil.three("Cache.addService()", "缓存中已经存在该服务，无需重复添加服务");
		}
	}
}
