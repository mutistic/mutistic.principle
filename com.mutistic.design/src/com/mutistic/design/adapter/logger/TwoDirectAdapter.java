package com.mutistic.design.adapter.logger;

import java.util.List;

public class TwoDirectAdapter implements LogDataSourceApi, LogFileOpearionApi {

	private LogDataSourceApi logDataSourceApi;
	private LogFileOpearionApi logFileOpearionApi;
	
	public TwoDirectAdapter(LogDataSourceApi logDataSourceApi, LogFileOpearionApi logFileOpearionApi) {
		super();
		this.logDataSourceApi = logDataSourceApi;
		this.logFileOpearionApi = logFileOpearionApi;
	}

	@Override
	public Integer writeLogFile(LoggerMode mode) {
		logFileOpearionApi.writeLogFile(mode);
		return null;
	}

	@Override
	public Integer deleteLogFile(LoggerMode mode) {
		logFileOpearionApi.deleteLogFile(mode);
		return null;
	}

	@Override
	public List<LoggerMode> readLogFile() {
		logFileOpearionApi.readLogFile();
		return null;
	}

	@Override
	public Integer createrLog(LoggerMode mode) {
		logDataSourceApi.createrLog(mode);
		return null;
	}

	@Override
	public Integer updateLog(LoggerMode mode) {
		logDataSourceApi.updateLog(mode);
		return null;
	}

	@Override
	public Integer removeLog(LoggerMode mode) {
		logDataSourceApi.removeLog(mode);
		return null;
	}

	@Override
	public List<LoggerMode> queryAll() {
		logDataSourceApi.queryAll();
		return null;
	}
	
}
