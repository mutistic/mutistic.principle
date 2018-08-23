package com.mutistic.behavioral.command.revocation;

import com.mutistic.utils.PrintUtil;

/**
 * @program Invoker
 * @description 运算类：真正实现具体的业务
 * @author mutisitic
 * @date 2018年8月23日
 */
public class Operation implements OpeartionApi {

	/**
	 * 运算结果
	 */
	private int result;
	/**
	 * @description 获取运算结果
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @return
	 * @see com.mutistic.behavioral.command.revocation.OpeartionApi#getResult()
	 */
	@Override
	public int getResult() {
		return result;
	}

	/**
	 * @description 加法运算 
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param number
	 * @see com.mutistic.behavioral.command.revocation.OpeartionApi#add(int)
	 */
	@Override
	public void add(int number) {
		result += number;
		PrintUtil.three("运算类进行加法运算：Operation.add()", result);
	}

	/**
	 * @description 减法运算
	 * @author mutisitic
	 * @date 2018年8月23日
	 * @param number
	 * @see com.mutistic.behavioral.command.revocation.OpeartionApi#substract(int)
	 */
	@Override
	public void substract(int number) {
		result -= number;
		PrintUtil.three("运算类进行减法运算：Operation.substract()", result);
	}

}
