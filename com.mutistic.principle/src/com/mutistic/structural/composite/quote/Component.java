package com.mutistic.structural.composite.quote;

import java.util.List;

/**
 * @program Component
 * @description 抽象的组件对象。父组件引用
 * @author mutisitic
 * @date 2018年8月27日
 */
public abstract class Component {
	/**
	 * 持有父组件对象引用
	 */
	private Component parent = null;
	
	/**
	 * @description 获父组件对象引用
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @return
	 */
	public Component getParent() {
		return parent;
	}
	
	/**
	 * @description 设置父组件对象引用
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @param parent
	 */
	public void setParent(Component parent) {
		this.parent = parent;
	}
	
	/**
	 * @description 获取所有子组件对象集合
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @return
	 */
	public List<Component> getChildrend(){
		throw new UnsupportedOperationException("Component对象不支持addChild()方法");
	}
	
	/**
	 * @description 示意方法，子组件对象可能有的功能方法 
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @param prefix
	 */
	public abstract void opeartion(String prefix);
	
	/**
	 * @description 向组合对象中加入组件对象
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @param child 被加入组合对象中的组件对象
	 */
	public void addChild(Component child) {
		// 默认的实现，抛出异常，叶子对象或子组件未重写该方法时，Component对象本身不支持该方法
		throw new UnsupportedOperationException("Component对象不支持addChild()方法");
	}
	
	/**
	 * @description 从组合对象中移除组件对象
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @param child 被移除组件对象
	 */
	public void removeChild(Component child) {
		// 默认的实现，抛出异常，叶子对象或子组件未重写该方法时，Component对象本身不支持该方法
		throw new UnsupportedOperationException("Component对象不支持removeChild()方法");
	}
	
	/**
	 * @description 获取某个索引对应的组件对象
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @param index 索引
	 * @return 索引对应的组件对象
	 */
	public Component getChildrend(int index) {
		// 默认的实现，抛出异常，叶子对象或子组件未重写该方法时，Component对象本身不支持该方法
		throw new UnsupportedOperationException("Component对象不支持getChildrend()方法");
	}
	
	/**
	 * @description 获取value 
	 * @author mutisitic
	 * @date 2018年8月27日
	 * @return
	 */
	public String getValue() {
		throw new UnsupportedOperationException("Component对象不支持getValue()方法");
	}
	
}
