package com.mutistic.behavioral.memento.revocation;

/**
 * @program 定义Invoker操作运算接口
 * @description 
 * @author mutisitic
 * @date 2018年8月31日
 */
public interface OpeartionApi {

	/**
	 * @description 定义：获取计算结果
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @return
	 */
	int getResult();
	
	/**
	 * @description 定义：加法运算
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param number
	 */
	void add(int number);
	
	/**
	 * @description 定义减法运算
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param number
	 */
	void substract(int number);
	
	/**
	 * @description 定义：创建保存原发器对象的状态的备忘录对象
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @return 创建好的状态的备忘录对象
	 */
	Memento createrMemento();
	
	/**
	 * @description 定义：重新设置原发器对象的状态，让其回到备忘录对象记录的状态
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param memento
	 */
	void setMemento(Memento memento);
}
