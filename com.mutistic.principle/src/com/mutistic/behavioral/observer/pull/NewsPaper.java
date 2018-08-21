package com.mutistic.behavioral.observer.pull;

/**
 * @program 报纸
 * @description 
 * @author mutisitic
 * @date 2018年8月21日
 */
public class NewsPaper extends Subject {

	/**
	 * 报纸的具体内容
	 */
	private String content;

	public String getContent() {
		return content;
	}
	
	/**
	 * @description 报纸的内容发生变法，通知所有的观察者
	 * @author mutisitic
	 * @date 2018年8月21日
	 * @param subjectStatus
	 */
	public void setContent(String content) {
		this.content = content;
		notifyObserver(this);
	}
	
}
