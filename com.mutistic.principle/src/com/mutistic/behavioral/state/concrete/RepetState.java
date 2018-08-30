package com.mutistic.behavioral.state.concrete;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteState：
 * @description 重复投票状态：在状态的处理类里面实现状态维护和状态转换的控制
 * @author mutisitic
 * @date 2018年8月30日
 */
public class RepetState implements VoteState {

	/**
	 * @description 具体的状态处理
	 * @author mutisitic
	 * @date 2018年8月30日
	 * @param name
	 * @param item
	 * @param context
	 * @see com.mutistic.behavioral.state.concrete.VoteState#vote(java.lang.String, 
	 * java.lang.String, com.mutistic.behavioral.state.concrete.VoteContext)
	 */
	@Override
	public void vote(String name, String item, VoteContext context) {
		PrintUtil.two(name + "投票项" + item +"，已经投过票，属于重复投票", "RepetState");
		context.getVoteMap().put(name, item);

		if(context.getVoteCountMap().get(name) > 3) {
			PrintUtil.three("在状态的处理类里面实现状态维护和状态转换的控制：下一个状态为：", "SpiteState");
			context.getStateMap().put(name, new SpiteState());
		}
	}
}
