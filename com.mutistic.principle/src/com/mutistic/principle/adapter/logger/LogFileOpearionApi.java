package com.mutistic.principle.adapter.logger;

import java.util.List;

/**
 * @program 数据库存储日志操作接口 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public interface LogFileOpearionApi {

	abstract Integer writeLogFile(LoggerMode mode);
	
	abstract Integer deleteLogFile(LoggerMode mode);
	
	abstract List<LoggerMode> readLogFile();
}
