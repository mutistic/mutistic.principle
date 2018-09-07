package com.mutistic.behavioral.chainofresponsibility.universal;

/**
 * @program 持有申请报销金额的请求数据 
 * @description 
 * @author mutisitic
 * @date 2018年9月7日
 */
public class FeeRequestModel extends RequestModel {

	public final static String FEE_TYPE = "fee";
	
	/**
	 * 申请人
	 */
	private String user;
	/**
	 * 申请金额
	 */
	private double fee;
	
	public FeeRequestModel() {
		super(FEE_TYPE);
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
}
