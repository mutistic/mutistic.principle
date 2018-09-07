package com.mutistic.structural.decorator.aop;

/**
 * @program Decorator：所有装饰器的抽象父类
 * @description 装饰GoodsSaleEbi接口
 * @author mutisitic
 * @date 2018年9月7日
 */
public abstract class Decorator implements GoodsSaleEbi {
	/**
	 * 持有被装饰的组件对象
	 */
	protected GoodsSaleEbi ebi;
	/**
	 * 构造函数：注入被装饰的组件对象
	 * @param ebi
	 */
	public Decorator(GoodsSaleEbi ebi) {
		this.ebi = ebi;
	}

}
