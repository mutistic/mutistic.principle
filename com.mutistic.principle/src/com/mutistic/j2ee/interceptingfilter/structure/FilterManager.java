package com.mutistic.j2ee.interceptingfilter.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program FilterManager：
 * @description 过滤管理器，管理过滤器和过滤器链
 * @author mutisitic
 * @date 2018年9月17日
 */
public class FilterManager {
	/** 持有：过滤器链 */
	private FilterChain filterChain = new FilterChain();
	/**
	 * 构造函数：注入目标对象
	 * @param target 目标对象
	 */
	public FilterManager(Target target) {
		PrintUtil.two("FilterManager：构造函数：注入目标对象：", target);
		filterChain.setTarget(target);
	}

	/**
	 * @description 添加过滤器
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param filter 具体的过滤器对象
	 */
	public void addFilter(Filter filter) {
		PrintUtil.two("FilterManager.addFilter()：添加过滤器：", filter);
		filterChain.addFilter(filter);
	}
	/**
	 * @description 转调过滤器链开始执行请求
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param request 具体的请求
	 */
	public void filterRequest(String request) {
		PrintUtil.two("FilterManager.filterRequest()：转调过滤器链开始执行请求：", request);
		filterChain.execute(request);
	}
}
