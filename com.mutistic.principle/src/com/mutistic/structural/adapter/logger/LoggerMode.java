package com.mutistic.structural.adapter.logger;

import java.util.Date;

public class LoggerMode {

	private String leave;
	private Date createrTime;
	private String message;
	public String getLeave() {
		return leave;
	}
	public void setLeave(String leave) {
		this.leave = leave;
	}
	public Date getCreaterTime() {
		return createrTime;
	}
	public void setCreaterTime(Date createrTime) {
		this.createrTime = createrTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "LoggerMode [leave=" + leave + ", createrTime=" + createrTime + ", message=" + message + "]";
	}
	
}
