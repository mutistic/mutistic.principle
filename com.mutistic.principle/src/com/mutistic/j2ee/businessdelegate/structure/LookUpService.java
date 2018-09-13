package com.mutistic.j2ee.businessdelegate.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program LookUpService：
 * @description 查询服务，查找服务对象负责获取相关的业务服务实现，并提供业务对象对业务代表对象的访问
 * @author mutisitic
 * @date 2018年9月13日
 */
public class LookUpService {
	/**
	 * @description 根据服务类型创建具体的业务服务对象
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @param serviceType 服务类型
	 * @return 具体的业务服务对象
	 */
	public BusinessService creterBusinessService(String serviceType) {
		BusinessService service = null;
		if ("A".equals(serviceType)) {
			service =  new ConcreteServiceA();
		} else if ("B".equals(serviceType)) {
			service = new ConcreteServiceB();
		}
		
		PrintUtil.three("LookUpService.creterBusinessService()：根据服务类型创建具体的业务服务对象", service);
		return service;
	}
}
