package com.mutistic.behavioral.state.database;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteState：
 * @description 恶意投票状态：数据库维护状态
 * @author mutisitic
 * @date 2018年8月30日
 */
public class SpiteState implements VoteState {

	/**
	 * @description 具体的状态处理
	 * @author mutisitic
	 * @date 2018年8月30日
	 * @param name
	 * @param item
	 * @param context
	 * @see com.mutistic.behavioral.state.concrete.VoteState#vote(java.lang.String,
	 *      java.lang.String, com.mutistic.behavioral.state.concrete.VoteContext)
	 */
	@Override
	public void vote(String name, String item, VoteContext context) {
		PrintUtil.two(name + "投票项" + item +"，经检测属于恶意投票", "SpiteState");
		context.getVoteMap().put(name, item);

		if (context.getVoteCountMap().get(name) > 6) {
			PrintUtil.three("数据库维护状态：下一个状态为：", "SpiteState");
			context.getStateMap().put(name, BlackState.class.getName()); // 数据库存储为 className
			context.getStateMap().put(name, "BlackState"); // 数据库存储为 RepetState 状态值
		}
	}
}
