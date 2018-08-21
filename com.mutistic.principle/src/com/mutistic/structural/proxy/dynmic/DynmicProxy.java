package com.mutistic.structural.proxy.dynmic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.mutistic.utils.PrintUtil;

/**
 * @program Java动态代理 
 * @description 
 * @author mutisitic
 * @date 2018年8月20日
 */
public class DynmicProxy implements InvocationHandler {

	private OrderApi order = null;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		PrintUtil.two("Java动态实例开始方法调用", null);

		if (method.getName().startsWith("set")) {
			PrintUtil.three("调用Set方法", method.getName());

			if (this.order.getUser() != null && this.order.getUser().equals(args[1])) {
				PrintUtil.three("模拟保护代理功能", method.getName());

				return method.invoke(this.order, args);
			} else {
				PrintUtil.three("无权操作，此时操作user：", args[1]);
			}
		} else {
			PrintUtil.three("调用非Set方法", method.getName());

			return method.invoke(this.order, args);
		}

		return null;
	}

	public OrderApi getProxyInterface(Order order) {
		if (order == null) {
			return null;
		}

		this.order = order;
		OrderApi api = (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(),
				order.getClass().getInterfaces(), this);

		PrintUtil.two("创建OrderApi的Java动态代理实例：", api.getClass());
		return api;
	}

}
