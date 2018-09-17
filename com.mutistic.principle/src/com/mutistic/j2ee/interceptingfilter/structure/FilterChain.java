package com.mutistic.j2ee.interceptingfilter.structure;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program FilterChain：
 * @description 过滤器链，带有多个过滤器，并在Target上按照定义的顺序执行这些过滤器
 * @author mutisitic
 * @date 2018年9月17日
 */
public class FilterChain {
	/** 持有：过滤器集合 */
	private List<Filter> filterList = new ArrayList<Filter>();
	/** 持有：目标对象 */
	private Target target;

	/**
	 * @description 添加具体的过滤器 
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param filter 具体的过滤器
	 */
	public void addFilter(Filter filter) {
		filterList.add(filter);
		PrintUtil.three("FilterChain.addFilter()：添加具体的过滤器：", filterList);
	}

	/**
	 * @description 执行过滤器链，转调具体的过滤器
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param request
	 */
	public void execute(String request) {
		PrintUtil.three("FilterChain.execute()：执行过滤器链，转调具体的过滤器：", request);
		for (Filter filter : filterList) {
			filter.execute(request);
		}
		target.execute(request);
	}

	/**
	 * @description 设置目标对象 
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param target 目标对象
	 */
	public void setTarget(Target target) {
		this.target = target;
		PrintUtil.three("FilterChain.setTarget()：设置目标对象 ：", target);
	}
}
