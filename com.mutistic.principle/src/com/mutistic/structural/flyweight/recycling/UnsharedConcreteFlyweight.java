package com.mutistic.structural.flyweight.recycling;

import java.util.ArrayList;
import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program UnsharedConcreteFlywelght：非共享的享元实现对象，组合对象
 * @description 
 * @author mutisitic
 * @date 2018年9月3日
 */
public class UnsharedConcreteFlyweight implements Flyweight {

	/**
	 * 记录每个组合对象所包含的叶子对象
	 */
	private List<Flyweight> flyList = new ArrayList<Flyweight>();
	
	
	/**
	 * @description 判断传入的安全实例和权限，是否和享元对象内部状态匹配：递归调用叶子对象的方法
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param secutiryEntity
	 * @param permit
	 * @return
	 * @see com.mutistic.structural.flyweight.composite.Flyweight#math(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean math(String secutiryEntity, String permit) {
		PrintUtil.three("UnsharedConcreteFlyweight.math()", "递归调用叶子对象的方法");
		for (Flyweight fly : flyList) {
			if(fly.math(secutiryEntity, permit)) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public void add(Flyweight fly) {
		PrintUtil.three("UnsharedConcreteFlyweight.add()", "添加叶子节点共享对象："+ fly);
		flyList.add(fly);
	}

}
