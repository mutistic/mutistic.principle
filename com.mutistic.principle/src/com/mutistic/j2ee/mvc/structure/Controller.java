package com.mutistic.j2ee.mvc.structure;

import com.mutistic.utils.PrintUtil;

/**
 * @program Controller：
 * @description 控制器，是应用程序中处理用户交互的部分。通常控制器负责从视图读取数据，控制用户输入，并向模型发送数据
 * @author mutisitic
 * @date 2018年9月13日
 */
public class Controller {

	/** 持有Model模型对象 */
	private Model model;
	/** 持有View视图对象*/
	private View view;
	/**
	 * 构造函数：注入Model和View对象
	 * @param model 模型对象
	 * @param view 视图对象
	 */
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		
		PrintUtil.two("Controller：构造函数：注入Model对象", model);
		PrintUtil.three("Controller：构造函数：注入View对象", view);
	}
	
	/**
	 * @description 获取Model的属性Name
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @return
	 */
	public String getModelName() {
		PrintUtil.two("Controller.getModelName()", "获取Model的属性Name");
		return model.getName();
	}
	
	/**
	 * @description 修改Model的属性Name
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @param name
	 */
	public void updateModelName(String name) {
		PrintUtil.two("Controller.updateModelName()", "修改Model的属性Name="+ name);
		model.setName(name);
	}

	/**
	 * @description 获取Model的属性Value
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @return
	 */
	public String getModelValue() {
		PrintUtil.two("Controller.getModelvalue()", "获取Model的属性Value");
		return model.getValue();
	}
	
	/**
	 * @description 修改Model的属性Value
	 * @author mutisitic
	 * @date 2018年9月13日
	 * @param value
	 */
	public void updateModelValue(String value) {
		PrintUtil.two("Controller.updateModelValue()", "修改Model的属性Value="+ value);
		model.setValue(value);
	}

	/**
	 * @description 显示Model数据信息 
	 * @author mutisitic
	 * @date 2018年9月13日
	 */
	public void showView() {
		PrintUtil.two("Controller.showView()", "显示Model数据信息，转调视图相应的方法");
		view.showModel(model.getName(), model.getValue());
	}
}
