package com.mutistic.behavioral.mediator.structure;

/**
 * @program Mediator
 * @description 中介者接口。在内部定义各个同事之间交付需要的方法，可以是公共的通讯方法，比如changed方法。也可以是小范围的交互方法。
 * @author mutisitic
 * @date 2018年8月16日
 */
public interface Mediator {

	/**
	 * @description 同事对象在自身改变的时候通知中介者的方法，负责与其他同事之间的交互
	 * @author mutisitic
	 * @date 2018年8月16日
	 * @param colleague 同事对象实例
	 */
	void changed(Colleague colleague);

}
