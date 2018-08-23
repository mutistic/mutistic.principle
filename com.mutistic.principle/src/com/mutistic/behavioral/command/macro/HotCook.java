package com.mutistic.behavioral.command.macro;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteReceiver
 * @description 热菜厨师
 * @author mutisitic
 * @date 2018年8月23日
 */
public class HotCook implements CookApi {

	/**
	 * @description 具体做菜操作
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param name 菜名
	 * @see com.mutistic.behavioral.command.macro.CookApi#cook(java.lang.String)
	 */
	@Override
	public void cook(String name) {
		PrintUtil.three("热菜师傅已经做好菜品", name);
	}
}
