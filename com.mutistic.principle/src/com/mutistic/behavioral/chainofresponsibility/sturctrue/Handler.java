package com.mutistic.behavioral.chainofresponsibility.sturctrue;

import com.mutistic.utils.PrintUtil;

/**
 * @program Handler：
 * @description 定义职责的接口，通常在这里定义处理请求的方法，可以在这实现后继链
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
	public abstract void handleRequest();
	
}
