package com.mutistic.j2ee.servicelocator.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program ConcreteService：
 * @description 具体服务，实现服务接口，处理请求的服务的具体实现
 * @author mutisitic
 * @date 2018年9月17日
 */
public class ConcreteServiceA implements Service {
	/**
	 * @description 获取服务名称
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @return 服务名称
	 * @see com.mutistic.j2ee.servicelocator.structure.Service#getName()
	 */
	@Override
	public String getName() {
		return "ConcreteServiceA";
	}
	
	/**
	 * @description 执行具体的请求
	 * @author mutisitic
	 * @date 2018年9月17日
	 * @see com.mutistic.j2ee.servicelocator.structure.Service#execute()
	 */
	public void execute() {
		PrintUtil.three("ConcreteServiceA.execute()", "执行具体的请求");
	}
}
