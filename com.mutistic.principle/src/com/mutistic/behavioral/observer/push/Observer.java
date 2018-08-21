package com.mutistic.behavioral.observer.push;

/**
 * @program 观察者：推模型
 * @description 
 * @author mutisitic
 * @date 2018年8月21日
 */
public interface Observer {

	/**
	 * @description 定义通知接口，推送报纸内容
	 * @author mutisitic
	 * @date 2018年8月21日
	 * @param content 报纸内容
	 */
	void update(String content);
}
