package com.mutistic.behavioral.observer.pull;

/**
 * @program 观察者：拉模型
 * @description 
 * @author mutisitic
 * @date 2018年8月21日
 */
public interface Observer {

	/**
	 * @description 定义通知接口
	 * @author mutisitic
	 * @date 2018年8月21日
	 * @param subject 报纸整个对象
	 */
	void update(Subject subject);
}
