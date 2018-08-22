package com.mutistic.behavioral.observer.java;

import java.util.Observable;

import com.mutistic.utils.PrintUtil;

/**
 * @program 报纸：具体的目标
 * @description
 * @author mutisitic
 * @date 2018年8月22日
 */
public class NewsPaper extends Observable {
	/**
	 * 报纸内容
	 */
	private String content;

	public String getContent() {
		return content;
	}

	/**
	 * @description 设置报纸的内容：推动所有的观察者
	 * @author mutisitic
	 * @date 2018年8月22日
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
		// Java的Observer模式，需要显示调用 setChanged() 方法
		this.setChanged();
		
		PrintUtil.two("使用推模型-开始通知所有的观察者", "this.notifyObservers(this.content)");
		PrintUtil.two("使用拉模型-开始通知所有的观察者", "this.notifyObservers()");
		
		// 使用推模型
		this.notifyObservers(this.content);
		// 使用拉模型
		this.notifyObservers();
	}

}
