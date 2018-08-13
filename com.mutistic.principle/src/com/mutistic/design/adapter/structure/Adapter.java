package com.mutistic.design.adapter.structure;

import com.mutistic.design.utils.PrintUtil;

/**
 * @program 适配器：核心类：(对象适配器) 
 * @description Adapter：适配器，把Existing适配成Client需要的Target，本身是实现或基层Target
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Adapter implements Target {

	/**
	 * 被适配目标类
	 */
	private Existing existing;
	/**
	 * 构造器（传入被适配目标实例）
	 * @param existing
	 */
	public Adapter(Existing existing) {
		super();
		this.existing = existing;
		PrintUtil.printTwo("Adapter(Existing)", "构造器（传入被适配目标Existing实例）");
	}

	/**
	 * @description Target特定领域的业务功能，根据Target类型是否重写
	 * @author mutisitic
	 * @date 2018年8月10日
	 * @see com.mutistic.design.adapter.structure.Target#test()
	 */
	@Override
	public void test() {
		PrintUtil.printTwo("Adapter-test()", "Target特定领域的业务功能，根据Target类型是否重写");
	}
	
	/**
	 * @description Existing接口功能，非必须项，根据实际需要是否添加
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public void testExisting() {
		PrintUtil.printTwo("Adapter-testExisting()", "Existing接口功能，非必须项，根据实际需要是否添加");
		
		this.existing.testExisting();
	}

}
