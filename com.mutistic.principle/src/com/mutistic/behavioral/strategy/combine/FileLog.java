package com.mutistic.behavioral.strategy.combine;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteStrategy
 * @description 将日志记录到文件中的具体策略
 * @author mutisitic
 * @date 2018年8月29日
 */
public class FileLog extends LogStrategyTemplate {

	/**
	 * @description 具体的记录日志功能
	 * @author mutisitic
	 * @date 2018年8月29日
	 * @param msg
	 * @see com.mutistic.behavioral.strategy.recover.LogStrategy#log(java.lang.String)
	 */
	@Override
	public void doLog(String msg) {
		PrintUtil.three("策略模式结合模板模式：FileLog.log()将日志记录到文件中的具体策略", msg);
	}

}
