package com.mutistic.behavioral.observer.structure;

/**
 * @program Observer：
 * @description 定义观察者的接口，提供目标通知时对应的更新方法，这个更新方法进行相应的业务处理，可以在这个方法里面回调目标对象，以获取目标对象的数据
 * @author mutisitic
 * @date 2018年8月21日
 */
public interface Observer {
	/**
	 * @description 定义更新功能接口 
	 * @author mutisitic 
	 * @date 2018年8月21日
	 * @param subject 传入目标对象，获取对应的状态值
	 */
	void update(Subject subject);
}
