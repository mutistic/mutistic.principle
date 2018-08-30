package com.mutistic.behavioral.state.database;

import java.util.HashMap;
import java.util.Map;

/**
 * @program Context
 * @description 投票上下文：数据库维护状态
 * @author mutisitic
 * @date 2018年8月30日
 */
public class VoteContext {

	/**
	 * 记录每个用户对应的状态处理：数据库维护状态：存储className或state状态值
	 */
	private Map<String, String> stateMap = new HashMap<String, String>();
	
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
		String stateValue = stateMap.get(name);
		VoteState state = new NormalState();
		if(stateValue != null) {
			// 使用 ClassName方式 反射状态对象
			try {
				state = (VoteState) Class.forName(stateValue).newInstance();
			} catch (Exception e) { }
			
			// 使用 状态值 创建对应的 状态对象
			if("RepetState".equals(stateValue)) {
				state = new RepetState();
			} else if("SpiteState".equals(stateValue)) {
				state = new SpiteState();
			} else if("BlackState".equals(stateValue)) {
				state = new BlackState();
			}
		}
		
		// 转调真正的投票功能
		state.vote(name, item, this);
	}
	
	public Map<String, String> getVoteMap() {
		return voteMap;
	}

	public Map<String, String> getStateMap() {
		return stateMap;
	}

	public Map<String, Integer> getVoteCountMap() {
		return voteCountMap;
	}

}
