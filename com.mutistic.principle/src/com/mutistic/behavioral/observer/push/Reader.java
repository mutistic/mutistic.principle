package com.mutistic.behavioral.observer.push;

import com.mutistic.utils.PrintUtil;

/**
 * @program 读者：推模型的观察者具体实现
 * @description
 * @author mutisitic
 * @date 2018年8月21日
 */
public class Reader implements Observer {
	private String name;

	@Override
	public void update(String content) {
		PrintUtil.three("读者：" + name + "接收到推送的报纸内容：", content);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
