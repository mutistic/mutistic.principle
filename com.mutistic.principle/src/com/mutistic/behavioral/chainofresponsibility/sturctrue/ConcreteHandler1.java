package com.mutistic.behavioral.chainofresponsibility.sturctrue;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteHandler：
 * @description 实现职责的类，在这个类里面，实现对它职责范围内请求的处理，如果不处理，就继续转发请求给后继者
 * @author mutisitic
 * @date 2018年9月7日
 */
public class ConcreteHandler1 extends Handler {
	/**
	 * @description 示意处理请求方法（入参和返回值根据具体的需求） 的具体实现
	 * @author mutisitic
	 * @date 2018年9月7日
	 * @see com.mutistic.behavioral.chainofresponsibility.sturctrue.Handler#handleRequest()
	 */
	@Override
	public void handleRequest() {
		PrintUtil.two("ConcreteHandler1.handleRequest()", "处理其职责范围内的请求");
		
		if(this.successor != null) {
			PrintUtil.three("非本身的职责范围内的请求，转发给后继职责对象处理", this.successor.getClass().getSimpleName()+".handleRequest()");
			this.successor.handleRequest();
		}
	}
}
