package com.mutistic.structural.adapter.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Existing：已经存在的接口，但与客户端要求的特定领域接口不一致，需要被适配目标 
 * @description 
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Existing {

	/**
	 * @description Existing的具体业务 
	 * @author mutisitic
	 * @date 2018年8月10日
	 */
	public void testExisting() {
		PrintUtil.printTwo("Existing-testExisting", "已经存在的接口，但与客户端要求的特定领域接口不一致，需要被适配目标 ");
	}
	
}
