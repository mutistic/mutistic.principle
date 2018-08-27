package com.mutistic.behavioral.strategy.structure;

/**
 * @program Strategy：
 * @description 策略接口。用来约束一系列具体的策略算法。Context使用这个接口来调用具体的策略实现定义的算法
 * @author mutistic
 * @date 2018年8月27日
 */
public interface Strategy {

	/**
	 * @description 定义：某个算法的接口，参数或返回值根据具体的需求
	 * @author mutistic
	 * @date 2018年8月27日
	 */
	void algorithmInterface();
	
}
