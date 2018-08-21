package com.mutistic.behavioral.observer.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteSubject：
 * @description 具体的目标实现对象，用来维护目标状态，当目标对象的状态发生改变时，通知所有注册有效的观察者，让观察者执行相应的处理
 * @author mutisitic
 * @date 2018年8月21日
 */
public class ConcreteSubject extends Subject {

	/** 目标对象状态 */
	private String subjectStatus;

	public String getSubjectStatus() {
		return subjectStatus;
	}

	/**
	 * @description 目标状态发生变化时，通知所有的观察者
	 * @author mutisitic
	 * @date 2018年8月21日
	 * @param subjectStatus
	 */
	public void setSubjectStatus(String subjectStatus) {
		this.subjectStatus = subjectStatus;

		PrintUtil.two("目标状态发生变化时，通知所有的观察者", subjectStatus);
		this.notifyObserver();
	}

}
