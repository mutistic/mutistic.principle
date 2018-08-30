package com.mutistic.behavioral.state.database;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteState
 * @description 黑名单状态：数据库来维护状态
 * @author mutisitic
 * @date 2018年8月30日
 */
public class BlackState implements VoteState {

	@Override
	public void vote(String name, String item, VoteContext context) {
		PrintUtil.two(name + "的投票项"+item +"，恶意刷票，已经纳入到黑名单", "BlackState");
	}

}
