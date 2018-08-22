package com.mutistic.behavioral.observer.distinction;

import java.util.ArrayList;
import java.util.List;

/**
 * @program 水质监测：目标对象
 * @description 
 * @author mutisitic
 * @date 2018年8月22日
 */
public abstract class WaterQulitySubject {
	/**
	 * 保存注册的观察者实例集合
	 */
	protected List<WatcherObserver> obserList = new ArrayList<WatcherObserver>();

	/**
	 * @description 注册观察者
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @param observer 观察者实例
	 */
	public void attach(WatcherObserver observer) {
		obserList.add(observer);
	}

	/**
	 * @description 删除观察者
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @param observer 观察者实例
	 */
	public void detach(WatcherObserver observer) {
		obserList.remove(observer);
	}
	
	/**
	 * @description 通知相应的观察者对象
	 * @author mutisitic
	 * @date 2018年8月22日
	 */
	public abstract void notifyWatchers();
	
	/**
	 * @description 获取水质污染级别
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @return
	 */
	public abstract int getLevel();
}
