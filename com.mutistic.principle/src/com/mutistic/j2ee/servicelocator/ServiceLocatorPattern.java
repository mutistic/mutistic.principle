package com.mutistic.j2ee.servicelocator;

import com.mutistic.utils.PrintUtil;

/**
 * @program 服务定位器模式[Service Locator Pattern]
 * @description 
 * @author mutisitic
 * @date 2018年9月17日
 */
public class ServiceLocatorPattern {
	public static void main(String[] args) {
		PrintUtil.ln("服务定位器模式[Service Locator Pattern]");
		PrintUtil.ln("一、定义、本质:\r\n" + 
				"\r\n" + 
				"定义: 使用JNDI查询定位各种服务的时候。考虑到为某个服务查找JNDI的代价很高，服务定位器模式充分利用了缓存技术。\r\n" + 
				"在首次请求某个服务时，服务定位器在JNDI中查找服务，并缓存该服务对象。当再次请求相同的服务时，\r\n" + 
				"服务定位器会在它的缓存中查找，这样可以在很大程度上提高应用程序的性能\r\n" + 
				"本质: 缓存服务\r\n" + 
				"\r\n" + 
				"二、结构和说明:\r\n" + 
				"\r\n" + 
				"Service：服务接口，定义处理请求的服务。对这种服务的引用可以在JNDI服务器中查找到\r\n" + 
				"\r\n" + 
				"ConcreteService：具体服务，实现服务接口，处理请求的服务的具体实现\r\n" + 
				"\r\n" + 
				"Context：初始的上下文，JNDIContext带有对要查找的服务的引用\r\n" + 
				"\r\n" + 
				"ServiceLocator：服务定位器，是通过JNDI查找和缓存服务来获取服务的单点接触\r\n" + 
				"\r\n" + 
				"Cache：缓存，存储服务的引用，以便复用它们\r\n" + 
				"\r\n" + 
				"Client：客户端，是通过ServiceLocator调用服务的对象\r\n" + 
				"");
	}
}
