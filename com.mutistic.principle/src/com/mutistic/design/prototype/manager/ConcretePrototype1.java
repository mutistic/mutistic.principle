package com.mutistic.design.prototype.manager;

/**
 * @program 原型具体类
 * @description 
 * @author mutisitic
 * @date 2018年8月15日
 */
public class ConcretePrototype1 extends Prototype {

	/**
	 * @description 克隆方法的具体实现 
	 * @author mutisitic
	 * @date 2018年8月15日
	 * @return
	 * @see com.mutistic.design.prototype.manager.Prototype#clone()
	 */
	@Override
	public Prototype clone() {
		ConcretePrototype1 clone = new ConcretePrototype1();
		clone.setName(this.getName());
		return clone;
	}

	@Override
	public String toString() {
		return "ConcretePrototype1 [getName()=" + getName() + ",  hashCode() =" + hashCode() + "]";
	}

}
