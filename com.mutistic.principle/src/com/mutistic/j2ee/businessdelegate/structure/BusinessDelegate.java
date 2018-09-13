package com.mutistic.j2ee.businessdelegate.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program BusinessDelegate：
 * @description 具体业务代表，一个为客户端实体提供的入口类，它提供了对业务服务方法的访问
 * @author mutisitic
 * @date 2018年9月13日
 */
public class BusinessDelegate {
	/** 持有：查询服务 */
	private LookUpService lookupService = new LookUpService();
	/** 持有：具体的业务服务 */
	private BusinessService businessService;
	/** 业务类型 */
	private String serviceType;
	/**
	 * @description 设置业务类型
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @param serviceType 业务类型
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		PrintUtil.two("BusinessDelegate.setServiceType()：设置业务类型 ", "serviceType = "+serviceType);
	}

	/**
	 * @description 开始访问业务服务
	 * @author mutisitic
	 * @date 2018年9月13日
	 */
	public void doTask() {
		PrintUtil.two("BusinessDelegate.doTask()", "开始访问业务服务");
		businessService = lookupService.creterBusinessService(serviceType);
		if(businessService == null) {
			PrintUtil.three("BusinessDelegate.doTask()", "查找服务没有查找到具体的业务服务，本业务调用结束");
			return;
		}
		businessService.operation();
	}
}
