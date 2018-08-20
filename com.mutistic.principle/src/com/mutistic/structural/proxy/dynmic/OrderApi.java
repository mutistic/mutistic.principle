package com.mutistic.structural.proxy.dynmic;

/**
 * @program 目标接口 
 * @description 
 * @author mutisitic
 * @date 2018年8月20日
 */
public interface OrderApi {

	String getUser();

	void setPrice(Double price, String user);
}
