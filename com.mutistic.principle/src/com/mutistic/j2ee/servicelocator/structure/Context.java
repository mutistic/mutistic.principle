package com.mutistic.j2ee.servicelocator.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Context：
 * @description 初始的上下文，JNDIContext带有对要查找的服务的引用
 * @author mutisitic
 * @date 2018年9月17日
 */
public class Context {
	/**
	 * @description 查找JNDI服务功能
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param jndiName JNDI服务名称
	 * @return 具体的服务
	 */
	public Service lookup(String jndiName) {
		PrintUtil.three("InitialContext.lookup()：开始根据服务名称查找具体的服务", jndiName);
		
		Service service = null;
		if (jndiName.equals("ConcreteServiceA")) {
			service = new ConcreteServiceA();
			PrintUtil.three("InitialContext.lookup()：开始查找JNDI服务ConcreteServiceA，并创建具体的服务对象", service);
			return service;
		}
		else if (jndiName.equals("ConcreteServiceB")) {
			service = new ConcreteServiceB();
			PrintUtil.three("InitialContext.lookup()：开始查找JNDI服务ConcreteServiceB，并创建具体的服务对象", service);
			return service;
		}
		
		PrintUtil.three("InitialContext.lookup()", "未查询到具体的服务，无法创建服务");
		return service;
	}
}
