package com.mutistic.behavioral.state.concrete;

import java.util.HashMap;
import java.util.Map;

/**
 * @program Context
 * @description 投票上下文
 * @author mutisitic
 * @date 2018年8月30日
 */
public class VoteContext {

	/**
	 * 记录每个用户对应的状态处理
	 */
	private Map<String, VoteState> stateMap = new HashMap<String, VoteState>();
	
	/**
	 * 记录每个用户投票结果
	 */
	private Map<String, String> voteMap = new HashMap<String, String>();

	/**
	 * 记录每个用户投票次数
	 */
	private Map<String, Integer> voteCountMap = new HashMap<String, Integer>();
	
	/**
	 * @description 投票：转调真正的投票具体功能
	 * @author mutisitic
	 * @date 2018年8月30日
	 * @param name
	 * @param item
	 */
	public void vote(String name, String item) {
		// 记录当前用户投票数
		Integer count = voteCountMap.get(name);
		voteCountMap.put(name, count == null ? 0 : count+1);
		
		// 获取当前用户投票状态
		VoteState state = stateMap.get(name);
		if(state == null) {
			state = new NormalState();
		}
		
		// 转调真正的投票功能
		state.vote(name, item, this);
	}
	
	public Map<String, String> getVoteMap() {
		return voteMap;
	}

	public Map<String, VoteState> getStateMap() {
		return stateMap;
	}

	public Map<String, Integer> getVoteCountMap() {
		return voteCountMap;
	}

}
