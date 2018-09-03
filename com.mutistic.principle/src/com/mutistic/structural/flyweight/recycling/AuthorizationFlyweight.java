package com.mutistic.structural.flyweight.recycling;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteFlyweight：具体的享元实现对象，共享享元对象，叶子节点
 * @description 封装授权数据中重复出现部分的享元对象
 * @author mutisitic
 * @date 2018年9月3日
 */
public class AuthorizationFlyweight implements Flyweight {

	/** 内部状态：安全实体 */
	private String secutiryEntity;
	
	/** 内部状态：权限 */
	private String permit;
	
	/**
	 * 构造函数：传入状态数据
	 * @param secutiryEntity 安全实体
	 * @param permit 权限
	 */
	public AuthorizationFlyweight(String secutiryEntity, String permit) {
		super();
		this.secutiryEntity = secutiryEntity;
		this.permit = permit;
	}

	/**
	 * @description 判断传入的安全实例和权限，是否和享元对象内部状态匹配
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param secutiryEntity 安全实体
	 * @param permit 权限
	 * @return true：匹配，false：不匹配
	 * @see com.mutistic.structural.flyweight.composite.Flyweight#math(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean math(String secutiryEntity, String permit) {
		PrintUtil.three("AuthorizationFlyweight.math()：判断传入的安全实例和权限，是否和享元对象内部状态匹配", 
				"secutiryEntity = "+ secutiryEntity +"，permit = "+ permit+ 
				"| this.secutiryEntity = "+ this.secutiryEntity +"，this.permit = "+ this.permit);
		
		if(this.secutiryEntity == null || this.permit == null) {
			return false;
		}
		
		return this.secutiryEntity.equals(secutiryEntity) && 
				this.permit.equals(permit);
	}

	/**
	 * @description 叶子节点共享享元对象不支持：为Flyweight添加子Flyweight对象 
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param fly
	 * @see com.mutistic.structural.flyweight.composite.Flyweight#add(com.mutistic.structural.flyweight.composite.Flyweight)
	 */
	@Override
	public void add(Flyweight fly) {
		throw new UnsupportedOperationException("AuthorizationFlyweight 叶子节点共享享元对象不支持这个功能");
	}

	@Override
	public String toString() {
		return "AuthorizationFlyweight [secutiryEntity=" + secutiryEntity + ", permit=" + permit + "]"+ "hashCode = "+ hashCode();
	}

}
