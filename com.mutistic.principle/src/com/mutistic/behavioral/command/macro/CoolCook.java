package com.mutistic.behavioral.command.macro;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteReceiver
 * @description 凉菜厨师
 * @author mutisitic
 * @date 2018年8月23日
 */
public class CoolCook implements CookApi {

	/**
	 * @description 具体做菜操作
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param name 菜名
	 * @see com.mutistic.behavioral.command.macro.CookApi#cook(java.lang.String)
	 */
	@Override
	public void cook(String name) {
		PrintUtil.three("凉菜师傅已经做好菜品", name);
	}

}
