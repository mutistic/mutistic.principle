package com.mutistic.behavioral.strategy.recover;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteStrategy
 * @description 将日志记录到数据库的具体策略
 * @author mutisitic
 * @date 2018年8月29日
 */
public class DbLog implements LogStrategy{

	/**
	 * @description 具体的记录日志功能
	 * @author mutisitic
	 * @date 2018年8月29日
	 * @param msg
	 * @see com.mutistic.behavioral.strategy.recover.LogStrategy#log(java.lang.String)
	 */
	@Override
	public void log(String msg) {
		PrintUtil.three("FileLog.log()将日志记录到数据库的具体策略", msg);
	}

}
