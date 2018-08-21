package com.mutistic.behavioral.observer.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteObserver：
 * @description 观察者的具体实现对象，用来接收目标的通知，并进行相应的后续处理，比如更新自身的状态以保持和目标的相应对状态一致
 * @author mutisitic
 * @date 2018年8月21日
 */
public class ConcreteObserver implements Observer {

	/** 观察者状态 */
	private String observerState;

	/**
	 * @description 更新功能具体实现
	 * @author mutisitic
	 * @date 2018年8月21日
	 * @param subject 传入目标对象，获取对应的状态值
	 * @see com.mutistic.behavioral.observer.structure.Observer#update(com.mutistic.behavioral.observer.structure.Subject)
	 */
	@Override
	public void update(Subject subject) {
		if (subject != null && subject.getClass() == ConcreteSubject.class) {
			this.observerState = ((ConcreteSubject) subject).getSubjectStatus();
		}
		PrintUtil.three("更新功能：设置观察者状态", observerState);
	}
}
