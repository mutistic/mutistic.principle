package com.mutistic.behavioral.chainofresponsibility.universal;

import com.mutistic.utils.PrintUtil;

/**
 * @program Handler：定义职责的接口
 * @description 处理多种请求的方式的通用的请求对象
 * @author mutisitic
 * @date 2018年9月7日
 */
public abstract class Handler {
	/**
	 * 持有：后继的职责对象
	 */
	protected Handler successor;
	/**
	 * @description 设置后继的职责对象 
	 * @author mutisitic
	 * @date 2018年9月7日
	 * @param successor 后继的职责对象
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
		PrintUtil.two(this.getClass().getSimpleName()+".setSuccessor()：设置后继的职责对象 ", successor);
	}
	
	/**
	 * @description 定义：示意处理请求方法（入参和返回值根据具体的需求） 
	 * @author mutisitic
	 * @date 2018年9月7日
	 */
	public Object handleRequest(RequestModel model) {
		if(successor != null) {
			return successor.handleRequest(model);
		}
		
		PrintUtil.two("Handler.handleRequest()", "没有后续处理或不支持请求的");
		return false;
	}
	
}
