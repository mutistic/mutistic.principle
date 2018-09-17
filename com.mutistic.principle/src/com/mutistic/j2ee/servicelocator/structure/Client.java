package com.mutistic.j2ee.servicelocator.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端，是通过ServiceLocator调用服务的对象
 * @description 演示：服务定位器模式[Service Locator Pattern]-结构
 * @author mutisitic
 * @date 2018年9月17日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("服务定位器模式[Service Locator Pattern]");
		
		// 从服务定位器中获取服务
		Service service = ServiceLocator.getService("ConcreteServiceA");
		service.execute();
		
		service = ServiceLocator.getService("ConcreteServiceB");
		service.execute();
		
		service = ServiceLocator.getService("ConcreteServiceA");
		service.execute();
		
		service = ServiceLocator.getService("ConcreteServiceC");
		if(service != null) {
			service.execute();
		} else {
			PrintUtil.three("没有符合服务名称为ConcreteServiceC的服务，调用结束", service);
		}
	}
}
