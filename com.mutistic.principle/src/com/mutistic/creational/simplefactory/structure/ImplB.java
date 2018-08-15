package com.mutistic.creational.simplefactory.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program 具体实现API的实现类
 * @description 是简单工厂模式的创建目标
 * @author mutistic
 * @date 2018年5月14日
 */
public class ImplB extends API {

	/**
	 * 具体实现
	 */
	@Override
	public void operation() {
		PrintUtil.printTwo("ImplB", "具体实现API的实现类，可能会有多个。简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例");
	}
	
}