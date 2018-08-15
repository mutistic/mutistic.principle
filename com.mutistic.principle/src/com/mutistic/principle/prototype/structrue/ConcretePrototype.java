package com.mutistic.principle.prototype.structrue;

/**
 * @program ConcretePrototype
 * @description 实现Prototype接口的类，这些类真正实现克隆自身的功能
 * @author mutisitic
 * @date 2018年8月15日
 */
public class ConcretePrototype implements Prototype {

	/**
	 * @description 克隆自身的具体实现
	 * @author mutisitic
	 * @date 2018年8月15日
	 * @return
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Prototype clone() {
		// 创建新的实例对象
		ConcretePrototype clone = new ConcretePrototype();
		// 如果还有属性，这拷贝原属性
		return clone;
	}

}
