package com.mutistic.j2ee.interceptingfilter.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 拦截过滤器模式[Intercepting Filter Pattern]-结构
 * @author mutisitic
 * @date 2018年9月17日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("拦截过滤器模式[Intercepting Filter Pattern]");
		// 创建目标对象
		Target target = new Target();
		// 创建过滤管理器对象，注入目标对象
		FilterManager filterManager = new FilterManager(target);
		// 创建具体的过滤器对象
		Filter fa = new ConcreteFilterA();
		Filter fb = new ConcreteFilterB();
		// 添加过滤器
		filterManager.addFilter(fa);
		filterManager.addFilter(fb);
		// 转调过滤器链开始执行请求
		filterManager.filterRequest("HOME");
	}
}
