package com.mutistic.j2ee.mvc.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Client：客户端
 * @description 演示 MVC 模式[MVC Pattern]-结构
 * @author mutisitic
 * @date 2018年9月13日
 */
public class Client {
	public static void main(String[] args) {
		PrintUtil.one("MVC 模式[MVC Pattern]-结构");
		
		// 创建模型对象
		Model model = new Model();
		// 创建视图对象
		View view = new View();
		// 创建控制器对象
		Controller controller = new Controller(model, view);
		
		// 调用控制器具体业务
		controller.updateModelName("AAA");
		controller.updateModelValue("111");
		controller.showView();
		PrintUtil.three("调用Controller获取Name属性值", controller.getModelName());
		PrintUtil.three("调用Controller获取Value属性值", controller.getModelValue());
	}
}
