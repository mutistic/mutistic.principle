package com.mutistic.structural.flyweight.composite;

/**
 * @program Flyweight：享元接口
 * @description 描述授权数据的享元接口
 * @author mutisitic
 * @date 2018年9月3日
 */
public interface Flyweight {

	/**
	 * @description 定义：判断传入的安全实例和权限，是否和享元对象内部状态匹配
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param secutiryEntity 安全实体
	 * @param permit 权限
	 * @return true：匹配，false：不匹配
	 */
	boolean math(String secutiryEntity, String permit);
	
	/**
	 * @description 定义：为Flyweight添加子Flyweight对象 
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param fly 子Flyweight对象
	 */
	void add(Flyweight fly);
}
