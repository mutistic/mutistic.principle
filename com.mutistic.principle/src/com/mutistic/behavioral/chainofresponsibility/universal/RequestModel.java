package com.mutistic.behavioral.chainofresponsibility.universal;

/**
 * @program 请求对象
 * @description 处理多种请求的方式的通用的请求对象
 * @author mutisitic
 * @date 2018年9月7日
 */
public class RequestModel {
	/**
	 * 请求类型
	 */
	private String type;

	public String getType() {
		return type;
	}

	public RequestModel(String type) {
		super();
		this.type = type;
	}

}
