package com.mutistic.j2ee.businessdelegate.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Clinet：
 * @description 客户端，表示层代码可以是 JSP、Servlet 或 UI java 代码。
 * @author mutisitic
 * @date 2018年9月13日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("业务代表模式[Business Delegate Pattern]-结构");
		// 创建业务代表对象
		BusinessDelegate delegate = new BusinessDelegate();
		
		// 设置业务类型
		delegate.setServiceType("A");
		delegate.doTask();
		
		// 设置业务类型
		delegate.setServiceType("B");
		delegate.doTask();
		
		// 设置业务类型
		delegate.setServiceType("C");
		delegate.doTask();
	}
}
