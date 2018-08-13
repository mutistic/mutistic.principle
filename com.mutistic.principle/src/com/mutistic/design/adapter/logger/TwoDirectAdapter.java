package com.mutistic.design.adapter.logger;

import java.util.List;

import com.mutistic.design.utils.PrintUtil;

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
		
		PrintUtil.printThree("双向适配器-TwoDirectAdapter()-构造函数：注入logDataSourceApi", logDataSourceApi.getClass());
		PrintUtil.printThree("双向适配器-TwoDirectAdapter()-构造函数：注入logDataSourceApi", logFileOpearionApi.getClass());
	}

	@Override
	public Integer writeLogFile(LoggerMode mode) {
		logFileOpearionApi.writeLogFile(mode);
		
		PrintUtil.printThree("logDataSourceApi.writeLogFile()", mode.toString());

		return null;
	}

	@Override
	public Integer deleteLogFile(LoggerMode mode) {
		logFileOpearionApi.deleteLogFile(mode);
		
		PrintUtil.printThree("logDataSourceApi.deleteLogFile()", mode.toString());
		return null;
	}

	@Override
	public List<LoggerMode> readLogFile() {
		logFileOpearionApi.readLogFile();
		
		PrintUtil.printThree("logFileOpearionApi.readLogFile()", null);
		return null;
	}

	@Override
	public Integer createrLog(LoggerMode mode) {
		logDataSourceApi.createrLog(mode);
		
		PrintUtil.printThree("logDataSourceApi.createrLog()", mode.toString());
		return null;
	}

	@Override
	public Integer updateLog(LoggerMode mode) {
		logDataSourceApi.updateLog(mode);
		
		PrintUtil.printThree("logDataSourceApi.updateLog()", mode.toString());
		return null;
	}

	@Override
	public Integer removeLog(LoggerMode mode) {
		logDataSourceApi.removeLog(mode);
		
		PrintUtil.printThree("logDataSourceApi.removeLog()", mode.toString());
		return null;
	}

	@Override
	public List<LoggerMode> queryAll() {
		logDataSourceApi.queryAll();
		return null;
	}

}
