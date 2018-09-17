package com.mutistic.j2ee.interceptingfilter.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Target：
 * @description 目标对象，是请求处理的具体程序
 * @author mutisitic
 * @date 2018年9月17日
 */
public class Target {
	/**
	 * @description 请求处理的具体程序
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @param request 具体请求
	 */
	public void execute(String request) {
		PrintUtil.two("Target.execute()：目标对象，是请求处理的具体程序: ", "request = "+ request);
	}
}
