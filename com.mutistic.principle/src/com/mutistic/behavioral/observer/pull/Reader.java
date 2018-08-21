package com.mutistic.behavioral.observer.pull;

import com.mutistic.utils.PrintUtil;

/**
 * @program 读者：拉模型的观察者具体实现
 * @description
 * @author mutisitic
 * @date 2018年8月21日
 */
public class Reader implements Observer {
	private String name;

	/**
	 * @description 具体的功能
	 * @author mutisitic
	 * @date 2018年8月21日
	 * @param subject 报纸整个对象
	 */
	@Override
	public void update(Subject subject) {
		if(null != subject && subject.getClass() == NewsPaper.class) {
			PrintUtil.three("读者：" + name + "接收到推送的报纸对象，主动拉取报纸内容：", ((NewsPaper)subject).getContent());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
