package com.mutistic.structural.decorator.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteDecorator：
 * @description 实际的装饰器对象，实现具体要向被装饰对象添加的功能。
 * @author mutisitic
 * @date 2018年9月6日
 */
public class ConcreteComponent extends Component {

	/**
	 * @description 示意组件对象的通用方法的具体实现
	 * @author mutisitic
	 * @date 2018年9月6日
	 * @see com.mutistic.structural.decorator.structure.Component#operation()
	 */
	@Override
	public void operation() {
		PrintUtil.three("ConcreteComponent.operation()", "示意组件对象的通用方法的具体实现");
	}

}
