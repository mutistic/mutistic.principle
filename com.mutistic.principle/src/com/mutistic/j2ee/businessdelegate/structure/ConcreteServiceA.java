package com.mutistic.j2ee.businessdelegate.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteService：
 * @description 具体的业务服务际业务实现逻辑的具体实现
 * @author mutisitic
 * @date 2018年9月13日
 */
public class ConcreteServiceA implements BusinessService {
	
	/**
	 * @description 可能存在业务功能的具体实现
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @see com.mutistic.j2ee.businessdelegate.structure.BusinessService#operation()
	 */
	@Override
	public void operation() {
		PrintUtil.three("ConcreteServiceB.operation()", "具体的业务服务，业务实现逻辑的具体实现");
	}

}
