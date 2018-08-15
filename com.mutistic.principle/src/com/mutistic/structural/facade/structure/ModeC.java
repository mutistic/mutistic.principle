package com.mutistic.structural.facade.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program  具体模块 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class ModeC {
	
	/**
	 * @description 具体模块具体业务 
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public void testC() {
		PrintUtil.printTwo("ModeC-testC", "模块：接受Facade对象的委派，真正实现功能，各个模块之前按可能有交互，注意，Facade对象知道各个模块，但是各个模块不应该知道Facade对象");
	}
	
}