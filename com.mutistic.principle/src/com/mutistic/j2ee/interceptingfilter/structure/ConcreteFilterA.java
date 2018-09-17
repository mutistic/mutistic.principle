package com.mutistic.j2ee.interceptingfilter.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcteteFilter：
 * @description 过滤器，实现过滤器接口，在请求处理程序执行请求之前或之后，执行某些任务功能的具体实现
 * @author mutisitic
 * @date 2018年9月17日
 */
public class ConcreteFilterA implements Filter {

	/**
	 * @description 在请求处理程序执行请求之前或之后，执行某些任务功能的具体实现
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param request 具体请求
	 * @see com.mutistic.j2ee.interceptingfilter.structure.Filter#execute(java.lang.String)
	 */
	public void execute(String request) {
		PrintUtil.three("ConcreteFilterA.request()", "在请求处理程序执行请求之前或之后，执行某些任务功能的具体实现：request = " + request);
	}
}
