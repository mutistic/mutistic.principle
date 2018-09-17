package com.mutistic.j2ee.interceptingfilter.structure;

/**
 * @program Filter：
 * @description 过滤器，在请求处理程序执行请求之前或之后，执行某些任务
 * @author mutisitic
 * @date 2018年9月17日
 */
public interface Filter {
   
	/**
	 * @description 定义：在请求处理程序执行请求之前或之后，执行某些任务的统一接口
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param request 具体请求
	 */
	void execute(String request);
	
}

