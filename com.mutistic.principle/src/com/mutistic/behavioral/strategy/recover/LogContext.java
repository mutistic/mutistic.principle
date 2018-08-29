package com.mutistic.behavioral.strategy.recover;

import com.mutistic.utils.PrintUtil;

/**
 * @program Context
 * @description 日志记录的上下文：容错恢复机制
 * @author mutisitic
 * @date 2018年8月29日
 */
public class LogContext {

	/**
	 * @description 记录错误日志的方法，提供客户端使用，转调真是的策略 
	 * @author mutisitic
	 * @date 2018年8月29日
	 * @param msg
	 */
	@SuppressWarnings("unused")
	public void log(String msg) {
		LogStrategy strategy = new DbLog();
		try {
			PrintUtil.two("容错恢复机制：优先记录到数据库中，转调", "DbLog.log()");
			strategy.log(msg);
			int a = 1 / 0; // 制造异常
		} catch (Exception e) {
			strategy = new FileLog();
			PrintUtil.two("容错恢复机制：出现异常记录到文件中，转调", "FileLog.log()");
			strategy.log(msg);
		}
	}
}
