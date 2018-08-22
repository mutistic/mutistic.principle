package com.mutistic.behavioral.observer.distinction;

import com.mutistic.utils.PrintUtil;

/**
 * @program 水质监测：具体的目标对象：区别对待观察者
 * @description
 * @author mutisitic
 * @date 2018年8月22日
 */
public class WaterQuality extends WaterQulitySubject {

	/**
	 * 水质污染级别 0-正常，1-轻度污染，2-中度污染，3-重度污染
	 */
	private int level = 0;

	/**
	 * @description 通知相应的观察者对象
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @see com.mutistic.behavioral.observer.distinction.WaterQulitySubject#notifyWatchers()
	 */
	@Override
	public void notifyWatchers() {
		PrintUtil.three("区别对待观察 接收到水质污染级别：", this.getLevel());
		for (WatcherObserver observer : obserList) {
			// 区别对待观察具体实现
			if (level <= 0) {
				if ("监测人员".equals(observer.getPosition())) {
					PrintUtil.three("区别对待观察 正在发送通知，通知观测者为：", observer.getPosition());
					observer.update(this);
				}
			} else if (level <= 1) {
				if ("预警人员".equals(observer.getPosition())) {
					PrintUtil.three("区别对待观察 正在发送通知，通知观测者为：", observer.getPosition());
					observer.update(this);
				}
			} else if (level <= 2) {
				if ("监测部门领导".equals(observer.getPosition())) {
					PrintUtil.three("区别对待观察 正在发送通知，通知观测者为：", observer.getPosition());
					observer.update(this);
				}
			}
		}
	}

	/**
	 * @description 获取水质污染级别
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @return
	 * @see com.mutistic.behavioral.observer.distinction.WaterQulitySubject#getLevel()
	 */
	@Override
	public int getLevel() {
		return level;
	}

	/**
	 * @description 获取水质污染级别
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @param level
	 */
	public void setLevel(int level) {
		this.level = level;
		this.notifyWatchers();
	}

}
