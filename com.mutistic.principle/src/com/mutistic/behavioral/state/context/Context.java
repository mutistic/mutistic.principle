package com.mutistic.behavioral.state.context;

import com.mutistic.utils.PrintUtil;

/**
 * @program Context：
 * @description 环境，也称上下文。在上下文当中实现状态维护和状态转换的控制
 * @author mutisitic
 * @date 2018年8月29日
 */
public class Context {
	/** 持有 State状态实例对象 */
	private State state;

	/**
	 * @description 客户端需要的接口方法，转调具体的状态实例功能：在上下文当中实现状态维护和状态转换的控制
	 * @author mutisitic
	 * @date 2018年8月29日
	 * @param param
	 */
	public void request(String param) {
		PrintUtil.two("客户端需要的接口方法，转调具体的状态实例功能", "Context.request()");
		
		// 根据参数创建状态实例对象
		if("ConcreteStateA".equals(param)) {
			state = new ConcreteStateA();
		} else if("ConcreteStateB".equals(param)) {
			state = new ConcreteStateB();
		}
		
		PrintUtil.three("在上下文当中实现状态维护和状态转换的控制，根据参数创建状态实例对象", state);
		// 转调具体的状态实例功能
		if(null != state) {
			state.handle(param);
		}
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
}
