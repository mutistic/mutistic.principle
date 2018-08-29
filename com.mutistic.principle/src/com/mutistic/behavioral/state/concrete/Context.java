package com.mutistic.behavioral.state.concrete;

import com.mutistic.utils.PrintUtil;

/**
 * @program Context：
 * @description 环境，也称上下文。通常用来定义客户端需要的接口，同时维护一个具体处理当前状态的实例对象
 * @author mutisitic
 * @date 2018年8月29日
 */
public class Context {
	/** 持有 State状态实例对象 */
	private State state;

	/**
	 * @description 客户端需要的接口方法，转调具体的状态实例功能
	 * @author mutisitic
	 * @date 2018年8月29日
	 * @param param
	 */
	public void request(String param) {
		PrintUtil.three("Context.request()客户端需要的接口方法，转调具体的状态实例功能", state);
		state.handle(param);
	}
	
	/**
	 * @description 获取状态对象 
	 * @author mutisitic
	 * @date 2018年8月29日
	 * @return
	 */
	public State getState() {
		return state;
	}

	/**
	 * @description 设置状态对象
	 * @author mutisitic
	 * @date 2018年8月29日
	 * @param state
	 */
	public void setState(State state) {
		this.state = state;
		PrintUtil.two("Context.setState()设置具体的状态实例", state);
	}
	
}
