package com.mutistic.behavioral.observer.pull;

import java.util.HashSet;
import java.util.Set;

import com.mutistic.behavioral.observer.pull.Observer;
import com.mutistic.utils.PrintUtil;

public class Subject {
	/** 有效的观察者集合 */
	private Set<Observer> observerSet = new HashSet<Observer>();

	/**
	 * @description 注册观察者
	 * @author mutisitic
	 * @date 2018年8月21日
	 * @param observer
	 */
	public void attach(Observer observer) {
		if (null != observer) {
			observerSet.add(observer);
			PrintUtil.two("注册观察者", observer);
		}
	}

	/**
	 * @description 删除观察者
	 * @author mutisitic
	 * @date 2018年8月21日
	 * @param observer
	 */
	public void detach(Observer observer) {
		if (null != observer) {
			observerSet.remove(observer);
			PrintUtil.two("删除观察者", observer);
		}
	}

	/**
	 * @description 通知所有的观察者
	 * @author mutisitic
	 * @date 2018年8月21日
	 */
	protected void notifyObserver(Subject subject) {
		for (Observer observer : observerSet) {
			PrintUtil.two("正在通知观察者", observer);
			observer.update(subject);
		}
	}
}
