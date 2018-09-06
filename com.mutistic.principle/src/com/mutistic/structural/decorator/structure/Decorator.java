package com.mutistic.structural.decorator.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Decorator：
 * @description 所有装饰器的抽象父类，需要定义一个与组件接口一致的接口，并持有一个Component对象，其实就是持有一个被装饰的对象。
 * 注意这个被装饰的对象不一定是最原始的那个对象了，也可能是被其它装饰器装饰过后的对象，实现的同一个接口，也就是同一类型。
 * @author mutisitic
 * @date 2018年9月6日
 */
public class Decorator extends Component {
	/** 持有组件对象 */
	private Component component;
	/**
	 * 构造函数：传入具体的组件对象
	 * @param component 具体的组件对象
	 */
	public Decorator(Component component) {
		super();
		this.component = component;
	}

	/**
	 * @description 负责转发给具体的组件对象，可以在转发前后添加附加功能 
	 * @author mutisitic
	 * @date 2018年9月6日
	 * @see com.mutistic.structural.decorator.structure.Component#operation()
	 */
	@Override
	public void operation() {
		PrintUtil.three("Decorator.operation()", "负责转发给具体的组件对象，可以在转发前后添加附加功能 ");
		component.operation();
		PrintUtil.three("Decorator.operation()", "转发结束");
	}
}
