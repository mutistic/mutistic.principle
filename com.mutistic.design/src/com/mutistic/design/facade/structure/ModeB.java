package com.mutistic.design.facade.structure;

import com.mutistic.common.utils.PrintUtil;

/**
 * @program  具体模块
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class ModeB {

	/**
	 * @description 具体模块具体业务 
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public void testB() {
		PrintUtil.printTwo("ModeB-testB", "模块：接受Facade对象的委派，真正实现功能，各个模块之前按可能有交互，注意，Facade对象知道各个模块，但是各个模块不应该知道Facade对象");
	}
	
}