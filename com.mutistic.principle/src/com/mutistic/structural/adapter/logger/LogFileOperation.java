package com.mutistic.structural.adapter.logger;

import java.util.List;

/**
 * @program 数据库存储日志操作实现类
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class LogFileOperation implements LogFileOpearionApi {

	@Override
	public Integer writeLogFile(LoggerMode mode) {
		return null;
	}

	@Override
	public Integer deleteLogFile(LoggerMode mode) {
		return null;
	}

	@Override
	public List<LoggerMode> readLogFile() {
		return null;
	}

	
}
