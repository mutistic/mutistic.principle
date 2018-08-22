package com.mutistic.behavioral.observer.distinction;

import com.mutistic.utils.PrintUtil;

/**
 * @program 水质观察者：具体的观察者
 * @description
 * @author mutisitic
 * @date 2018年8月22日
 */
public class Watcher implements WatcherObserver {

	/**
	 * 水质观察者的职位
	 */
	private String position;
	
	/**
	 * @description 具体的被通知的方法
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @param subject
	 * @see com.mutistic.behavioral.observer.distinction.WatcherObserver#update(com.mutistic.behavioral.observer.distinction.WaterQulitySubject)
	 */
	@Override
	public void update(WaterQulitySubject subject) {
		PrintUtil.three(position + "获取到通知，当前水质污染级别：", subject.getLevel());
	}

	@Override
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
