package com.mutistic.behavioral.state.concrete;

/**
 * @program State
 * @description 投票状态接口
 * @author mutisitic
 * @date 2018年8月30日
 */
public interface VoteState {

	/**
	 * @description 定义：处理状态对应的行为接口
	 * @author mutisitic
	 * @date 2018年8月30日
	 * @param name 投票人
	 * @param item 投票项
	 * @param context 投票上下文
	 */
	void vote(String name, String item, VoteContext context);
}
