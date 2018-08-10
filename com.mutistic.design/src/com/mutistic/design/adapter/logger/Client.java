package com.mutistic.design.adapter.logger;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		LoggerMode mode = new LoggerMode();
		mode.setCreaterTime(new Date());
		mode.setLeave("INFO");
		mode.setMessage("演示双向适配器");
		TwoDirectAdapter adapter = new TwoDirectAdapter(new LogDataSource(), new LogFileOperation());
		adapter.writeLogFile(mode);
		adapter.readLogFile();
		adapter.deleteLogFile(mode);
		
		adapter.createrLog(mode);
		adapter.queryAll();
		adapter.updateLog(mode);
		adapter.removeLog(mode);
	}
	
}
