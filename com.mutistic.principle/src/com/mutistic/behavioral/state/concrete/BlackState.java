package com.mutistic.behavioral.state.concrete;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteState
 * @description 黑名单状态：在状态的处理类里面实现状态维护和状态转换的控制
 * @author mutisitic
 * @date 2018年8月30日
 */
public class BlackState implements VoteState {

	@Override
	public void vote(String name, String item, VoteContext context) {
		PrintUtil.two(name + "的投票项"+item +"，恶意刷票，已经纳入到黑名单", "BlackState");
	}

}
