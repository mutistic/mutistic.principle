package com.mutistic.behavioral.state.concrete;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteState：
 * @description 具体实现状态处理的类，每个类实现一个状态的具体处理
 * @author mutisitic
 * @date 2018年8月29日
 */
public class ConcreteStateB implements State {

	/**
	 * @description 状态对应的具体处理
	 * @author mutisitic
	 * @date 2018年8月29日
	 * @param param
	 * @see com.mutistic.behavioral.state.structure.State#handle(java.lang.String)
	 */
	@Override
	public void handle(String param) {
		PrintUtil.three("具体实现状态处理的类，每个类实现一个状态的具体处理", "ConcreteStateB.handle()");
	}

}
