package com.mutistic.behavioral.observer.java;

import java.util.Observable;
import java.util.Observer;

import com.mutistic.utils.PrintUtil;

/**
 * @program 读者：具体的观察者
 * @description
 * @author mutisitic
 * @date 2018年8月22日
 */
public class Reader implements Observer {

	/**
	 * 读者姓名
	 */
	private String name;

	@Override
	public void update(Observable o, Object arg) {
		PrintUtil.three(name +"接收到推动的报纸，通过拉模型获取到的报纸的具体内容是", arg);
		PrintUtil.three(name +"接收到推动的报纸，通过拉模型获取到的报纸的具体内容是", ((NewsPaper)o).getContent());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
