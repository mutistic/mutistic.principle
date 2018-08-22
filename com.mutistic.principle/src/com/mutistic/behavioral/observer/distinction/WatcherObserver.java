package com.mutistic.behavioral.observer.distinction;

/**
 * @program 水质观测者：观察者接口
 * @description 
 * @author mutisitic
 * @date 2018年8月22日
 */
public interface WatcherObserver {
	
	/**
	 * @description 被通知的方法接口
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @param subject 被观察的目标对象
	 */
	void update(WaterQulitySubject subject);
	
	/**
	 * @description 获取观察者人员的职位接口
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @return
	 */
	String getPosition();
}
