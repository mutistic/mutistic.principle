package com.mutistic.j2ee.mvc.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program View：
 * @description 视图，是应用程序中处理数据显示的部分。通常视图是依据模型数据创建的
 * @author mutisitic
 * @date 2018年9月13日
 */
public class View {

	/**
	 * @description 示意：处理数据的显示 
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @param model
	 */
	public void showModel(String name, String value) {
		PrintUtil.three("View.showModel()：处理数据的显示 ", "Model [name=" + name + ", value=" + value + "]");
	}
	
}
