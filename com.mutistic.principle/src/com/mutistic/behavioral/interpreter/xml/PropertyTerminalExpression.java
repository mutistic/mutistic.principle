package com.mutistic.behavioral.interpreter.xml;

import com.mutistic.utils.PrintUtil;

/**
 * @program TerminalExpression：终结符解释器 
 * @description 属性诸位终结符对应的解释器
 * @author mutisitic
 * @date 2018年9月4日
 */
public class PropertyTerminalExpression extends ReadXmlExpression {

	/**
	 * 属性名
	 */
	private String propName;
	/**
	 * 构造函数：设置属性名
	 * @param propName
	 */
	public PropertyTerminalExpression(String propName) {
		this.propName = propName;
	}
	
	/**
	 * @description 属性终结符解释器的具体解释操作
	 * @author mutisitic
	 * @date 2018年9月4日
	 * @param ctx
	 * @return
	 * @see com.mutistic.behavioral.interpreter.xml.ReadXmlExpression#interpret(com.mutistic.behavioral.interpreter.xml.Context)
	 */
	@Override
	public String[] interpret(Context ctx) {
		PrintUtil.two("PropertyTerminalExpression：属性终结符解释器的具体解释操作：获取具体的属性值：", propName);
		return new String[]{ctx.getPreEle().getAttribute(propName)};
	}

}
