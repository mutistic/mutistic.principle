package com.mutistic.behavioral.state.concrete;

/**
 * @program State：
 * @description 状态接口。用来封装于上下文的一个特定状态所对应的行为
 * @author mutisitic
 * @date 2018年8月29日
 */
public interface State {

	/**
	 * @description 定义：状态对应的处理接口
	 * @author mutisitic
	 * @date 2018年8月29日
	 * @param param 具体参数
	 */
	void handle(String param);
}
