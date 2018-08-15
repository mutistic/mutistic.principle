package com.mutistic.structural.adapter.logger;

import java.util.List;

/**
 * @program 数据库存储日志操作接口 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public interface LogDataSourceApi {

	abstract Integer createrLog(LoggerMode mode);
	
	abstract Integer updateLog(LoggerMode mode);
	
	abstract Integer removeLog(LoggerMode mode);
	
	abstract List<LoggerMode> queryAll();
}
