package com.mutistic.creational.prototype.structrue;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client
 * @description 使用原型的客户端，首先要获取到原型实例对象，然后通过原型实例克隆自身来创建新的对象实例
 * @author mutisitic
 * @date 2018年8月15日
 */
public class Client {
	
	/**
	 * 声明需要使用的原型接口对象
	 */
	private Prototype prototype;
	
	/**
	 * 构造函数：传入需要使用的具体原型对象实例
	 * @param prototype
	 */
	public Client(Prototype prototype) {
		super();
		this.prototype = prototype;
	}

	/**
	 * @description 其他业务功能
	 * @author mutisitic
	 * @date 2018年8月15日
	 * @return
	 */
	public Prototype operation() {
		Prototype clone = this.prototype.clone();
		return clone;
	}
	

	public static void main(String[] args) {
		PrintUtil.one("原型模式[Prototype Pattern]");
	
		ConcretePrototype prototye = new ConcretePrototype();
		Client client = new Client(prototye);
		PrintUtil.three("创建原型本身的实例对象: ", "hashCode=" + prototye.hashCode());

		ConcretePrototype clone = (ConcretePrototype) client.operation();
		PrintUtil.three("克隆原型的实例对象: ", "hashCode=" + clone.hashCode());
	}
}
