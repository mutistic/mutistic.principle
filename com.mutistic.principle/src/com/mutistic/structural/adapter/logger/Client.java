package com.mutistic.structural.adapter.logger;

import java.util.Date;

import com.mutistic.utils.PrintUtil;

/**
 * @program 演示 双向适配器
 * @description 
 * @author mutisitic
 * @date 2018年8月13日
 */
public class Client {

	public static void main(String[] args) {
		
		PrintUtil.printOne("演示 双向适配器");
		LoggerMode mode = new LoggerMode();
		mode.setCreaterTime(new Date());
		mode.setLeave("INFO");
		mode.setMessage("演示双向适配器");
		
		TwoDirectAdapter adapter = new TwoDirectAdapter(new LogDataSource(), new LogFileOperation());
		PrintUtil.println();
		
		// log file method
		adapter.writeLogFile(mode);
		adapter.readLogFile();
		adapter.deleteLogFile(mode);
		
		// db method
		adapter.createrLog(mode);
		adapter.queryAll();
		adapter.updateLog(mode);
		adapter.removeLog(mode);
	}
	
}
