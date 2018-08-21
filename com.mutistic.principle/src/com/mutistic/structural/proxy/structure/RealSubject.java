package com.mutistic.structural.proxy.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program RealSubject
 * @description 具体的目标对象，真正实现目标接口要求的功能
 * @author mutisitic
 * @date 2018年8月17日
 */
public class RealSubject implements Subject {

	/**
	 * @description 业务功能实现
	 * @author mutisitic
	 * @date 2018年8月17日
	 * @see com.mutistic.structural.proxy.structure.Subject#request()
	 */
	@Override
	public void request() {
		PrintUtil.three("RealSubject具体的目标对象开始执行业务：", "realSubject.request()");
	}

}
