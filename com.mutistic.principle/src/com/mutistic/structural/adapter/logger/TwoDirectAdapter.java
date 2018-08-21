package com.mutistic.structural.adapter.logger;

import java.util.List;

import com.mutistic.utils.PrintUtil;

/**
 * @program 双向适配器
 * @description
 * @author mutisitic
 * @date 2018年8月13日
 */
public class TwoDirectAdapter implements LogDataSourceApi, LogFileOpearionApi {

	private LogDataSourceApi logDataSourceApi;
	private LogFileOpearionApi logFileOpearionApi;

	public TwoDirectAdapter(LogDataSourceApi logDataSourceApi, LogFileOpearionApi logFileOpearionApi) {
		super();
		this.logDataSourceApi = logDataSourceApi;
		this.logFileOpearionApi = logFileOpearionApi;
		
		PrintUtil.three("双向适配器-TwoDirectAdapter()-构造函数：注入logDataSourceApi", logDataSourceApi.getClass());
		PrintUtil.three("双向适配器-TwoDirectAdapter()-构造函数：注入logDataSourceApi", logFileOpearionApi.getClass());
	}

	@Override
	public Integer writeLogFile(LoggerMode mode) {
		logFileOpearionApi.writeLogFile(mode);
		
		PrintUtil.three("logDataSourceApi.writeLogFile()", mode.toString());

		return null;
	}

	@Override
	public Integer deleteLogFile(LoggerMode mode) {
		logFileOpearionApi.deleteLogFile(mode);
		
		PrintUtil.three("logDataSourceApi.deleteLogFile()", mode.toString());
		return null;
	}

	@Override
	public List<LoggerMode> readLogFile() {
		logFileOpearionApi.readLogFile();
		
		PrintUtil.three("logFileOpearionApi.readLogFile()", null);
		return null;
	}

	@Override
	public Integer createrLog(LoggerMode mode) {
		logDataSourceApi.createrLog(mode);
		
		PrintUtil.three("logDataSourceApi.createrLog()", mode.toString());
		return null;
	}

	@Override
	public Integer updateLog(LoggerMode mode) {
		logDataSourceApi.updateLog(mode);
		
		PrintUtil.three("logDataSourceApi.updateLog()", mode.toString());
		return null;
	}

	@Override
	public Integer removeLog(LoggerMode mode) {
		logDataSourceApi.removeLog(mode);
		
		PrintUtil.three("logDataSourceApi.removeLog()", mode.toString());
		return null;
	}

	@Override
	public List<LoggerMode> queryAll() {
		logDataSourceApi.queryAll();
		return null;
	}

}
