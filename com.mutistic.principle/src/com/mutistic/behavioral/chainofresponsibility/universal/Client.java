package com.mutistic.behavioral.chainofresponsibility.universal;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示：处理多种请求的方式的通用的请求对象
 * @author mutisitic
 * @date 2018年9月7日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("处理多种请求的方式的通用的请求对象");
		Handler h1 = new GeneralHandler();
		Handler h2 = new DeptHandler();
		Handler h3 = new ProjectHandler();
		
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);
		
		FeeRequestModel feeMode = new FeeRequestModel();
		feeMode.setUser("AAA");
		
		feeMode.setFee(300);
		PrintUtil.three(feeMode.getUser()+ "申请金额"+ feeMode.getUser() +"结果为：", (String)h3.handleRequest(feeMode));
		
		feeMode.setFee(500);
		PrintUtil.three(feeMode.getUser()+ "申请金额"+ feeMode.getUser() +"结果为：", (String)h3.handleRequest(feeMode));
		
		feeMode.setFee(1100);
		PrintUtil.three(feeMode.getUser()+ "申请金额"+ feeMode.getUser() +"结果为：", (String)h3.handleRequest(feeMode));

		feeMode.setUser("BBB");
		feeMode.setFee(500);
		PrintUtil.three(feeMode.getUser()+ "申请金额"+ feeMode.getUser() +"结果为：", (String)h3.handleRequest(feeMode));

		feeMode.setUser("CCC");
		feeMode.setFee(1100);
		PrintUtil.three(feeMode.getUser()+ "申请金额"+ feeMode.getUser() +"结果为：", (String)h3.handleRequest(feeMode));

	}
}
