package com.mutistic.behavioral.chainofresponsibility.universal;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteHandler：实现职责的类
 * @description 实现部门处理费用申请的职责
 * @author mutisitic
 * @date 2018年9月7日
 */
public class DeptHandler extends Handler {
	/**
	 * @description 部门处理费用申请
	 * @author mutisitic
	 * @date 2018年9月7日
	 * @see com.mutistic.behavioral.chainofresponsibility.sturctrue.Handler#handleRequest()
	 */
	@Override
	public Object handleRequest(RequestModel model) {
		PrintUtil.two("DeptHandler.handleRequest()", "接受到请求");
		
		if(FeeRequestModel.FEE_TYPE.contentEquals(model.getType())) {
			PrintUtil.three("DeptHandler.handleRequest()", "本身的职责范围内的请求，开始处理处理");
			return handleFeeRequest(model);
		}
		return super.handleRequest(model);
	}

	/**
	 * @description 具体的处理内容
	 * @author mutisitic
	 * @date 2018年9月7日
	 * @param model
	 * @return
	 */
	private Object handleFeeRequest(RequestModel model) {
		FeeRequestModel fee  = (FeeRequestModel) model;
		if(fee.getFee() < 1000) {
			if(fee.getUser().equals("BBB")) {
				return "部门同意"+ fee.getUser() +"的费用申请，申请金额为："+ fee.getFee();
			} else {
				return "部门不同意"+ fee.getUser() +"的费用申请，申请金额为："+ fee.getFee();
			}
		} else if(this.successor != null){
			PrintUtil.three("DeptHandler.handleFeeRequest()", "非本身的职责范围内的请求，开始转发给后继职责对象处理");
			return this.successor.handleRequest(model);
		}
		
		return null;
	}
}
